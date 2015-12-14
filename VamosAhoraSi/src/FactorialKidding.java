
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FactorialKidding {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		while((linea = bf.readLine())!= null){
			long a = Long.parseLong(linea);
			if(a >= 14 ){
				System.out.println("Overflow!");
			}else if (a==0 ){
				System.out.println("Underflow!");
			}else if( a<0 && ((-1)*a)%2==0){
				System.out.println("Underflow!");
			}else if(a<0 && ((-1)*a)%2!=0){
				System.out.println("Overflow!");
			}else{
				a = fact(a);
				if(a < 10000)
					System.out.println("Underflow!");
				else
					System.out.println(a);
			}
		}
	}
	
	public static long fact(long n ){
		if(n==1)
			return n;
		else
			return n*fact(n-1);
	}

}
