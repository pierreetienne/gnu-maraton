import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva12518 {

	static int[][] m;
	
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			if(N==0)break;
			m = new int[N][];
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				m[i]=new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			}
			N = Integer.parseInt(bf.readLine());
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int posx = Integer.parseInt(st.nextToken());
				int posy = Integer.parseInt(st.nextToken());
				int[] r  = darPosicionEnM(posx);
				if(r[0] == -2 ){sb.append(".\n"); }
				else{
					System.out.println("+++Val " + r[1]);
					switch (m[r[0]][0]) {
					case 0:
						
						break;
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						
						break;
					case 6:
						
						break;
					case 7:
						
						break;
					case 8:
						
						break;
					case 9:
						
						break;
					default:
						break;
					}
					System.out.println("Posicion Del Numero :"+ m[r[0]][0]);
				}
				
			}
		}
		System.out.print(new String(sb));
	}
	
	static int[] darPosicionEnM(int x){
		int cont = -1, ant = 0;
		
		for(int i=0;i<m.length;++i){
			cont += m[i][1]+2;
			if(cont>=x)return new int[]{i,cont-ant};
			cont++;
			if(x == cont)
				return new int[]{-2};
			ant=cont;
		}
		return new int[]{-2};
	}

}
