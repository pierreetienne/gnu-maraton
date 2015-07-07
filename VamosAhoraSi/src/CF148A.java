import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;


public class CF148A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			Set<Integer> v = new TreeSet<Integer>();
			v.add(Integer.parseInt(ln));
			v.add(Integer.parseInt(in.readLine()));
			v.add(Integer.parseInt(in.readLine()));
			v.add(Integer.parseInt(in.readLine()));
			Set<Integer> values = new TreeSet<Integer>();
			int total = Integer.parseInt(in.readLine());
			boolean c = v.contains(1);
			int cont = c?total:0;
			for(int i=1;i<=total&&!c;++i){
				for(Integer value : v){
					if(i%value==0&&!values.contains(i)){
						values.add(i);
						cont++;
					}
				}
			}
			System.out.println(cont);
		}

	}

}
