import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class Uva10789 {

	public static void main(String[] args)throws Exception {
		boolean[] primos = new boolean[2005];
		primos[0]=primos[1]=true;
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i){
				primos[j]=true;
			}
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int casos = 1;
		int N = Integer.parseInt(bf.readLine().trim());
		while(N-->0){
			String linea = bf.readLine();
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0;i<linea.length();++i){
				if(map.get(linea.charAt(i))==null)
					map.put(linea.charAt(i),1);
				else
					map.put(linea.charAt(i),map.get(linea.charAt(i))+1);
			}
			sb.append("Case "+(casos++)+": ");
			String letras = "";
			for(Character x : map.keySet()){
				if(!primos[map.get(x)]){
					letras += x;
				}
			}
			if(letras.length()==0)sb.append("empty");
			else {
				char[] xxx = letras.toCharArray();
				Arrays.sort(xxx);
				sb.append(new String(xxx));
			}
			sb.append("\n");	
		}
		System.out.print(new String(sb));
	}

}
