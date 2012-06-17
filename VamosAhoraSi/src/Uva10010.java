

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Accepted
public class Uva10010 {

	static char[][] m;
	
	static char[] palabra ;

	static int[] dx = new int[]{1,-1,1,-1,0,0,-1,1};
	
	static int[] dy = new int[]{1,-1,0,0,1,-1,1,-1};
	
	static int[] posicionPalabra() throws Exception{
		for(int i=0;i<m.length;++i){
			for(int j=0;j<m[i].length;++j){
				if(m[i][j]==palabra[0]){
					for( int d = 0;d<dx.length;++d)
						if(estaPalabra(i, j, 0, d))
							return new int[]{i+1,j+1};
				}
			}
		}
		throw new Exception();
	}
	
	
	static boolean estaPalabra(int i, int j, int p, int direccion){
		if(i >= 0 && j>= 0 &&i < m.length && j < m[i].length  ){
			if(p==palabra.length-1)return m[i][j]==palabra[p];
			if(m[i][j]==palabra[p])return estaPalabra(i+dx[direccion], j+dy[direccion], p+1, direccion);
		}
		return false;
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine().trim());
		StringBuilder sb = new StringBuilder();
		//in.readLine();
		while(N-->0){
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine().trim());
			int A = Integer.parseInt(st.nextToken().trim()), B = Integer.parseInt(st.nextToken().trim());
			m = new char[A][B];
			for(int i=0;i<A;++i)m[i]=in.readLine().toLowerCase().toCharArray();
			int pala = Integer.parseInt(in.readLine().trim());
			for(int i=0;i<pala;++i){
				palabra = in.readLine().trim().toLowerCase().toCharArray();
				int[] rs = posicionPalabra();
				sb.append((rs[0])+" " +(rs[1]) +"\n");
			}
			sb.append((N>0)?"\n":"");
		}
		System.out.print(new String(sb));
	}

}
