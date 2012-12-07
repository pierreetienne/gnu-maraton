import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Uva454 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		bf.readLine();
		StringBuilder sb = new StringBuilder();
		ArrayList<char[]> palabras = new ArrayList<char[]>(); 
		while(N-->0){
			while(true)
			{
				char[] linea = bf.readLine().toCharArray();
				if(linea == null ||(linea != null &&linea.length==0))
				{
					int[] caracters = new int[257];
					for(int i=0;i<palabras.size();++i){
						Arrays.fill(caracters, 0);
						char[] ini = palabras.get(i);
						for(int j=0;j<ini.length;++j){
							if(Character.isLetter(ini[j]))
								caracters[ini[j]]++;
						}
						for(int j=i+1;j<palabras.size();++j){
							int[] cpy = Arrays.copyOf(caracters, caracters.length);
							char[] m = palabras.get(j);
							boolean valido = true;
							for(int p=0;p<m.length&&valido;++p){
								if(Character.isLetter(m[p])){
									cpy[m[p]]--;
									if(cpy[m[p]]<0)valido=false;
								}
							}
							if(valido){
								for(int p=0;p<cpy.length&&valido;++p)if(cpy[p]!=0)valido=false;
								if(valido)
									sb.append(new String(ini) + " = " +new String(m)+"\n");
							}
						}
					}
					if(N-1 >0 )sb.append("\n");
					palabras.clear();
					break;
				}
				else
					palabras.add(linea);
			}
		}
		System.out.print(new String(sb));
	}
}