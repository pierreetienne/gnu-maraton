import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Uva10303 {

	static BigInteger[] num ; 
	
	static BigInteger[] values;
	public static void main(String[] args)throws Exception {
		num = new BigInteger[2100];
		num[0]=num[1]=BigInteger.ONE;
		for(int i=2;i<num.length;++i)	num[i]=num[i-1].multiply(new BigInteger(i+""));
		
		values = new BigInteger[1001];
		values[0]=values[1]=BigInteger.ONE;
		for(int i=2;i<values.length;++i)
			values[i] = num[i*2].divide(num[i+1].multiply(num[i]));
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;)	sb.append(values[Integer.parseInt(linea.trim())]+"\n");
		System.out.print(new String(sb));
	}
	
}
