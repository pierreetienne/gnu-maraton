import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class CF461A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			Integer[] m = new Integer[N];
			long sum = 0;
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
				sum+=m[i];
			}
			Arrays.sort(m, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o1.intValue()-o2.intValue();
				}
			});
			long total = sum;
			if(N>=2){
				sum*=2;
				long rest = 0;
				for(int i=0;i<N-2;++i){
					rest+=m[i];
					sum+= (total - rest);
				}
			}
			System.out.println(sum);
		}
	}
}
/**
 * 
10
8 10 2 5 6 2 4 7 2 1
376
*
*/