
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10783 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()), cases = 1;
		while(N-->0){
			int A = Integer.parseInt(bf.readLine());
			int B = Integer.parseInt(bf.readLine());
			int suma = 0;
			A = (A%2!=0)?A:A+1;
			while(A<=B){
				suma+=(A%2!=0)?A:0;
				A+=2;
			}
			System.out.println("Case "+(cases++)+": "+suma);
		}
	}

}
