import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class CF471A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st= new StringTokenizer(ln);
			int[] a = new int[6];
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			
			for(int i=0;i<a.length;++i){
				a[i] = Integer.parseInt(st.nextToken());
				if(map.get(a[i]) ==null)
					map.put(a[i], 1);
				else
					map.put(a[i], map.get(a[i])+1);
			}
			if(map.size()==1){
				System.out.println("Elephant");
			}else if(map.size()==2){
				Iterator<Integer> s = map.keySet().iterator();
				int x = s.next();
				int y = s.next();
				if((map.get(x)==5 || map.get(y)==5 )&& ( map.get(x)== 1 || map.get(y)==1)){
					System.out.println("Bear");
				}else if((map.get(x)==4 || map.get(y)==4 )&& ( map.get(x)== 2 || map.get(y)==2)){
					System.out.println("Elephant");
				}else
					System.out.println("Alien");
			}else if(map.size()==3){
				Iterator<Integer> s = map.keySet().iterator();
				int x = s.next();
				int y = s.next();
				int z = s.next();
				if((map.get(x) == 4 || map.get(y)== 4 || map.get(z)==4 ) ){
					System.out.println("Bear");
				}else
					System.out.println("Alien");
				
			}else
				System.out.println("Alien");
			
			
			
		}

	}

}
