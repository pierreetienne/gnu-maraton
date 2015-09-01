import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF384A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			char[][] m = new char[N][N];
			StringBuilder sb = new StringBuilder();
			int cant = 0;
			for(int i=0;i<N;++i){
				for(int j=0;j<N;++j){
					m[i][j]='.';
					if(i%2==0 && j%2==0){
						m[i][j]='C';
						cant++;
					}
					else if(i%2!=0 && j%2!=0){
						m[i][j]='C';
						cant++;
					}
				}
				sb.append(new String(m[i])+"\n");
			}
			System.out.println(cant);
			System.out.print(new String(sb));
		}
	}
}
