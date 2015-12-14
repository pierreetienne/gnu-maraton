import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Uva674 {

	static int[] mon = new int[]{50,25,10,5,1};
	static long[][] memo ;
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		memo= new long[7500][6];
		for(long x[]:memo)Arrays.fill(x, -1);
		long[] m = new long[7500];
		for(int i=0;i<m.length;++i)
			m[i]=f(i, 0);
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			//sb.append(f(N, 0)+"\n");
			sb.append(m[N]+"\n");
		}
		System.out.print(new String(sb));
	}
	static long f(int N, int i){
		if(N==0)return 1;
		if(N<0)return 0;
		if(i>=mon.length)return 0;
		if(memo[N][i]!=-1)return memo[N][i];
		memo[N][i]=f(N-mon[i],i)+f(N,i+1);
		return memo[N][i];
	}
}
