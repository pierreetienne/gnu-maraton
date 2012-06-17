
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva108 {
	
	public static int[][] memo;
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String l = null;
		while((l = bf.readLine())!= null){
			int N = Integer.parseInt(l);
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int m[][] = new int[N][N];
			for(int i=0;i<N;++i){
				for(int j=0;j<N;++j){
					if(!st.hasMoreTokens()) st = new StringTokenizer(bf.readLine());
					m[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			int max = Integer.MIN_VALUE;
			memo = new int[N][N];memo[0][0]=m[0][0];
			for(int i=1;i<N;++i){
				memo[i][0]=memo[i-1][0]+m[i][0];
				memo[0][i]=memo[0][i-1]+m[0][i];
				max = Math.max(Math.max(memo[i][0],memo[0][i]),max);
			}
			
			for(int i=1;i<N;++i){
				for(int j =1;j<N;++j)
					memo[i][j]=memo[i-1][j]+memo[i][j-1]+m[i][j]-memo[i-1][j-1];
			}
			
			for(int i=0;i<N;++i){
				for(int j=0;j<N;++j){
					for(int p=i;p<N;++p){
						for(int q = j+1;q<N;++q){
							int val = suma(i, j, p , q);
							max = val > max ? val :max;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
	
	
	public static int suma(int i, int j , int p , int q){
		if(j==0&&i>0)return memo[p][q]-memo[i-1][q];
		if(i==0&&j>0)return memo[p][q]-memo[p][j-1];
		if(i==0&&j==0)return memo[p][q];
		return memo[p][q]-memo[i-1][q]-memo[p][j-1]+memo[i-1][j-1];
	}
}
