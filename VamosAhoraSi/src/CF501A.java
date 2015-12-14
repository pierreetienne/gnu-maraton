import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF501A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			double maxM = (double) Math.max((3.*a)/10.,a-((a/250.)* c));
			double maxV = (double) Math.max((3.*b)/10.,b-((b/250.)* d));
			if(maxM > maxV){
				System.out.println("Misha");
			}else if(maxM < maxV){
				System.out.println("Vasya");
			}else {
				System.out.println("Tie");
			}
		}

	}

}
