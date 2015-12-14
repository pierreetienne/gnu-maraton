import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class CF520A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			char[] m = in.readLine().toCharArray();
			Set<Character> s = new TreeSet<Character>();
			for(int i=0;i<m.length;++i){
				s.add(Character.toLowerCase(m[i]));
			}
			if(s.size()==26)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
