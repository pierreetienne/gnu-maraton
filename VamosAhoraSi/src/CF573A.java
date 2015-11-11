import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF573A {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			long[] values = new long[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				values[i]=Long.parseLong(st.nextToken());
				while(values[i]%2==0)values[i]/=2;
				while(values[i]%3==0)values[i]/=3;
			}
			boolean ok = false;
			for(int i=1;i<N;++i){
				if(values[i]!=values[0])
					ok = true;
			}
			if(!ok)
				System.out.println("Yes");
			else 
				System.out.println("No");
		}
	}

}
