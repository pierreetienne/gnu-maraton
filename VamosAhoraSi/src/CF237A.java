import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF237A {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int max = 1;
			int[][] da = new int[24][60];
			for(int i=0;i<n;++i){
				StringTokenizer st= new StringTokenizer(in.readLine());
				int h = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				da[h][m]++;
				max = Math.max(da[h][m],max);
			}
			System.out.println(max);
		}
	}
}
