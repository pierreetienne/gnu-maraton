import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;


public class Uva10222 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		map.put('e', 'q');
		map.put('r', 'w');
		map.put('t', 'e');
		map.put('y', 'r');
		map.put('u', 't');
		map.put('i', 'y');
		map.put('o', 'u');
		map.put('p', 'i');
		map.put('[', 'o');
		map.put(']', 'p');
		map.put('\\', '[');
		map.put('d', 'a');
		map.put('f', 's');
		map.put('h', 'f');
		map.put('j', 'g');
		map.put('k', 'h');
		map.put('l', 'j');
		map.put(';', 'k');
		map.put('\'', 'l');
		map.put('c', 'z');
		map.put('v', 'x');
		map.put('b', 'c');
		map.put('n', 'v');
		map.put('m', 'b');
		map.put(',', 'n');
		map.put('.', 'm');
		map.put('/', ',');
//		map.put('3', '1');
//		map.put('4', '2');
//		map.put('5', '3');
//		map.put('6', '4');
//		map.put('7', '5');
//		map.put('8', '6');
//		map.put('9', '7');
//		map.put('0', '8');
//		map.put('-', '9');
//		map.put('=', '0');
		map.put(' ', ' ');
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c;
		
		while((int)(c=(char) in.read())!=65535){
			if(map.containsKey(Character.toLowerCase(c)))
				sb.append(map.get(Character.toLowerCase(c)));
			else sb.append(c);
		}
		System.out.print(new String(sb));
	}

}
