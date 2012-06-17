
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva113 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String l = bf.readLine();l!=null;l=bf.readLine()){
			double a = Double.parseDouble(l);
			double b = Double.parseDouble(bf.readLine());
			System.out.println((int)Math.round(Math.pow(b, 1/a)));
		}
	}

}
