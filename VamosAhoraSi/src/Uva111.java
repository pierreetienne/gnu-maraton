import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Uva111 {

	public static int[] order,real,arr;
	public static int N ;
	public static int[][] memo;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		order = new int[N];
		real = new int[N];
		memo = new int[N+1][N+1];
		for(int i=0;i<N;++i){
			int val = Integer.parseInt(st.nextToken())-1;
			order[val] = i;
			real[i]=val;
		}
		for(String ln;(ln=in.readLine())!=null;){
			for(int[] m : memo)
				Arrays.fill(m, -1);
			arr = new int[N];
			st = new StringTokenizer(ln);
			for(int i=0;i<N;++i){
				int val = Integer.parseInt(st.nextToken())-1;
				arr[val]=i;
			}
			real = order;
			System.out.println(f(0,0));
		}
	}
	
	static int f(int a, int b){
		if(a>=N || b>=N)return 0;
		if(memo[a][b]!=-1)return memo[a][b];
		if(arr[a]==real[b])return memo[a][b]= 1+f(a+1,b+1);
		return memo[a][b]=Math.max(f(a+1,b),Math.max(f(a+1,b+1),f(a,b+1)));
	}
	

}
