import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CF499A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int[][] m = new int[n][];
			int sum = 0;
			for(int i=0;i<n;++i){
				st=new StringTokenizer(in.readLine());
				int r = Integer.parseInt(st.nextToken());
				int l = Integer.parseInt(st.nextToken());
				m[i]=new int[]{r,l};
				sum += Math.abs(l-r)+1;
			}
			Arrays.sort(m, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
			});
			int actual = 1;
			for(int i=0;i<n;++i){
				if(m[i][0]>actual){
					int diff = m[i][0]-actual;
					sum += diff%x;
				}
				actual = m[i][1]+1;
			}
			System.out.println(sum);
		}

	}

}
