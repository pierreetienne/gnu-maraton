import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF507B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			double r = Integer.parseInt(st.nextToken());
			double x = Integer.parseInt(st.nextToken());
			double y = Integer.parseInt(st.nextToken());
			double x1 = Integer.parseInt(st.nextToken());
			double y1 = Integer.parseInt(st.nextToken());
			double distancia = dist(x, y,x1, y1);
//			System.out.println(distancia);
			int val = (int) ((distancia)/(2*r));
			if(distancia%(2*r)!=0.0){
				val++;
			}
//			System.out.println(distancia%(2*r));
			System.out.println(val);
		}

	}
	
	static double dist(double x, double y , double x1, double y1){
		double a = x-x1;
		double b = y-y1;
		double c = (a*a)+(b*b);
		return Math.sqrt(c);
	}

}
