import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF318A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken());
			long k = Long.parseLong(st.nextToken());
			long mid = (long) Math.ceil(n/2.);
			if(k>mid){
				System.out.println(2*(k-mid));
			}else
				System.out.println((2*(k-1))+1);
		}
	}

}
