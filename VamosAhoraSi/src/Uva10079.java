

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Uva10079 {

	
	static long[] memo ;
	
	static long f(long n ){
		if(n < memo.length && memo[(int) n]!= -1)
			return memo[(int) n];
		long r = 1;
		for(long i = 1 ; i<= n ;++i)
			r+=i;
		
		if(n<memo.length)
			memo[(int) n]= r;
		return r;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		memo = new long[15000000];
		Arrays.fill(memo, -1);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(C>=0){
			sb.append(f(C)+"\n");
			C = Integer.parseInt(bf.readLine());
		}
		System.out.print(new String(sb));
		
	}

}
