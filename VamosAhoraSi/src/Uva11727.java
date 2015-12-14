import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11727 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()),casos = 1;
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			int min = Math.min(a, Math.min(b, c));
			int max = Math.max(a, Math.max(b, c));
			System.out.println("Case "+(casos++)+": "+(int)(min+max)/2);
		}
	}

}
