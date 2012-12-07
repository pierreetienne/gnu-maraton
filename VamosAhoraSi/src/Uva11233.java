import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//Acept
public class Uva11233 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			HashMap <String, String> irre = new HashMap<String, String>();
			int L = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			for(int i=0;i<L;++i){
				st = new StringTokenizer(bf.readLine());
				irre.put(st.nextToken(), st.nextToken());
			}
			for(int i=0;i<N;++i){
				StringBuilder l = new StringBuilder(bf.readLine());
				if(irre.get(l.toString())!=null)
					sb.append(irre.get(l.toString())+"\n");
				else{
					if(l.charAt(l.length()-1)=='y' && l.length()>2 && isConsonante(l, l.length()-2)){
						l.setCharAt(l.length()-1, 'i');
						l.append("es");
					}
					else if(l.charAt(l.length()-1)=='o' ||l.charAt(l.length()-1)=='s' ||l.charAt(l.length()-1)=='x' || l.lastIndexOf("ch") == l.length()-2 || l.lastIndexOf("sh")==l.length()-2)
						l.append("es");
					else
						l.append("s");
					sb.append(l+"\n");
				}
			}
		}
		System.out.print(new String(sb));
	}
	static boolean isConsonante(StringBuilder s, int index ){
		return !(s.charAt(index)=='a'||s.charAt(index)=='e'||s.charAt(index)=='i'||s.charAt(index)=='o'||s.charAt(index)=='u');
	}
}
