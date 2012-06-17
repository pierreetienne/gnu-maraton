

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class FindingSeats{
	public static String []matriz;
	public static int k;
	public static int menorArea;
	public static int[][] memo;
	public static void main( String ... strings  ) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		while( !(R==0 && C==0 && k==0) ){
			matriz = new String[R];
			memo = new int[R+1][C+1];
			for(int i=0;i<R;++i)
				for(int j=0;j<C;++j)
					memo[i][j]=-1;
			menorArea = Integer.MAX_VALUE;
			for(int i = 0; i<R; i++)
				matriz[i]=bf.readLine();

			memo[0][0]=(matriz[0].charAt(0)=='.')?1:0;
			for(int i=1;i<matriz[0].length();++i)
				memo[0][i]=memo[0][i-1]+((matriz[0].charAt(i)=='.')?1:0);
			
			for(int i=1;i<matriz.length;++i)
				memo[i][0]=memo[i-1][0]+((matriz[i].charAt(0)=='.')?1:0);
		
			for(int i=1;i<R;++i){
				for(int j=1;j<matriz[i].length();++j){
					memo[i][j]= (memo[i-1][j]+memo[i][j-1]-memo[i-1][j-1])+((matriz[i].charAt(j)=='.')?1:0);
				}
			}
			
			//c(R-1,C-1);
			for(int i =0 ; i < R; ++i)
				for(int j = 0; j< C ; ++j){
					busquedaSillas(i, j);
				}
			System.out.println(menorArea);
			st = new StringTokenizer(bf.readLine());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
		}
	}
	public static void busquedaSillas( int a, int b )
	{
		int i = matriz.length-1;
		int j = b;
		int area;
		while( i>=0 && j< matriz[0].length() ){
			int minj = Math.min(b,j);
			int maxj = Math.max(b,j);
			int maxi = Math.max(a,i);
			int mini = Math.min(a,i);
			int d = D(mini,minj,maxi,maxj);
			if(d >= k ){
				area = Math.abs( ((maxi+1)-mini) * ((maxj+1)-minj) );
				if(area < menorArea){
					menorArea = area;
				}
				i--;
			}	
			else
				j++;
		}
	}
	public static int D( int a, int b, int i, int j ){
		return memo[i][j]-(a>0?memo[a-1][j]:0)-(b>0?memo[i][b-1]:0)+(a>0&&b>0?memo[a-1][b-1]:0);
	}
	public static int c(int i , int j){
		if(memo[i][j]!=-1)
			return memo[i][j];
		int res = 0;
		if(i==0 && j==0)
			res = I(i,j);
		else if(i==0)
			res = c(i,j-1)+I(i,j);
		else if(j==0)
			res = c(i-1,j)+I(i,j);
		else
			res =c(i-1,j) + c(i,j-1) - c(i-1,j-1) + I(i,j);
		memo[i][j]=res;
		return memo[i][j];
	}
	public static int I(int i, int j){
		return matriz[i].charAt(j) == '.' ? 1 : 0;
	}	
}
