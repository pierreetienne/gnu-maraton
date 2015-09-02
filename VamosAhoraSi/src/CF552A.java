import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF552A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int sum = 0;
			for(int i=0;i<n;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				int x2 = Integer.parseInt(st.nextToken());
				int y2 = Integer.parseInt(st.nextToken());
				for(int j=x1;j<=x2;++j){
					for(int p=y1;p<=y2;++p){
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
