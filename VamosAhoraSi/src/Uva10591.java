

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//Accepted
public class Uva10591 {

	
	static long n;
	
	static int[] memo ;
	
	static int f(){
		if(n==0||n==1) return (int) n;
		
		String num = n +"";
		boolean x[] = new boolean[800];
		while( true)
		{
			long suma = 0 ;
			for(int i=0;i<num.length();++i)
				suma += (num.charAt(i)-'0')*(num.charAt(i)-'0');
			if(suma < memo.length && memo[(int) suma]!=-1)return memo[(int) suma];
			if(suma== 1){
				if(suma<memo.length)
					memo[(int) suma]=1;
				return 1;
			}
			if(suma == n ){
				if(suma<memo.length)
					memo[(int) suma]=0;
				return 0;
			}
			if(x[(int) suma])
				return 1;
			
			x[(int) suma]=true;
			num = suma+"";
		}
	}
	
	public static void main(String[] args)throws Exception {
		memo = new int[1000000];
		Arrays.fill(memo, -1);
		for(int i=0;i<memo.length;++i){
			n=i;f();
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(bf.readLine()), casos = 1;
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			n = Long.parseLong(bf.readLine());
			sb.append("Case #"+(casos++)+ ": " + n +" " +((f()==1)?"is a Happy number.":"is an Unhappy number.")+"\n");
		}
		System.out.print(new String(sb));
	}

}
