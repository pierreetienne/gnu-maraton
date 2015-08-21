import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class CF527A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			BigInteger a = new BigInteger(st.nextToken());
			BigInteger b = new BigInteger(st.nextToken());
			BigInteger cont = BigInteger.ZERO;
			while(a.compareTo(BigInteger.ZERO)>0 && b.compareTo(BigInteger.ZERO)>0){
				if(a.compareTo(b)>0){
					cont  = cont.add(a.divide(b));
					a = a.mod(b);
				}else{
					cont  = cont.add(b.divide(a));	
					b = b.mod(a);
				}
				
			}
			System.out.println(cont);
		}
	}

}
