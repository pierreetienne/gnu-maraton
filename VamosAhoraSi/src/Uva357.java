import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Accepted
public class Uva357 {

	static int[] opc = {1,5,10,25,50};
	
	static long[][] memo;
	
	static long f(int n, int pos)
	{
		if(n==0)return 1;
		if(n<0)return 0;
		if(pos>=opc.length)return 0;
		if(memo[n][pos]!=-1)return memo[n][pos];
		return memo[n][pos]=f(n-opc[pos], pos)+f(n, pos+1);
	}
	
	public static void main(String[] args) throws Exception 
	{
		memo = new long[30001][opc.length+1];
		for(int i=0;i<memo.length;++i)Arrays.fill(memo[i], -1);
		for(int i=0;i<memo.length;++i)f(i,0);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			long r = f(N,0);
			if(r==1)sb.append("There is only 1 way to produce "+N+" cents change.\n");
			else sb.append("There are "+r+" ways to produce "+N+" cents change.\n");
		}
		System.out.print(new String(sb));
	}

}
