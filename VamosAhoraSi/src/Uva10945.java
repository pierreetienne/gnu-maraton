import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10945 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = bf.readLine().trim();
		while(!linea.equals("DONE")){
			String aux = "";
			for(int i=0;i<linea.length();++i){
				if(Character.isLetter(linea.charAt(i)))
					aux+=linea.charAt(i);
			}
			aux = aux.toLowerCase();
			if(aux.equals(new StringBuilder(aux).reverse().toString()))
				System.out.println("You won't be eaten!");
			else
				System.out.println("Uh oh..");
			linea = bf.readLine().trim();
		}
	}	

}
