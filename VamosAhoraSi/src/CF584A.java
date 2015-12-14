import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CF584A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			BigInteger num = BigInteger.ONE.multiply(BigInteger.valueOf(10).pow(n-1));
			boolean x =!num.mod(BigInteger.valueOf(t)).equals(BigInteger.ZERO);
			while(x){
				num = num.add(BigInteger.ONE);
				x =!num.mod(BigInteger.valueOf(t)).equals(BigInteger.ZERO) ;
			}
			if(num.toString().length()<=n)
				System.out.println(num);
			else 
				System.out.println(-1);
		}

	}

}
