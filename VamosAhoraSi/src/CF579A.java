import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF579A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			long n = Long.parseLong(ln);
			System.out.println(Long.toBinaryString(n));
			long res =(long) Math.floor( Math.log(n)/Math.log(2));
			System.out.println(res);
		}

	}

}
