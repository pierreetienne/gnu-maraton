
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class FindtheTelephone {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		HashMap<Character, Integer> val = new HashMap<Character, Integer>();
		char a = 'A';
		for(int i=0;i<26;++i){
			if(i<3)
				val.put(a, 2);
			else if(i<6)
				val.put(a, 3);
			else if(i < 9)
				val.put(a, 4);
			else if(i<12)
				val.put(a, 5);
			else if(i<15)
				val.put(a, 6);
			else if(i<19)
				val.put(a, 7);
			else if(i<22)
				val.put(a, 8);
			else 
				val.put(a, 9);
			a++;
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line= null;
		while((line=bf.readLine())!=null){
			for(int i=0;i<line.length();++i){
				if(Character.isLetter(line.charAt(i)))
					System.out.print(val.get(line.charAt(i)));
				else
					System.out.print(line.charAt(i));
			}
			System.out.println();
		}
	}
}
