import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CF479C {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[][] m = new int[N][];
			for(int i=0;i<m.length;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				m[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			}
			Arrays.sort(m, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					int c =  o1[0]-o2[0];
					if(c==0)
						return o1[1]-o2[1];
					return c;
				}
			});
			long actual = Math.min(m[0][0], m[0][1]);
			for(int i=1;i<N;++i){
				if(actual<=m[i][0] && actual<=m[i][1])
					actual = Math.min(m[i][0],m[i][1]);
				else if(actual<=m[i][0] && actual>m[i][1])
					actual = m[i][0];
				else if(actual<=m[i][1] && actual>m[i][0])
					actual = m[i][1];
			}
			System.out.println(actual);
		}

	}

}
