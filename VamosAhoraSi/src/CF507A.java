import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class CF507A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] a = new int[n][];
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				a[i] = new int[]{Integer.parseInt(st.nextToken()),i+1};
			}
			Arrays.sort(a, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
			});
			StringBuilder sb = new StringBuilder();
			int cont = 0;
			int sum = 0;
			for(int i=0;i<n;++i){
				sum += a[i][0];
				if(sum<= k ){
					cont++;
					if(cont==1)
						sb.append(a[i][1]+"");
					else
						sb.append(" " + (a[i][1]) );
				}
				else
					break;
			}
			System.out.println(cont);
			System.out.println(new String(sb));
		}

	}

}
