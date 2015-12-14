import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva562 {

	static int[] m;

	static int[][][] memo;

	static int f(int pos , int l, int x){
		if(memo[pos][l][x]!=-1)
			return memo[pos][l][x];
		if(pos<m.length)
			return memo[pos][l][x]= Math.min(f(pos+1, l+m[pos],x),f(pos+1, l, x+m[pos]));
		else
			return memo[pos][l][x]=Math.abs(l-x);
	}



	public static void main(String[] args) throws Exception{
		int val = 0;
		for(int i=1;i<=500;++i)
			val+=i;
		System.out.println(val);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		memo = new int[101][501][501];
		while(N-->0){
			for(int[][] x: memo)
				for(int[] y : x)
					Arrays.fill(y, -1);
			int C = Integer.parseInt(bf.readLine());
			StringTokenizer st = new StringTokenizer(bf.readLine());
			m = new int[C];
			for(int i=0;i<C;++i)
				m[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(m);
			int min = f(0, 0, 0);

			System.out.println(min);

		}
	}

}
