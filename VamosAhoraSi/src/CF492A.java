import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CF492A {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int to = Integer.parseInt(ln);
			long h = 0,sum =0, total = 0;
			for(int i=1;i<10001&& h==0;++i){
				sum+=i;
				total +=sum;
				if(total==to)
					h = i;
				else if(total>to)
					h = i-1;
			}
			System.out.println(h);
		}
	}
}
