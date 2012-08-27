import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class Uva10062 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			HashMap<Character, Integer> m = new HashMap<Character, Integer>();
			for(int i=0;i<linea.length();++i){
				if(m.get(linea.charAt(i))==null)
					m.put(linea.charAt(i), 1);
				else 
					m.put(linea.charAt(i), m.get(linea.charAt(i))+1);
			}
			
			int[][] c = new int[m.size()][2];
			int pos = 0;
			for(Character i: m.keySet()){
				c[pos][0]=(int)i;
				c[pos++][1]=m.get(i);
			}
			Arrays.sort(c, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (o1[1]-o2[1]==0)?o2[0]-o1[0]:o1[1]-o2[1];
				}
			});
				
			for(int i=0;i<c.length;++i){
				sb.append(c[i][0]+" "+c[i][1]+"\n");
			}
			sb.append("\n");
		}
		System.out.print(new String(sb.substring(0, sb.length()-1)));
	}
}
