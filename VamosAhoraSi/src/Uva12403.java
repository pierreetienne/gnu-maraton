import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva12403 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		long count = 0;
		while(N-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());
			if(st.nextToken().indexOf("donate")!=-1)
				count+= Integer.parseInt(st.nextToken());
			else
				sb.append(count+"\n");
		}
		System.out.print(new String(sb));
	}

}
