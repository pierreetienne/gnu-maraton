import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF472A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int num = Integer.parseInt(ln);
			int[] comp = new int[(int) (Math.ceil(num/2)+100)];
			for(int i=2;i<=Math.ceil(num/2);++i){
				for(int j=2;j*i<comp.length;++j){
					comp[i*j]++;
				}
			}
			int numA = 0;
			int numB = 0;
			for(int i=4;i<Math.ceil(num/2)+10&& numB == 0;++i){
				if((num -i ) < comp.length &&comp[(num -i )]>=1 && comp[i]>=1 && i!=(num-i)){
					numA = i;
					numB = (num-i);
				}
			}
			
			
			System.out.println(numA + " " + numB);
		}
	}

}
