package pruebas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CifradoCesar {

	public static void main(String[] args) throws Exception {
		HashMap<Character,Character> map = new HashMap<Character, Character>();
		int desplazamiento = 6 , hasta = ('Z'-'A')+1;
		for(int i=0;i<hasta;++i) 	map.put((char) ('A'+i), (char)(((i+desplazamiento)%hasta)+'A') );
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			StringBuilder cifrado = new StringBuilder();
			for(int i=0;i<linea.length();++i){
				if(map.get(Character.toUpperCase(linea.charAt(i)))!= null)
					cifrado.append(map.get(Character.toUpperCase(linea.charAt(i))));
				else
					cifrado.append(linea.charAt(i));
			}
			System.out.println("Texto Original:"+ linea );
			System.out.println("Texto Cifrado :"+ new String(cifrado) );		
		}
 	}

}
