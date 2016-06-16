import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF651A {

	static int[][] memo;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			memo = new int[200][200];
			for(int i = 0;i<memo.length;++i)
				Arrays.fill(memo[i],-1);
			System.out.println(f(a,b));
		}
	}

	static int f(int a , int b ){
		if(a==0 || b==0){
			return 0;
		}
		if(a<0 || b < 0)
			return -1;
		if(memo[a][b]!=-1)
			return memo[a][b];
		return memo[a][b] = Math.max(f(a+1,b-2), f(a-2,b+1))+1;
	}
	
}
