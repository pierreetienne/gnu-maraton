import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF513A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken()), k1 = Integer.parseInt(st.nextToken()), k2 = Integer.parseInt(st.nextToken());
			if(n1<=n2){
				System.out.println("Second");
			}else
				System.out.println("First");
		}
	}

}
