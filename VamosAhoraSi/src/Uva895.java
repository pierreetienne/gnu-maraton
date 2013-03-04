import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Uva895 {
//NOOOOOOOOOOOOOOOOOOOOOOOOOOo
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		ArrayList<String> dic = new ArrayList<String>();
		while(!linea.trim().equals("#")){
			char[] x =linea.toCharArray();
			Arrays.sort(x);
			dic.add(new String(x));
			linea = in.readLine();
		}
		linea = in.readLine();
		while(!linea.trim().equals("#")){
			char[] l = new char[(linea.length()/2)+1];
			for(int i=0,j=0;i<linea.length();i+=2,j++)
				l[j]=linea.charAt(i);
			Arrays.sort(l);
			String pal = new String(l);
			char[] aux = new String(l).toCharArray();
			int cont = 0;
			for(int i=0;i<dic.size();++i)
			{
				
			}
			System.out.println(cont);
			linea = in.readLine();
		}
			
	}

}
