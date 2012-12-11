import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Uva357 {

	static int[] m;
	
	static int[] opc = {1,5,10,25,50};
	
	static int N ;
	
	static int[][] memo;
	
	static int f(int n, int pos)
	{
		if(n==N)
			return 1;
		else if(n < N  &&pos < opc.length &&memo[n][pos]!=-1)return memo[n][pos];
		else if (n < N &&pos < opc.length)
			return memo[n][pos]=(f(n+opc[pos], pos) + f(n, pos+1));
		return 0;
	}
	
	public static void main(String[] args) throws Exception 
	{
		m = new int[30001];
		Arrays.fill(m,-1);
		memo = new int[30006][6];
		for(int i=0;i<m.length;++i){
			N=i;
		//	memo = new int[i][6];
			for(int j=0;j<i;++j)Arrays.fill(memo[j], -1);
			System.out.println(i);
			m[i]=f(0,0);
			System.out.println(m[i] +  "  " + i);
		}
		
		System.out.println("---");
//		m[0]=0;
//		m[1]=1;
//		m[2]=1;
//		m[3]=1;
//		m[4]=1;
//		N=30000;
//		System.out.println(f(0,0));
//		
//		m[5]=2;
//		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			
		}
	}

}
