import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CF134B {

	static int[] memofib;
	
	static int fib(int n ){
		if(n == 0 || n == 1)return n;
		if(memofib[n]!=-1)return memofib[n];
		return memofib[n] = fib(n-1)+fib(n-2);
	}
	
	
	public static void main(String[] args)throws Exception {
		memofib = new int[1000003];
		Arrays.fill(memofib,-1);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			
			System.out.println(fib(N+2));
			
			
		}
		System.out.print(new String(sb));
	}

}
