import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;


public class CF514A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<ln.length();++i){
				int num = ((int) Math.min(ln.charAt(i)-'0', 9-(ln.charAt(i)-'0') ));
				if(num==0 && i==0)
					sb.append(9 );
				else
					sb.append(num );
			}
			BigInteger b = new BigInteger(new String(sb));
			if(b.equals(BigInteger.ZERO))
				System.out.println(9);
			else
				System.out.println(b);
		}
	}
}
