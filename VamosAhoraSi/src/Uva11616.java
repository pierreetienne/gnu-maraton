import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class Uva11616 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		

	}
	static String[] r1={"I","X","C","M"},r2={"V","L","D"};
	static String intToRomano(int n) {
		if (n<=0 || n>=4000) return null; String s="";
		for (int i=0; n>0; i++, n/=10) {
			int d=(n%10),u=d%5;
			if (u==4) s=r1[i]+(d==4?r2[i]:r1[i+1])+s;
			else {for (int k=0; k<u; k++) s=r1[i]+s; if (d>4) s=r2[i]+s;}
		}
		return s;
	}
	
	static Map<String,Integer> mapRomanos=new TreeMap<String,Integer>();
	static int romanoToInt(String s) {
	if (mapRomanos.isEmpty()) for (int i=1; i<4000; i++) mapRomanos.put(intToRomano(i),i);
	return mapRomanos.containsKey(s)?mapRomanos.get(s):-1;
	}
}

