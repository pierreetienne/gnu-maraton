import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11044 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken())-1;
			
		}
		System.out.print(new String(sb));
	}

}
