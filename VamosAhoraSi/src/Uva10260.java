import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.HashMap;


public class Uva10260 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character,Integer>  m = new HashMap<Character, Integer>();
		String []a = new String[]{"BFPV","CGJKQSXZ","DT","L","MN","R"};
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length();++j)
				m.put(a[i].charAt(j), i+1);
		}
		StringBuilder sb = new StringBuilder();
		for(String linea ;(linea = bf.readLine())!=null;){
			int[] val = new int[linea.length()];
			String v = "";
			for(int i=0;i<linea.length();++i){
				if(m.get(linea.charAt(i))!=null){
					val[i] = m.get(linea.charAt(i));
					if(i==0){
						v+=val[i]+"";
					}
					else
					{
						if(val[i-1] != m.get(linea.charAt(i))){
							v+=val[i]+"";
						}
					}
					
				}
			}
			sb.append(v+"\n");
		}
		System.out.print(new String(sb));
	}
}
