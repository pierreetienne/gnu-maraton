import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF489B {

	
	static int[][] memo;
	static int[] h, w;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			memo=new int[101][101];
			for(int i=0;i<memo.length;++i)
				Arrays.fill(memo[i], -1);
			int n = Integer.parseInt(ln);
			h = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				h[i]=Integer.parseInt(st.nextToken());
			}
			int m = Integer.parseInt(in.readLine());
			st = new StringTokenizer(in.readLine());
			w = new int[m];
			for(int i=0;i<m;++i){
				w[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(h);
			Arrays.sort(w);
			System.out.println(f(0,0));
		}

	}
	
	
	static int f(int i, int j){
		if(i>=h.length || j>=w.length)
			return 0;
		if(memo[i][j]!=-1)
			return memo[i][j];
		int val = 0;
		if(Math.abs(h[i]-w[j])<=1)
			val = f(i+1,j+1)+1;
		val=Math.max( Math.max(f(i+1,j), f(i,j+1)),val);
		return memo[i][j]=val;
	}




}
