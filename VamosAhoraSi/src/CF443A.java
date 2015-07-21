import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;


public class CF443A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			ln = ln.replaceAll("\\{", "");
			ln = ln.replaceAll("\\}", "");
			String aux[] = ln.split(",");
			Set<String> set = new TreeSet<String>();
			for(int i=0;i<aux.length;++i){
				if(!aux[i].trim().isEmpty())
					set.add(aux[i].trim());
			}
			System.out.println(set.size());
		}
	}

}
