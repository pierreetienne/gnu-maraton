import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva12372 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		int N = Integer.parseInt(in.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			if(a<=20 && b<=20 && c<=20)
				sb.append("Case "+caso+++": good\n");
			else
				sb.append("Case "+caso+++": bad\n");
		}
		System.out.print(new String(sb));

	}

}
