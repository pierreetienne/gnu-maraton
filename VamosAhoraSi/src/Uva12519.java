import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva12519 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken()), B= Integer.parseInt(st.nextToken());
			if(N ==0 && B == 0) break;
			int[][] mAdy = new int[N][N];
			for(int i=0;i<N;++i){Arrays.fill(mAdy[i],Integer.MAX_VALUE/2);}
			for(int i=0;i<B;++i){
				st = new StringTokenizer(bf.readLine());
				int a =Integer.parseInt(st.nextToken())-1 , b =  Integer.parseInt(st.nextToken())-1 , costo = Integer.parseInt(st.nextToken());
				mAdy[a][b]=costo;
				mAdy[b][a]=-costo;
			}
			mAdy = floydWarshall(mAdy);
			if(mAdy[0][0]>=0)sb.append("N\n");
			else sb.append("Y\n");
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
