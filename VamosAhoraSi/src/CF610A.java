import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF610A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			long n = Long.parseLong(ln);
			long res = 0;
			if(n>=6){
				int a = 1;
				int b = 1;
				int c = (int) (( n - 2) /2);
				int d = c;
				if(a + b + c+ d == n){
					res = (long) Math.ceil((c-a)/2.);
				}
			}
			System.out.println(res);
		}
	}
}
