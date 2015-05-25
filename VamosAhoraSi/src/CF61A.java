import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF61A {

	public static void main(String[] args) throws Exception {
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!= null;){
			String a = ln;
			String b = in.readLine();
			int max  = b.length();
			StringBuilder sol = new StringBuilder();
			for(int i=0;i<max;++i){
				if(a.charAt(i)!=b.charAt(i))
					sol.append("1");
				else
					sol.append("0");
			}
			System.out.println(new String(sol));
		}
	}

}
