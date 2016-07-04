import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF681A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			boolean ok = false;
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				st.nextToken();
				int before = Integer.parseInt(st.nextToken());
				int after = Integer.parseInt(st.nextToken());
				if(before>=2400 && after>before){
					ok =true;
				}
			}
			System.out.println(ok?"YES":"NO");
		}
	}

}
