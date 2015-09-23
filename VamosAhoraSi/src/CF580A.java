import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF580A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln ;(ln = in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			long[] m = new long[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			long ant = 0;
			long tam = 0;
			long max = 0;
			for(int i=0;i<N;++i){
				m[i]=Long.parseLong(st.nextToken());
				if(i==0){
					ant= m[i];
					tam=1;
				}else{
					if(m[i]<ant){
						max = Math.max(max, tam);
						ant=m[i];
						tam=1;
					}else{
						ant=m[i];
						tam++;
					}
				}
			}
			max = Math.max(max, tam);
			System.out.println(max);
			
			
		}

	}

}
