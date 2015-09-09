import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF463B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] values = new int[N+1];
			int cont = 0;
			for(int i=0;i<N;++i){
				values[i+1]=Integer.parseInt(st.nextToken());
				if(i==0){
					values[i]=values[i+1];
					cont = values[i+1];
				}
			}
			int gold = 0;
			for(int i=1;i<values.length;++i){
				int val = values[i-1]-values[i];
				gold+=val;
				if(gold<0){
					cont+=Math.abs(gold);
					gold=0;
				}
			}
			System.out.println( cont);
		}
	}
}
