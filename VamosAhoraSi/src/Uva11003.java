

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Uva11003 {


	static int[][] m;
	static int[][] memo ;
	static int f(int i, int j ){
		if(i<m.length){
			if( j< Integer.MAX_VALUE&& memo[i][j]!=-1)return memo[i][j];
			if(m[i][0]<=j){
				if(j==Integer.MAX_VALUE)
					return Math.max(f(i+1,j),f(i+1,Math.min(m[i][1], j-m[i][0]))+1);
				else
					memo[i][j]= Math.max(f(i+1,j),f(i+1,Math.min(m[i][1], j-m[i][0]))+1);
			}
			else
				memo[i][j]= f(i+1,j);
		
			return memo[i][j]; 
		}
		return 0;
	}
	
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		while(N!=0){
			 m = new int[N][2];
			 memo = new int[1001][3001];
			 for(int x[]: memo)Arrays.fill(x, -1);
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				m[i][0]=Integer.parseInt(st.nextToken());
				m[i][1]=Integer.parseInt(st.nextToken());
			}
			sb.append(f(0,Integer.MAX_VALUE)+"\n");
			N = Integer.parseInt(in.readLine());
		}
		System.out.print(new String(sb));
		
	}

}
