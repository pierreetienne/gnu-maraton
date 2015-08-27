import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF450A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int N = Integer.parseInt(st.nextToken());
			double  M = Double.parseDouble(st.nextToken());
			int max = 0;
			int res = 0;
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				double val =Double.parseDouble(st.nextToken());
				int div = (int) Math.ceil(val/M);
				if(div>=max){
					res=i+1;
					max = div;
				}
			}
			System.out.println(res);
		}
	}
}
