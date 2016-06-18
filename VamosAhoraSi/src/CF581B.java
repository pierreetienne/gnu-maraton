import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF581B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			long[] m = new long[N];
			long maxH = -1;
			long resp[] = new long[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				m[i]=Long.parseLong(st.nextToken());
			}
			for(int i=N-1;i>=0;--i){
				if(m[i]>maxH){
					maxH = m[i];
				}else if(i<N-1){
					resp[i] = (maxH+1)-m[i];
				}
			}
			for(int i=0;i<N;++i){
				System.out.print(resp[i]+((i+1==N)?"":" "));
			}
			System.out.println();
		}

	}

}
