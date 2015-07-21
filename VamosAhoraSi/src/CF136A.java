import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CF136A {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[] res = new  int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				int val = Integer.parseInt(st.nextToken());
				res[val-1]=i+1;
			}
			for(int i=0;i<n;++i)
				System.out.print(res[i]+(i+1<n? " ":""));
			System.out.println();
		}
	}
}
