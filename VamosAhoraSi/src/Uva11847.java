import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva11847 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine().trim());
		while(a != 0){
			System.out.println((int)(Math.log(a)/Math.log(2)));
			a = Integer.parseInt(bf.readLine().trim());
		}

	}

}
