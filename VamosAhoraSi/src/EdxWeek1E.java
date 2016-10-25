import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EdxWeek1E {

	public static void main(String[] args) throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st=new StringTokenizer(ln);
			double A[]={(Integer.parseInt(st.nextToken())/2.)*10000000,0.};
			double B[]={0.,(Integer.parseInt(st.nextToken())/2.)*10000000};
			double C[]={A[0],B[1]};
			double sum=dist(A[0], B[0], A[1], B[1]);
			sum+=dist(B[0], C[0], B[1], C[1]);
			sum+=dist(C[0], A[0], C[1], A[1]);
			System.out.printf("%.6f\n",(sum/3.));
		}
	}
	
	static double dist(double A, double B, double C, double D){
		return Math.sqrt(((A-B)*(A-B) )+((C-D)*(C-D)));
	}

}
