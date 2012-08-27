import java.io.InputStreamReader;

import java.io.BufferedReader;


public class Uva10235 {

	public static void main(String[] args)throws Exception {
		boolean[] primos = new boolean[1000005];
		primos[0]=primos[1]=true;
		for(int i=2;i*i<primos.length;++i)
			for(int j=i*i;j<primos.length;j+=i)
				primos[j]=true;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea ;(linea = bf.readLine())!= null;){
			int n = Integer.parseInt(linea.trim());
			StringBuilder  s = new StringBuilder(n+"");
			if(!primos[n]){
				String x = s.reverse().toString();
				if(!primos[Integer.parseInt(x)] && Integer.parseInt(x)!= n )
					sb.append(n+" is emirp.\n");
				else
					sb.append(n+" is prime.\n");
			}
			else
				sb.append(n+" is not prime.\n");
		}
		System.out.print(new String(sb));
	}

}
