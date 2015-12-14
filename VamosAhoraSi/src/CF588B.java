import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF588B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (String ln; (ln = in.readLine()) != null;) {
			Long num = Long.parseLong(ln);
			long sqr = (long) Math.sqrt(num);
			boolean islovely = isNumberLovely(num);

		}
	}

	private static boolean isNumberLovely(Long num) {
		double root = Math.floor(Math.sqrt((double) num));
		for (double i = root; i > 1; i--) {
			if (num % (root * root) == 0)
				return false;
		}
		return true;
	}

}

/*
 * 
 * 1000000000000
 */