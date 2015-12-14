import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva12468 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			if(a==-1 && b==-1)break;
			int c = Math.abs(a-b);
			if(c>=50)
				c=100-c;
			sb.append( c+"\n");
		}
		System.out.print(new String(sb));
	}

}
