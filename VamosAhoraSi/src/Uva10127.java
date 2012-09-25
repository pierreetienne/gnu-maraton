import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


public class Uva10127 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] res = new int[10001];
		res[1]=3;
		
		BigInteger num = new BigInteger("11");
		for(int i=1;i<11000;++i){
			ArrayList<BigInteger> fact = fact(num);
			System.out.println(fact);
			num = new BigInteger(num.toString()+"");
		}
		
		for(String linea;(linea = bf.readLine())!= null;){
			int N = Integer.parseInt(linea.trim());
			sb.append(res[N]+"\n");
		}
		System.out.print(new String(sb));
	}

	static BigInteger dos = new BigInteger("2");
	
	static ArrayList<BigInteger> fact(BigInteger n )
	{
		ArrayList<BigInteger> fact = new ArrayList<BigInteger>();
		while(n.mod(dos).equals(BigInteger.ZERO)){
			n= n.divide(dos);
			fact.add(dos);
		}
		BigInteger j = new BigInteger("3");
		
		while(j.multiply(j).compareTo(n.add(BigInteger.ONE))>0){
			if(n.mod(j).equals(BigInteger.ZERO)){
				fact.add(j);
				n = n.divide(j);
			}else{
				j = j.add(dos);
			}
		}
		if(n.compareTo(BigInteger.ONE)>0)fact.add(n);
		return fact;
	}
}
