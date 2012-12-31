
public class Uva10104 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(gcd(1000000000,1000000000));

	}

	static long gcd(long a, long b) {long t; while (b!=0) {t=b; b=a%b; a=t;} return a;}
}
