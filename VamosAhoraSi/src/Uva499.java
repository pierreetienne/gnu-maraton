import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class Uva499 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea ;(linea = bf.readLine())!=null;){
			HashMap<Character, Integer> m = new HashMap<Character, Integer>();
			int max = 0;
			for(int i=0;i<linea.length();++i){
				if(linea.charAt(i)!= ' ' && Character.isLetter(linea.charAt(i))){
					if(m.get(linea.charAt(i))==null){
						m.put(linea.charAt(i),1);
					}else
					{
						m.put(linea.charAt(i),m.get(linea.charAt(i))+1);
					}
					if(m.get(linea.charAt(i)) > max)
						max = m.get(linea.charAt(i));
				}
			}
			
			if(max > 0 ){
			StringBuilder sbMinu = new StringBuilder();
			StringBuilder sbMayus = new StringBuilder();
			for(Character x :m.keySet()){
				if(m.get(x) == max){
					if(Character.isUpperCase(x))
						sbMayus.append(x);
					else
						sbMinu.append(x);
				}
			}
			
			char[] y = (new String(sbMayus)).toCharArray();
			Arrays.sort(y);
			sb.append(new String(y));
			
			y = (new String(sbMinu)).toCharArray();
			Arrays.sort(y);
 			sb.append(new String(y)+" "+max+"\n");}
			else{
				sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz 0\n");
			}
		}
		System.out.print(new String(sb));
	}

}
