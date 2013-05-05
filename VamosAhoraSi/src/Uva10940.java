import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10940 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		int[] memo = new int[500001];
		int aux = 4, ini=2;
		memo[1]=1;
		memo[2]=2;
		for(int i=3;i<memo.length;++i){
			memo[i]= ini;
			ini+=2;
			if(i==aux){
				aux*=2;
				ini = 2;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			if(N==0)break;
			sb.append(memo[N]+"\n");
		}
		System.out.print(new String(sb));
	}

}
