import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CF580D {
	static Map<String, Long> rules ;
	static long[] sa;
	static int n ,m;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			 n = Integer.parseInt(st.nextToken());
			 m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			sa = new long[n];
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				sa[i]=Long.parseLong(st.nextToken());
			}
			rules = new TreeMap<String, Long>();
			for(int i=0;i<k;++i){
				st = new StringTokenizer(in.readLine());
				rules.put(Long.parseLong(st.nextToken())+""+Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
			}
			System.out.println(f(0,-1,0));
		}
	}

	static long f(int actual , int anterior , int cant ){
		if(actual>=n || anterior>=n || cant>m)return 0;
		long v1 = f(actual+1, actual,cant+1)+sa[actual]+(rules.get((anterior+1)+""+(actual+1))==null ? 0:rules.get((anterior+1)+""+(actual+1)));
		long v2 = f(actual+1, anterior,cant);
		return Math.max(v1, v2);
	}
}
