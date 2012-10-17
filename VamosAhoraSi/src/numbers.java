import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


public class numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String[] x = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<x.length;++i){
			for(int j=0;j<x[i].length();++j)
				map.put(x[i].charAt(j), i+2);
		}
		BufferedReader bf = new BufferedReader(new FileReader("numbers"));
		
		int N = Integer.parseInt(bf.readLine());
		StringBuilder s = new StringBuilder();
		while(N-->0){
			String linea = bf.readLine();
			String num = "";
			for(int i=0;i<linea.length();++i){
				num+=map.get(Character.toUpperCase(linea.charAt(i)))+"";
			}
			StringBuilder sb = new StringBuilder(num);
			if(sb.reverse().toString().equals(num))
				s.append("YES\n");
			else
				s.append("NO\n");
		}
		System.out.print(new String(s));
	}

}
