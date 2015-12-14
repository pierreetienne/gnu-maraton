import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF550A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			boolean ok = false;
			for(int i=1;i<ln.length()-1&&!ok;++i){
				if(ln.charAt(i-1)=='A'&&ln.charAt(i)=='B' && ln.charAt(i+1)=='A'){
					ok = true;
				}
			}
			System.out.println(!ok?"YES":"NO");
		}

	}

}
