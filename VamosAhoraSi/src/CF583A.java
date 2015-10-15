import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF583A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			boolean[] f = new boolean[n];
			boolean[] c = new boolean[n];
			StringBuilder sb = new StringBuilder();
			int cont = 1;
			for(int i=0;i<n*n;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				if(!f[a]&&!c[b]){
					f[a]=true;
					c[b]=true;
					if(sb.length()==0)
						sb.append(cont);
					else
						sb.append(" "+cont);
				}
				cont++;
			}
			System.out.println(new String(sb));
			
		}

	}

}
