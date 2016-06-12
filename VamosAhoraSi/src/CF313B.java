import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF313B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			char[] m = ln.toCharArray();
			StringBuilder sb = new StringBuilder();
			int[] dp = new int[m.length+1];
			for(int i=1;i<m.length;++i){
				dp[i]= dp[i-1]+((m[i-1]==m[i])?1:0);
			}
			int cases=Integer.parseInt(in.readLine());
			for(int i=0;i<cases;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int li = Integer.parseInt(st.nextToken())-1;
				int ri = Integer.parseInt(st.nextToken())-1;
				sb.append((dp[ri]-dp[li])+"\n");
			}
			System.out.print(new String(sb));
		}
	}

}
