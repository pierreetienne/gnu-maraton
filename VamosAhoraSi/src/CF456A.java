import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CF456A {


	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!= null;){
			int N = Integer.parseInt(ln);
			int[][] m = new int[N][2];
			boolean happy = false;
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				m[i][0] = Integer.parseInt(st.nextToken());
				m[i][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(m, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (o1[0]-o2[0])==0?((o1[1]-o2[1])) :(o1[0]-o2[0]);
				}
			});
			
			int precio = -1;
			int calida = -1;
			for(int i=0;i<N&&!happy;++i){
				if(precio == -1 ){
					precio = m[i][0];
					calida = m[i][1];
				}else{
					if(m[i][0]>precio&&calida>m[i][0])
						happy=true;

				}
			
			}
			
			if(happy){
				System.out.println("Happy Alex");
			}else{
				System.out.println("Poor Alex");
			}
		}
	}


}
