import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva11854 {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int[] m = new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
			if(m[0]== 0 && m[1]==0 && m[2]==0 )break;
			Arrays.sort(m);
			if(m[0]*m[0] +m[1]*m[1]==m[2]*m[2])
				sb.append("right\n");
			else
				sb.append("wrong\n");
		}
		System.out.print(new String(sb));
	}

}
