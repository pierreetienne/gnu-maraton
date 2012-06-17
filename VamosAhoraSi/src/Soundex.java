
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Soundex {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		HashMap<Character, Integer> val = new HashMap<Character, Integer>();
		val.put('B', 1);val.put('F', 1);val.put('P', 1);val.put('V', 1);
		val.put('C', 2);val.put('G', 2);val.put('J', 2);val.put('K', 2);val.put('Q', 2);val.put('S', 2);val.put('X', 2);val.put('Z', 2);
		val.put('D', 3);val.put('T', 3);
		val.put('L', 4);
		val.put('M', 5);val.put('N', 5);
		val.put('R', 6);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bf.readLine())!=null){
		}
	}

}
