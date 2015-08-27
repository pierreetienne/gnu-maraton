import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;


public class CF200B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			double[] values = new double[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			double sum = 0.;
			for(int i=0;i<N;++i){
				values[i] = Double.parseDouble(st.nextToken())/100.;
				sum+=values[i];
			}
			System.out.printf(Locale.US,"%.12f\n", (sum/N)*100.);
		}

	}

}
