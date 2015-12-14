import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Uva10551 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			if(a==0)break;
			String b = (st.nextToken());
			String c = (st.nextToken());
			BigInteger ba = new BigInteger(b,a);
			BigInteger ca = new BigInteger(c,a);
			sb.append(ba.mod(ca).toString(a));
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
