

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Accepted
public class Uva11332 {

	
	static int f(int n ){
		if(n< 10 )return n;
		
		return f( suma(n) );
	}
	
	static int suma(int n ){
		int suma = 0;
		String num = n+"";
		for(int i=0;i<num.length();++i){
			suma += Integer.parseInt(num.charAt(i)+"");
		}
		return suma;
	}
	
	public static void main(String[] args) throws Exception {
		int[] m = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(bf.readLine().trim());
		while(C!=0){
			sb.append(m[suma(C)]+"\n");
			C = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}
}
