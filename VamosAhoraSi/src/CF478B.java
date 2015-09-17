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
				long div = n/2;
				long res = n%2;
				long size = 2;
				if(res>0&&div>1)
					size++;
				
				long value =0;
				if(div>=m){
					size+=(div-m)*2;
					value =  f(size-1)+((n-size)/2);
					max = Math.max(max, value);
					min = Math.min(min, value);
				}else{
					
					System.out.println("m " + m +  " div " + div );
					long diff = (m-div>=0?m-div:0);
					value = f(1)*(div-diff);
					max = Math.max(max, value);
					min = Math.min(min, value);
				}
				
				
				
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
