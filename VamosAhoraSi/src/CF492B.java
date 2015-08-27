import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;


public class CF492B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken()), l = Long.parseLong(st.nextToken());
			long[] m = new long[(int) n];
			st= new StringTokenizer(in.readLine());
			
			for(int i=0;i<n;++i){
				m[i]=Long.parseLong(st.nextToken());
				
			}
			Arrays.sort(m);
			long maxDis = 0;
			for(int i=0;i<n;++i){
				if(i>0){
					maxDis = Math.max(maxDis, Math.abs(m[i]-m[i-1]));
				}
			}
			
			maxDis = Math.max(maxDis, Math.abs(m[(int) (n-1)]-l)*2);
			maxDis = Math.max(maxDis, Math.abs(m[0]*2));
			System.out.printf(Locale.US, "%.10f\n",(maxDis/.2)/10.);
		}

	}

}
