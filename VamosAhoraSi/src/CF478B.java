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

				if(div<m){
					div= (Math.abs(div-m))-div;
					System.out.println("grupos de dos que puedo hacer : " + div);
					long value = f(1)*div;
					max = Math.max(max, value);
					min = Math.min(min, value);
				}else if(div == m){
					long value = f(1)*div;
					max = Math.max(max, value);
					min = Math.min(min, value);
				}else{
					long cantDeMas = (long) Math.abs(div-m);
					cantDeMas=(cantDeMas+1)*2;
					long value = f(cantDeMas-1);
					max = Math.max(max, value);
					min = Math.min(min, value);
				}


				long value = f(n-(m-1)-1);
				max = Math.max(max, value);
				min = Math.min(min, value);
			}



			System.out.println(min+" " + max);

		}
	}

	static void a(long n , long m , long aux ){
		long div = (long) Math.floor(n / m);
		long res = n%m;
		if(res==0){
			long value = f((div)-1)*m;
			if(div<aux)
				value--;

			max = Math.max(max, value);
			min = Math.min(min, value);
		}else{
			long value = (f(m-1)*div);
			max = Math.max(max, value);
			min = Math.min(min, value);
		}
	}

	static long f(long num ){
		long v = (num*(num+1))/2;
		return v;
	}
}
