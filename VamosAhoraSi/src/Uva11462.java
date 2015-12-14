import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva11462 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			int N = Integer.parseInt(bf.readLine());
			if(N == 0)break;
			int[] m = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<N;++i)m[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(m);
			for(int i=0;i<m.length;++i){
				sb.append(m[i]);
				if(i+1<m.length)
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
