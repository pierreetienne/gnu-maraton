import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


//TIME LIMIT PAIASL 65523 buscar numero EOF char 


public class Uva492
{
	public static HashSet<Character> vocales;
	public static void main(String[] args) throws Exception 
	{
		vocales  = new HashSet<Character>();
		vocales.add('A');
		vocales.add('E');
		vocales.add('I');
		vocales.add('O');
		vocales.add('U');
		vocales.add('a');
		vocales.add('e');
		vocales.add('i');
		vocales.add('o');
		vocales.add('u');
		
		String linea = "";
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(new String(f(linea)));
	}
	
	
	public static StringBuilder f ( String linea ){
		int ini = -1;
		int fin = 0 ;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<linea.length();++i){
			if(Character.isLetter(linea.charAt(i))){
				fin = i;
				ini = ( ini == -1 )? i:ini;
			}
			else if(!Character.isLetter(linea.charAt(i)) && ini > -1){
				String palabra = linea.substring(ini, fin+1);
				if(vocales.contains(palabra.charAt(0)))
						palabra=palabra+"ay";
				else
					palabra = palabra.substring(1)+palabra.charAt(0)+"ay";
				
				sb.append(palabra);
				ini = -1;
				sb.append(linea.charAt(i));
			}
			else
				sb.append(linea.charAt(i));
		}
		if(ini!= -1){
			String palabra = linea.substring(ini, fin+1);
			sb.append(palabra);
			ini = -1;
		}
		sb.append("\n");
		return sb;
	}
}
