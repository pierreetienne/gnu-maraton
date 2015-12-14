import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Uva401 {

	public static void main(String[] args) throws Exception {
		HashMap<Character,Character> m = new HashMap<Character, Character>();
		m.put('A', 'A');
		m.put('E', '3');
		m.put('H', 'H');
		m.put('I', 'I');
		m.put('J', 'L');
		m.put('L', 'J');
		m.put('M', 'M');
		m.put('O', 'O');
		m.put('S', '2');
		m.put('T', 'T');
		m.put('U', 'U');
		m.put('V', 'V');
		m.put('W', 'W');
		m.put('X', 'X');
		m.put('Y', 'Y');
		m.put('Z', '5');
		m.put('1', '1');
		m.put('2', 'S');
		m.put('3', 'E');
		m.put('5', 'Z');
		m.put('8', '8');
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			boolean mirror = true;
			boolean palindrome = true;
			linea = linea.trim();
			for(int i=0, j=linea.length()-1; i<=j;++i,--j){
				if(linea.charAt(i)!= linea.charAt(j))
					palindrome =false;
				if(m.get(linea.charAt(j))==null || linea.charAt(i)!= m.get(linea.charAt(j)))
					mirror=false;
			}
			if(!mirror && !palindrome)
				sb.append(linea+" -- is not a palindrome.\n\n");
			else if(palindrome && !mirror)
				sb.append(linea+ " -- is a regular palindrome.\n\n");
			else if(!palindrome && mirror)
				sb.append(linea+ " -- is a mirrored string.\n\n");
			else if(mirror && palindrome)
				sb.append(linea+ " -- is a mirrored palindrome.\n\n");
		}	
		System.out.print(new String(sb));
	}

}
