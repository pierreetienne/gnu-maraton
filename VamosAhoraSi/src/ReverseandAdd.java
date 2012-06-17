
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ReverseandAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		while(n-->0){
			String num = bf.readLine();
			boolean encontre = false;
			int cont = 0;
			while(!encontre){
				String suma = (Long.parseLong(new StringBuilder(num).reverse().toString())+ Long.parseLong(num))+"";
				if((new StringBuilder(suma).reverse().toString()).equals(suma)){
					encontre=true;
				}
				num = suma;
				cont++;
			}
			
			System.out.println(cont+ " " + num);
		}
	}

}
