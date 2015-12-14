import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF599A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st  = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int min = a+b+c;
			min = Math.min(min, a+a+b+b);
			min = Math.min(min, b+c+c+b);
			min = Math.min(min, a+c+c+a);
			
			System.out.println(min);
		}
	}
}
