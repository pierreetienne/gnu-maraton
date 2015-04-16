import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF116A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int max =0;
			int actual = 0;
			for(int i=0;i<n;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				actual = actual - a;
				actual = actual + b;
				max = Math.max(max, actual);
			}
			System.out.println(max);
		}
	}

}
