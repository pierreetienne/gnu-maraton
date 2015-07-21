import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF268A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[][] values = new int[N][];
			int[] countColorH = new int[101];
			int[] countColorG = new int[101];
			int cont =0;
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				values[i]= new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
				countColorH[values[i][0]]++;
				countColorG[values[i][1]]++;
			}
			//O(C) C -> cantidad de colores 
			for(int i=1;i<countColorH.length;++i){
				if(countColorH[i]>0 && countColorG[i]>0)
					cont+=(countColorH[i]*countColorG[i]);
			}
//			O(N*N) --> simulacion de todos los encuentros
//			for(int i=0;i<N;++i){//host
//				for(int j=0;j<N;++j){//guest
//					if(j!=i){
//						if(values[i][0]==values[j][1])
//							cont++;
//					}
//				}
//			}
			System.out.println(cont);
		}

	}

}
