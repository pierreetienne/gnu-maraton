import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF327A {

	static int[] m;
	static int[] sums;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			m = new int[N];
			sums = new int[N+2];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
				if(i==0)
					sums[i+1]=m[i];
				else
					sums[i+1]= sums[i]+m[i];
			}
			sums[sums.length-1]= sums[m.length];
			int max = 0;
			for(int i=0;i<m.length;++i){
				for(int j=i;j<m.length;++j){
					max = Math.max(max, f(i+1,j+1));
				}
			}
			System.out.println(max);
		}

	}

	static int f(int i, int j){
		int diff = sums[j]-sums[i-1];
		int dis = Math.abs(j-i)+1;
		int s =  sums[sums.length-1]-diff+(dis-diff);
		return s;
	}

}
