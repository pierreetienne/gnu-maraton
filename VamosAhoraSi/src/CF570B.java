import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF570B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			int min = 1;
			int max = m;
			int med = (int) ((min + max) / 2.);
			int dis = Math.abs(min-max);
			System.out.println("dis " +dis + "  med " + med + " min " + min + " max "+ max);
			int med2 = 0;
			int dis2 = 0;
			if(m+1 < n ){
				int a = m+1;
				int b = n;
				dis2 = Math.abs(a-b);
				med2 = (int) ((a+b)/2.);
				System.out.println("2dis " +dis2 + "  med2 " + med2 + " min " + a + " max "+ b);
			}
			if(dis>= dis2){
				System.out.println(med);
			}else
				System.out.println(med2);
		}
	}

}
