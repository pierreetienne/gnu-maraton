import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF588A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[][] m = new int[n][];
			for(int i=0;i<n;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				m[i]=new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			}
			
			long count = 0;
			long menor  = Long.MAX_VALUE;
			for(int i=0;i<n;++i){
				menor = Math.min(m[i][1],menor);
				count+=(menor)*m[i][0];
			}
			System.out.println(count);
		}
	}

}
