

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uva10298 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = bf.readLine().trim();
		while(!linea.equals(".")){
			for(int i=0;i<linea.length();i++)
			{
				boolean encontre = true;
				for(int j=0;j<linea.length()&& i+j<linea.length()&&encontre;++j){
					if(linea.charAt(j)!= linea.charAt(i+j))
						encontre=false;
				}
				if(encontre)
					System.out.println("aa " + i);
			}
			linea = bf.readLine().trim();
			
		}
	}
	

}
