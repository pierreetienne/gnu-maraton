import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;


public class CF519A {

	
	
	public static void main(String[] args) throws Exception{
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		map.put('q',9 );
		map.put('r',5 );
		map.put('b',3 );
		map.put('n',3 );
		map.put('p',1 );
		map.put('k',0 );
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			char[][] m = new char[8][];
			int a = 0;
			int b = 0;
			for(int i=0;i<8;++i){
				m[i]=ln.toCharArray();
				if(i+1<8)
					ln = in.readLine();
				for(int j=0;j<m[i].length;++j){
					if(m[i][j]!='.'){
						if(Character.isLowerCase(m[i][j]))
							a+=map.get(Character.toLowerCase(m[i][j]));
						else 
							b+=map.get(Character.toLowerCase(m[i][j]));
					}
				}
			}
			if(a>b)System.out.println("Black");
			else if(b>a)System.out.println("White");
			else System.out.println("Draw");
				
			
			
		}

	}

}
