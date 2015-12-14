
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Kindergarten {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=bf.readLine())!= null){
			int cont = 0;
			boolean conte = false;
			for(int i=0;i<line.length();++i){
				if(Character.isLetter(line.charAt(i))&& !conte){
					conte=true;
					cont++;
				}else if(!Character.isLetter(line.charAt(i))){
					conte=false;
				}
			}
			System.out.println(cont);
		}
	}

}
