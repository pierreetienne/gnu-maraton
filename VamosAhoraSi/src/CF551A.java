import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class CF551A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[][] m = new int[N][];
			StringTokenizer st = new StringTokenizer(in.readLine() );
			for(int i=0;i<N;++i){
				m[i]=new int[]{Integer.parseInt(st.nextToken()), i+1};
			}
			Arrays.sort(m, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o2[0]-o1[0];
				}
			});
			
			int[] res = new int[N];
			int pos = 1;
			res[m[0][1]-1]= pos;
			
			for(int i=1;i<N;++i){
				if(m[i][0] == m[i-1][0]){
					res[m[i][1]-1]= pos;
				}else{
					pos = i+1;
					res[m[i][1]-1]= pos;
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<N;++i){
				if(i==0)
					sb.append(res[i]);
				else
					sb.append(" "+res[i]);
			}
			
			System.out.println(new String(sb));
		}

	}

}
