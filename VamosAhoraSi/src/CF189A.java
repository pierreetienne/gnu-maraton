import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF189A {

	static int a, b, c;
	static int[] memo;
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			memo = new int[4001];
			Arrays.fill(memo, -1);
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			System.out.println(f(n));
		}
	}
	static int f(int n ){
		if(n<0)
			return -1;
		if(n==0)
			return 0;
		
		if(memo[n]!=-1)
			return memo[n];
		int val1 = f(n-a);
		int val2 = f(n-b);
		int val3 = f(n-c);
		int max = Math.max(val1, Math.max(val2, val3));
		if(max>=0)
			return memo[n]=max+1;
		else 
			return memo[n]=-2;
	}
}
