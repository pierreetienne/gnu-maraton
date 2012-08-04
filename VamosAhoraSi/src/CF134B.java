import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF134B {

	static int N ;
	static int f(int a , int b ){
		if(a==N|| b == N)return 0;
		int res ;
		if(a>b)
			res = f(a+b,b);
		else
			res = f(a,a+b);
		
		if(res == Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		else 
			return res+1;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea; (linea = bf.readLine())!= null;)
		{
			N = Integer.parseInt(linea);
			if(N>1)
				sb.append((f(1,1)-1)+"\n");
			else
				sb.append("0\n");
		}
		System.out.print(new String(sb));
	}

}
