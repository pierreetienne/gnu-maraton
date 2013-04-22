import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class Uva10815 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<String> set = new TreeSet<String>();
		for(String ln;(ln=in.readLine())!=null;){
			String aux = "";
			for(int i=0;i<ln.length();++i){
				if(Character.isLetter(ln.charAt(i)) || ln.charAt(i)=='\''){
					if(ln.charAt(i)!='\'')
						aux+=Character.toLowerCase(ln.charAt(i));
				}
				else{
					if(aux.length()>0){
						set.add(aux);
						aux="";
					}
				}
			}
			if(aux.length()>0){
				set.add(aux);
				aux="";
			}

		}
		StringBuilder sb = new StringBuilder();
		for(String x:set)
			sb.append(x+"\n");
		System.out.print(new String(sb));


	}

}
