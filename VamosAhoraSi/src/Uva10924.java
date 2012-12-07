import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Uva10924 {

	public static void main(String[] args) throws Exception{
		boolean[] primos = new boolean[1100];
		for(int i=2;i*i<primos.length;++i)for(int j=i*i;j<primos.length;j+=i)primos[j]=true;
		HashMap<Character, Integer> l = new HashMap<Character, Integer>();
		int cont = 1;
		for(int i='a';i<='z';++i)l.put((char)i, cont++);
		for(int i='A';i<='Z';++i)l.put((char)i, cont++);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int suma = 0;
			for(int i=0;i<linea.length();++i)suma+=l.get(linea.charAt(i));
			if(!primos[suma])sb.append("It is a prime word.\n");
			else sb.append("It is not a prime word.\n");
		}
		System.out.print(new String(sb));
	}

}
