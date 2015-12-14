import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//pasoooo
public class Uva10494 {


	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea; (linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			BigInteger a = new BigInteger(st.nextToken());
			String sig = st.nextToken();
			BigInteger b = new BigInteger(st.nextToken());
			if(sig.trim().equals("/"))
				sb.append((a.divide(b))+"\n");
			else 
				sb.append((a.mod(b))+"\n");
		}
		System.out.print(new String(sb));
	}

}
