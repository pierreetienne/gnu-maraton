import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//Accepted
public class Uva11015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			if(N == 0 && M == 0 )break;
			String[] nombres = new String[N];
			for(int i = 0;i<N;++i)nombres[i]=bf.readLine();
			int[][] mAdy = new int[N][N];
			for(int i=0;i<N;++i)Arrays.fill(mAdy[i],2000);
			for(int i=0;i<N;++i)mAdy[i][i]=0;
			for(int i=0;i<M;++i){
				st = new StringTokenizer(bf.readLine());
				int q = Integer.parseInt(st.nextToken())-1 , w = Integer.parseInt(st.nextToken())-1 , e = Integer.parseInt(st.nextToken()); 
				mAdy[q][w]=e;
				mAdy[w][q]=e;
			}
			mAdy  = floydWarshall(mAdy);
			
			int indexMin = 0;
			int min = Integer.MAX_VALUE;
			for(int i=0;i<N;++i){
				int suma =0 ;
				for(int j=0;j<N;++j){
					suma+=mAdy[i][j];
				}
				if(suma< min ){
					min = suma;
					indexMin = i;
				}
			}
			sb.append("Case #"+caso+++" : "+nombres[indexMin]+"\n");
		}
		System.out.print(new String(sb));
	}

	static int[][] floydWarshall(int[][] mAdy) {
		int n=mAdy.length; int x[][]=new int[n][n];
		for (int i=0; i<n; i++) System.arraycopy(mAdy[i],0,x[i],0,n);
		for (int k=0; k<n; k++) for (int i=0; i<n; i++) for (int j=0; j<n; j++)
			x[i][j]=Math.min(x[i][j],x[i][k]+x[k][j]);
		return x;
	}
}
