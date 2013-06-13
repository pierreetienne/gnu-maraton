import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;


public class unicycles {
	static int[] d;
	static Set<Integer> dist;
	static int[][]memo;
	static int M ;
	static int f(int p,int t , int C){
		
		
		for(int i=1;i<100;++i){
			
		}
		
		return 0;
	}

	
	static int M(int i, int t){
		int A = 0;
		boolean entre =true;
		while(entre){
			entre = false;
			for(int j=i+1;j<d.length;++j){
					if(d[i]+t==d[j]){
						A|=1<<j;
						i=j;
						entre=true;
					}
					if(d[j]>d[i]+t)
						return 0;
			}
			if(d[i]+t<M &&!entre)return 0;
		}
		return A;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		memo = new int[11][1<<11];
		for(String ln;(ln=in.readLine())!=null;){
			for(int i=0;i<memo.length;++i)
				Arrays.fill(memo[i], -1);
			StringTokenizer st = new StringTokenizer(ln);
			M = Integer.parseInt(st.nextToken())-1; int  N = Integer.parseInt(st.nextToken());
			d=new int[N];
			for(int i=0;i<N;++i)
				d[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(d);
			System.out.println(Integer.toBinaryString(M(0,2)));
		}
	}

}
