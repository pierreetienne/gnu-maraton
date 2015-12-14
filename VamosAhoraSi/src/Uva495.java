import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Uva495 {
	public static void main(String[] args) throws Exception{
		BigInteger[] res = new BigInteger[5001];
		res[0]=BigInteger.ZERO;
		res[1]=BigInteger.ONE;
		for(int i=2;i<res.length;++i)
			res[i]=res[i-1].add(res[i-2]);	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea.trim());
			sb.append("The Fibonacci number for "+N+" is "+res[N]+"\n");
		}
		System.out.print(new String(sb));
	}

}
