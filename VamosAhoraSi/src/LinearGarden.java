

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class LinearGarden {

	static char[] c;

	static TreeSet<String> tre ;


	static void f ( String x , int cantL , int cantP ){
		if(x.length() == c.length){
			tre.add(x);
			return;
		}
		if( (cantL- cantP) == 1  ){
			f(x+"P", cantL, cantP+1);
		}else if((cantP- cantL) == 1){
			f(x+"L", cantL+1, cantP);
		}
		else{
			f(x+"P", cantL, cantP+1);
			f(x+"L", cantL+1, cantP);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea; (linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea.trim());
			int M = Integer.parseInt(bf.readLine().trim());
			c = bf.readLine().trim().toCharArray();
			tre = new TreeSet<String>();

			f("L",0,0);
			f("P",0,0);

			System.out.println(tre);
			System.out.println(tre.size());

		}

	}

}
