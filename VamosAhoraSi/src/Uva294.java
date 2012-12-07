import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//NO 
public class Uva294 {
	public static void main(String[] args)throws Exception {
		int[] m = new int[40000000];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int max = 0;
			int index = 0;
			for(int i=S;i<=E;++i){
				int val = 0;
				if(val > max){max = val;index = i;}
			}
			sb.append("Between "+S+" and "+E+", "+index+" has a maximum of "+max+" divisors.\n");
		}
		System.out.print(new String(sb));
	}
}