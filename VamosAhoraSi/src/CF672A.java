import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF672A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			String x = "";
			for(int i=1;x.length()<=n;++i)
				x = x+i+"";
			System.out.println(x.charAt(n-1));
		}

	}

}
