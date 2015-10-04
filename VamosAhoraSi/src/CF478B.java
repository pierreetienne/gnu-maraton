import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF478B {
	static long max;
	static long min;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken());
			long m = Long.parseLong(st.nextToken());
			max = 0;
			min = Long.MAX_VALUE;

			if(m == 1){
				max = min = f(n-1);
			}else if(m==n){
				max=min=0;
			}else{
				long value =0;
				value =0;
				long x = (long) Math.floor(Double.parseDouble(n+"") / Double.parseDouble(m+""));
				long xx = (long) Math.floor(Double.parseDouble(n+"") % Double.parseDouble(m+""));
				value  = ((xx)*f(x))+ (m-xx)*f(x-1);
				long y =(xx)*(x);
				y = y +(m-xx)*(x);
				//value-= f(n-y-1);
				
				max = Math.max(max, value);
				min = Math.min(min, value);

				value = f(n-(m-1)-1);
				max = Math.max(max, value);
				min = Math.min(min, value);
			}
			System.out.println(min+" " + max);
		}
	}
	static long f(long num ){
		long v = (num*(num+1))/2;
		return v;
	}
}
