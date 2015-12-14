import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva445 {

	static StringBuilder sb ;
	static void f (char c, int num){
		for(int i=0;i<num;++i)
			sb.append(c);
	}
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		for(String linea;(linea= bf.readLine())!= null;){
			if(linea.trim().equals(""))
				sb.append("\n");
			else
			{
				int cant =0;
				for(int i=0;i<linea.length();++i){
					if(Character.isDigit(linea.charAt(i)))
						cant+= linea.charAt(i)-'0';
					else if(linea.charAt(i)=='b'){
						f(' ',cant);
						cant=0;
					}else if(linea.charAt(i)=='!'){
						sb.append("\n");
						cant=0;
					}else
					{
						f(linea.charAt(i), cant);
						cant=0;
					}
				}
				sb.append("\n");
			}
		}
		System.out.print(new String(sb));
	}
}