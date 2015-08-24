import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF455A {

	static long[] values;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			values = new long[100010];
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				int val =Integer.parseInt(st.nextToken());
				values[val]++;
			}
			for(int i=values.length-5;i>=0;--i){
				values[i]=Math.max(values[i+2]+(values[i]*i), values[i+1]);
			}
			System.out.println(values[0]);
		}
	}
}
