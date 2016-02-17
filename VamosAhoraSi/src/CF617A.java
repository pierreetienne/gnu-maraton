import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF617A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int num = Integer.parseInt(ln);
			if(num<=5)
				System.out.println(1);
			else{
				if(num%5!=0)
					System.out.println(((num/5)+1) +"");
				else
					System.out.println(((num/5)) +"");
			}
		}
	}

}
