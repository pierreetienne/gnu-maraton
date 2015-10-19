import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF570B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken());
			long m = Long.parseLong(st.nextToken());
			long disA = Math.abs(m-n);
			long disB = m-1;
			if(disB>disA ){
				System.out.println(m-1>=1?m-1:m);
			}else 
				System.out.println(m+1<=n?m+1:m);
			
		}
	}

}
