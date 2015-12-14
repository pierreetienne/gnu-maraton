
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SayOnce {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		while(!line.equals("0")){
			int sumaImpares=0,sumaPares=0;
			for(int i=0;i<line.length();++i){
				if((i+1)%2==0)
					sumaPares+=Integer.parseInt(line.charAt(i)+"");
				else 
					sumaImpares+=Integer.parseInt(line.charAt(i)+"");
			}
			if((sumaImpares-sumaPares)== 0 || (sumaImpares-sumaPares)%11==0)
				System.out.println(line+" is a multiple of 11.");
			else
				System.out.println(line+" is not a multiple of 11.");
			line = bf.readLine();
		}
	}

}
