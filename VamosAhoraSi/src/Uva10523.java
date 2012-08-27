import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Uva10523 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken());
			BigInteger A = new BigInteger(st.nextToken());
			BigInteger res = BigInteger.ZERO;
			for(int i=1;i<=N;++i)
				res = res.add(new BigInteger(i+"").multiply(A.pow(i)));
			sb.append(res+"\n");
		}
		System.out.print(new String(sb));
	}
}
