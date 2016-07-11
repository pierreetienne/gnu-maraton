import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF50A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int min = Math.min(m, n);
			int max = Math.max(m, n);
			int res = 0;
			if(min>=2){
				res = (int) (max * Math.floor(min /2));
				if(min %2!=0)
					res +=   max/2;
			}else{
				res += max/2;
			}
			System.out.println(res);
		}
	}
}
