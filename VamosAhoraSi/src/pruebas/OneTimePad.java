package pruebas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneTimePad {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.print("Digite el texto:");
			String linea = bf.readLine();
			System.out.print("Digite la llave:");
			String llave = bf.readLine();
			StringBuilder cifrado = new StringBuilder();
			for(int i=0;i<llave.length()&& i<linea.length();++i){
				cifrado.append((char)((((linea.charAt(i)-('A'-1))+(llave.charAt(i)-('A'-1)))%26)+('A'-1)));
			}
			System.out.println("Texto cifrado  : " + new String(cifrado));
		}
	}

}
