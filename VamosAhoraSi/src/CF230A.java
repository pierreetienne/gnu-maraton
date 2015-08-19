import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class CF230A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int s = Integer.parseInt(st.nextToken()), n= Integer.parseInt(st.nextToken());
			int[][] m =new int[n][2];
			for(int i=0;i<n;++i){
				st = new StringTokenizer(in.readLine());
				m[i]=new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			}
			Arrays.sort(m, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0]==0?o2[1]-o1[1]:o1[0]-o2[0];
				}
			});
			boolean ok = false;
			for(int i=0;i<n&&!ok;++i){
				if(s>m[i][0])
					s+=m[i][1];
				else
					ok =true;
			}
			if(ok)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
