import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class CF591A {

	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			double l = Double.parseDouble(ln);
			double p = Double.parseDouble(in.readLine());
			double q = Double.parseDouble(in.readLine());
			double x = (p*l)/(p+q);
			System.out.printf(Locale.US,"%.4f", x);
		}
	}
}
