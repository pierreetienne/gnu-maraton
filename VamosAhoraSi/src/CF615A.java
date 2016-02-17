import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF615A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int buttons  = Integer.parseInt(st.nextToken());
			int bulbs = Integer.parseInt(st.nextToken());
			
			boolean[] m = new boolean[bulbs];
			for(int i=0;i<buttons;++i){
				ln = in.readLine();
				st = new StringTokenizer(ln);
				int cant = Integer.parseInt(st.nextToken());
				for(int j=0;j<cant;++j){
					m[Integer.parseInt(st.nextToken())-1]=true;
				}
			}
			boolean ok = true;
			for(int i=0;i<m.length&&ok;++i){
				if(!m[i])
					ok=false;
			}
			if(ok)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
