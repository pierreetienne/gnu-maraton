import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF559A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int sum = 0;
			int[] v= new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
			if(v[0]==v[1]&&v[0]==v[2]&&v[0]==v[3]&&v[0]==v[4]&&v[0]==v[5])
				sum=f(v[0])*6;
			else{
				sum=+f(v[0])+f(v[1])+f(v[2])+f(v[3])+f(v[4])+f(v[5]);
			}
			System.out.println(sum);
		}
	}
	
	public static int f(int n){
		return ((n*(n+1))/2)+n-1;
	}

}
