import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF431A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int[] values = new int[5];
			StringTokenizer st = new StringTokenizer(ln);
			values[1]= Integer.parseInt(st.nextToken());
			values[2]=Integer.parseInt(st.nextToken());
			values[3]=Integer.parseInt(st.nextToken());
			values[4]=Integer.parseInt(st.nextToken());
			ln = in.readLine();
			long sum =0;
			for(int i=0;i<ln.length();++i){
				sum+=values[ln.charAt(i)-'0'];
			}
			System.out.println(sum);
		}
	}

}
