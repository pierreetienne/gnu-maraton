import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva11461 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		int[] num = new int[100001];
		num[1]=1;
		for(int i=2;i<num.length;++i){
			double x = Math.sqrt(i);
			int v = (int) x;
			if(v == x)
				num[i]=num[i-1]+1;
			else num[i]=num[i-1];
				
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0)break;
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			sb.append(num[max]-num[min-1]+"\n");
		}
		System.out.print(new String(sb));
	}

}
