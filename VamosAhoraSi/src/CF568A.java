import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF568A {
	
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int T = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
			int cont = 0;
			while(S<T){
				S*=Q;
				cont++;
			}
			System.out.println(cont);
		}
	}

}
