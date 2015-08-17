import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF448A {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int cups = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int medals = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(in.readLine());
			n -= Math.ceil(cups/5.);
			n-= Math.ceil(medals/10.);
			if(n>=0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
