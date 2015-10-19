import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF579A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			System.out.println(Long.bitCount(Long.parseLong(ln)));
		}
	}
}