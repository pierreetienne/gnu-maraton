

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//Accepted
public class Uva10579 {

	static BigInteger TWO = new BigInteger("2");
	
	static BigInteger[] memo ;
	
	public static BigInteger fib(BigInteger n){
		if(n.equals(BigInteger.ONE)|| n.equals(TWO))return 	BigInteger.ONE;
		if(memo[n.intValue()]!= null)return memo[n.intValue()];
		return memo[n.intValue()] = fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(TWO)));
	}
	public static void main(String[] args)throws Exception {
		
		memo = new BigInteger[5000];
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea; (linea = bf.readLine())!= null;){
			sb.append(fib( new BigInteger(linea))+"\n");
		}
		System.out.print(new String(sb));
	}

}
