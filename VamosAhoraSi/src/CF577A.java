import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF577A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken());
			long x = Long.parseLong(st.nextToken());
			int cont = 0;
			for(int i=1;i<=n;++i){
				if(x%i==0){
					long col = (long)(x/i);
					if(col<=n)
						cont++;
				}
			}
			System.out.println(cont);
			
		}

	}

}
