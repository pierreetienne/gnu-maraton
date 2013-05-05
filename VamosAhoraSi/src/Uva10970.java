import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Uva10970 {
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			sb.append((a*b)-1);
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}
}
