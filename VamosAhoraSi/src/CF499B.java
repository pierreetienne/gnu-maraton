import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class CF499B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			TreeMap<String, String> map = new TreeMap<String, String>();
			for(int i=0;i<m;++i){
				st = new StringTokenizer(in.readLine());
				map.put(st.nextToken(), st.nextToken());
			}
			st = new StringTokenizer(in.readLine());
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<n;++i){
				String pal = st.nextToken();
				if(map.get(pal)!=null)
					if(map.get(pal).length()<pal.length())
						pal = map.get(pal);
				if(i==0)
					sb.append(pal);
				else
					sb.append(" " + pal);
			}
			System.out.println(new String(sb));
		}

	}

}
