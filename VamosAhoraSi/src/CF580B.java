import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CF580B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken());
			long d = Long.parseLong(st.nextToken());
			long[][]  m = new long[(int) n][];
			for(int i=0;i<n;++i){
				st = new StringTokenizer(in.readLine());
				m[i]=new long[]{Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()) };
			}
			Arrays.sort(m, new Comparator<long[]>() {
				public int compare(long[] o1, long[] o2) {
					return (int) (o2[1]-o1[1]==0?o2[0]-o1[0]:o2[1]-o1[1]);
				}
			});
			
			long max = 0;
			long current = m[0][1];
			max = Math.max(max, current);
			for(int i=1;i<n;++i){
				if(Math.abs(m[i-1][0]-m[i][0])<=d){
					current += m[i][1];
				}else{
					current=m[i][1];
				}
				max = Math.max(max, current);
			}
			
			Arrays.sort(m, new Comparator<long[]>() {
				public int compare(long[] o1, long[] o2) {
					return (int) (o2[0]-o1[0]==0?o2[1]-o1[1]:o2[0]-o1[0]);
				}
			});
			
			current = m[0][1];
			max = Math.max(max, current);
			for(int i=1;i<n;++i){
				if(Math.abs(m[i-1][0]-m[i][0])<=d){
					current += m[i][1];
				}else{
					current=m[i][1];
				}
				max = Math.max(max, current);
			}
			System.out.println(max);
		}
	}

}
