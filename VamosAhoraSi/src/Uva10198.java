
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Uva10198 {

	static BigInteger[] memo = new BigInteger[1005]; 
	
	public static void main(String[] args) throws Exception {
		memo[0]= BigInteger.ONE;
		memo[1]= new BigInteger("2");
		memo[2] = new BigInteger("5");
		for(int i=3;i<memo.length;++i){
			memo[i]=memo[i-1].multiply(memo[1]).add(memo[i-2]).add(memo[i-3]);
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		while((linea= bf.readLine())!=null){
			int N = Integer.parseInt(linea);
			System.out.println(memo[N].toString());
		}
	}

	
	
}
