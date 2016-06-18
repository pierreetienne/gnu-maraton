import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF586A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			boolean []m = new boolean[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				m[i]=(st.nextToken().equals("1"));
			}
			int cont = 0;
			if(N==1){
				cont+=m[0]?1:0;
			}else if(N==2){
				cont+=m[0]&&m[1]?2:m[0]||m[1]?1:0;
			}else{
				boolean firts = false;
				int contZeros = 0;
				for(int i=0;i<N;++i){
					if(m[i]){
						firts=true;
					}
					if(firts && m[i]){
						cont++;
						if(contZeros<2){
							cont+=contZeros;
						}
						contZeros=0;
					}else if(firts && !m[i]){
						contZeros++;
					}
				}
			}
			System.out.println(cont);

		}
	}
}
