import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF545D {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			long[] m = new long[N];
			for(int i=0;i<N;++i){
				m[i]=Long.parseLong(st.nextToken());
			}
			Arrays.sort(m);
			long sum = 0; 
			long count = 0;
			for(int i=0;i<N;++i){
				if(sum>m[i]){
					continue;
				}else{
					count++;
					sum+=m[i];
				}
			}
			System.out.println(count);
		}

	}

}
