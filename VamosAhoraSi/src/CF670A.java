import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF670A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int resultMin = 0;
			int resultMax = 0;
			if(N%7==0){
				resultMin =resultMax = (N / 7)*2 ;
			}else{
				int div = (int) Math.floor(N / 7);
				int diff = N-(div*7);
				resultMax = div*2;
				resultMax += Math.min(2,diff);
				if(div>0){
					resultMin += div*2;
				}
				if(diff==6)
					resultMin++;
			}
			System.out.println(resultMin + " "+resultMax);
		}
	}

}
