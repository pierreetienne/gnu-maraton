import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva11877 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine().trim());
		while(a != 0 ){
			int val = Math.round(a/2);
			System.out.println(val);
			a = Integer.parseInt(bf.readLine().trim());
		}
	}

}
