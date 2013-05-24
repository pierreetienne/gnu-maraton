import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva12250 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		for(String ln;(ln = in.readLine())!=null;){
			if(ln.equals("#"))
				break;
			if(ln.trim().equals("HELLO")) sb.append("Case "+caso+++": ENGLISH\n");
			else if(ln.trim().equals("HOLA")) sb.append("Case "+caso+++": SPANISH\n");
			else if(ln.trim().equals("HALLO")) sb.append("Case "+caso+++": GERMAN\n");
			else if(ln.trim().equals("BONJOUR")) sb.append("Case "+caso+++": FRENCH\n");
			else if(ln.trim().equals("CIAO")) sb.append("Case "+caso+++": ITALIAN\n");
			else if(ln.trim().equals("ZDRAVSTVUJTE")) sb.append("Case "+caso+++": RUSSIAN\n");
			else sb.append("Case "+caso+++": UNKNOWN\n");
		}
		System.out.print(new String(sb));
	}

}
