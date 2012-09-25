import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10019 {

	public static void main(String[] args) throws Exception	 {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(bf.readLine().trim());
		for(int j=0;j<casos;++j){
			int N = Integer.parseInt(bf.readLine().trim());
			String X1 = Integer.toString(N,10);
			String binary  = Integer.toBinaryString(Integer.parseInt(X1));
			int b1 = 0;
			for(int i=0;i<binary.length();++i)if(binary.charAt(i)=='1')b1++;
			int hexa = Integer.valueOf(N+"", 16);
			binary = Integer.toString(hexa,2);
			int b2 = 0;
			for(int i=0;i<binary.length();++i)if(binary.charAt(i)=='1')b2++;
			System.out.println(b1+" "+b2);
		}
				

	}

}
