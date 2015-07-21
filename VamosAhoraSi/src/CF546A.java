import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF546A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(ln);
			long K = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken());
			long total = (((W*(W+1))/2)*K)-N;
			System.out.println(total>0?total :0);
		}
	}
}
