import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF455A {

	static long[] vec;
	static long[] memo ;
	public static void main(String[] args)throws Exception  {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			memo = new long[N+5];
			Arrays.fill(memo,-1);
			vec = new long[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				vec[i]=Integer.parseInt(st.nextToken());
			}
			System.out.println(f(0));
		}
	}
	
	static long f(int actual ){
		if(actual>=vec.length)return 0;
		if(memo[actual]!=-1)
			return memo[actual];
		return memo[actual]=Math.max(f(actual+2)+vec[actual], f(actual+1));
	}

}
