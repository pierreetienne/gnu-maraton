import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11244 {
	
	static int[] dy={0,0,1,-1,1,-1,1,-1};
	static int[] dx={-1,1,0,0,1,-1,-1,1};
	public static void main(String[] args)throws Exception {
		BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int F  = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0 && C==0)break;
			char[][] m = new char[F][];
			for(int i=0;i<F;++i)
				m[i]=bf.readLine().toCharArray();
			int cont = 0;
			for(int i=0;i<m.length;++i){
				for(int j=0;j<m[i].length;++j){
					if(m[i][j]=='*'){
						boolean ok = true;
						for(int p = 0;p<dx.length&&ok;++p)
							if(i+dx[p]>=0 && i+dx[p]<m.length && j+dy[p]>=0 &&j+dy[p]<m[i].length && m[i+dx[p]][j+dy[p]]=='*' )
								ok=false;
						if(ok)cont++;
					}
				}
			}
			sb.append(cont+"\n");
		}
		System.out.print(new String(sb));
	}

}
