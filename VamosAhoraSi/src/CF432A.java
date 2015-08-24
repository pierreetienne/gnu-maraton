import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF432A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] memo = new int[n];
			st = new StringTokenizer(in.readLine());
			int count = 0;
			for(int i=0;i<n;++i){
				memo[i]=Integer.parseInt(st.nextToken());
				if(memo[i]+k<=5){
					count++;
				}
			}
			System.out.println((int)Math.floor(count/3));
			
		}
	}

}
