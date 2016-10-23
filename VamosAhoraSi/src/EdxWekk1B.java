import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class EdxWekk1B {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("aplusbb.in"));
		System.setOut(new PrintStream("aplusbb.out"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long a=Long.parseLong(st.nextToken());
			long b=Long.parseLong(st.nextToken());
			b*=b;
			System.out.println(a+b);
		}
	}

}
