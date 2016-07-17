import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF688B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringBuilder sb = new StringBuilder(ln);
			sb.append(new StringBuilder(ln).reverse());
			System.out.println(new String(sb));
		}

	}

}
