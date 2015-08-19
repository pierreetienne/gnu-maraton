import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF427A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int contHired = 0;
			int cases = 0;
			for(int i=0;i<N;++i){
				int num = Integer.parseInt(st.nextToken());
				if(num>0)
					contHired+=num;
				else{
					if(contHired>0)
						contHired--;
					else
						cases++;
				}
			}
			System.out.println(cases);
		}
	}
}
