import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class CF141A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
			for(int i=0;i<ln.length();++i){
				char x = ln.charAt(i);
				if(map.get(x)==null)
					map.put(x, 1);
				else
					map.put(x,map.get(x)+1);
			}
			ln = in.readLine();
			for(int i=0;i<ln.length();++i){
				char x = ln.charAt(i);
				if(map.get(x)==null)
					map.put(x, 1);
				else
					map.put(x,map.get(x)+1);
			}
			ln = in.readLine();
			boolean ok = false;
			for(int i=0;i<ln.length()&&!ok;++i){
				char x = ln.charAt(i);
				if(map.get(x)==null)
					ok = true;
				else{
					map.put(x,map.get(x)-1);
					if(map.get(x).intValue()<0)
						ok =true;
				}
			}
			
			for(Character key : map.keySet()){
				if(map.get(key).intValue()>0){
					ok = true;
					break;
				}
			}
			if(ok)
				System.out.println("NO");
			else 
				System.out.println("YES");
					
		}
	}

}
