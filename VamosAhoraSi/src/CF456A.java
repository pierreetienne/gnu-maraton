import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class CF456A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[][] m = new int[N][];
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int p = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				m[i]=new int[]{p,c};
			}
			Arrays.sort(m,new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o2[0]-o1[0]==0?o2[1]-o1[1]:o2[0]-o1[0];
				}
			});
			
			int maxP = m[0][0];
			int maxC = m[0][1];
			boolean ok = false;
			for(int i=1;i<m.length&&!ok;++i){
				int p = m[i][0];
				int c = m[i][1];
				if(p<maxP && c>maxC){
					ok = true;
				}
				if( p<maxP){
					maxP =p;
					maxC =c;
				}
			}
			if(ok )
				System.out.println("Happy Alex");
			else
				System.out.println("Poor Alex");
			
		}
	}

}
