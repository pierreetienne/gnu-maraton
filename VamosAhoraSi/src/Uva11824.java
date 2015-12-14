import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Uva11824 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BigInteger total = BigInteger.ONE;
		int cont = 1;
		for(String linea;(linea=bf.readLine())!= null;)
		{
			int N = Integer.parseInt(linea.trim());
			if(N ==0){
				System.out.println(total);
				total = BigInteger.ONE;
				cont=0;
			}
			else
			{
				total = total.add(new BigInteger("2").multiply(new BigInteger(N+"").pow(cont)));
				cont++;
			}
		}
	}

}
