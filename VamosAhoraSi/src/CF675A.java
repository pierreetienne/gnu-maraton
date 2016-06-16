import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF675A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			boolean ok = false;
			if(c != 0 ){
				int x = ( b - a )/ c;
				int y = a + (c*x);
				ok = (y == b)&& x>=0;
			}else{
				ok = a == b;
			}
			System.out.println(ok?"YES":"NO");
		}
	}

}
