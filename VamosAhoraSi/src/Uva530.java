import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Uva530 {

	public static void main(String[] args) throws Exception{
		BigInteger[] factorial = new BigInteger[15000];
		factorial[0]=factorial[1]=BigInteger.ONE;
		for(int i=2;i<factorial.length;++i){
			factorial[i]=factorial[i-1].multiply(BigInteger.valueOf(i));
		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea ; (linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0)return;
			try{
			System.out.println(factorial[a].divide(factorial[b].multiply(factorial[a-b])));
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("0");
				return;
			}
			
		}
	}

}
