import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Uva10814 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			BigInteger a = new BigInteger(st.nextToken());
			st.nextElement();
			BigInteger b = new BigInteger(st.nextToken());
			BigInteger gcd = a.gcd(b);
			sb.append(a.divide(gcd)+" / "+b.divide(gcd)+"\n");
		}
		System.out.print(new String(sb));
	}

}
