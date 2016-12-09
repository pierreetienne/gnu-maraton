import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class HackerRankFib {

	static Integer t1,t2,n;
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		t1 = Integer.parseInt(st.nextToken());
		t2 = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken())-2;
		
		BigInteger x = new BigInteger(t1+"");
		BigInteger y = new BigInteger(t2+"");
		BigInteger b = BigInteger.ZERO;
		while(n-->0){
			 BigInteger res = x.add(y.multiply(y));
			 b = res;
			 x = y;
			 y = res;
		}
		System.out.println(b);
	}
	
	

}
