import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class CF550A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			Set<Integer> sA = new TreeSet<Integer>();
			Set<Integer> sB = new TreeSet<Integer>();
			for(int i=1;i<ln.length();++i){
				if(ln.charAt(i-1)=='A' && ln.charAt(i)=='B'){
					sA.add(i-1);
				}
				else if(ln.charAt(i-1)=='B'&&ln.charAt(i)=='A'){
					sB.add(i-1);
				}
			}
			boolean ok = false;
			if(sA.size()>0 && sB.size()>0){
				for(Integer x : sA){
					int a = x.intValue();
					int b = x.intValue()+1;
					for(Integer y : sB){
						int c = y.intValue();
						int d = c+1;
						if(a!= c && b != d && a != d && b != c)
							ok = true;
					}
					if(ok)break;
				}
			}
			
			System.out.println(ok?"YES":"NO");
		}
	}
	
	

}
