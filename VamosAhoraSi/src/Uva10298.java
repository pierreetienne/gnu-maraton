

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uva10298 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = bf.readLine().trim();
		StringBuilder sb = new StringBuilder();
		while(!linea.equals(".")){
			int cont = 0;
			for(int i=0;i<linea.length()/2;i++)
			{
				cont=1;
				boolean encontre = false;
				for(int j=i+1, p=0;p<linea.length()&& j<linea.length() && !encontre;++j, ++p){
					if(linea.charAt(p)==linea.charAt(j))
						cont++;
					else 
						encontre=true;
				}
				if(!encontre){
					cont=linea.length()/(i+1);
					break;
				}
			}
			sb.append(cont+"\n");
			linea = bf.readLine().trim();
		}
		System.out.print(new String(sb));
	}
	

}
