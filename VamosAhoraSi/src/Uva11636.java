import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva11636 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		for(String ln;(ln =in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			if(N <=-1)break;
			int cont = 1, c = 0;
			while(cont<N){
				cont*=2;
				c++;
			}
			sb.append("Case "+caso+++": " + c+"\n");
		}
		System.out.print(new String(sb));
	}

}
