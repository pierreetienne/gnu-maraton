import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Uva12015 {

	
	static class X {
		String p;
		int val;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int casos = 1;
		while(N-->0){
			X[] pal = new X[10];
			for(int i=0;i<10;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				pal[i] = new X();
				pal[i].p = st.nextToken();
				pal[i].val = Integer.parseInt(st.nextToken().trim());
			}
			Arrays.sort(pal,new Comparator<X>() {
				public int compare(X o1, X o2) {
					return o2.val- o1.val;
				}
			});
			sb.append("Case #"+(casos++)+":\n");
			int max = pal[0].val;
			for(int i=0;i<10;++i){
				if(pal[i].val == max)
					sb.append(pal[i].p+"\n");
				else break;
			}
		}
		System.out.print(new String(sb));
	}

}
