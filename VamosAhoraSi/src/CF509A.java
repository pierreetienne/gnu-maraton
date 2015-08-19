import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF509A {

	public static void main(String[] args)throws Exception  {
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[][] m = new int[N][N];
			for(int i=0;i<N;++i)
				m[i][0]=m[0][i]=1;
			for(int i=1;i<N;++i){
				for(int j=1;j<N;++j){
					m[i][j]= m[i-1][j] + m[i][j-1];
				}
			}
			System.out.println(m[N-1][N-1]);
		}

	}

}
