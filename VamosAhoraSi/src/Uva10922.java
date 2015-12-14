import java.io.BufferedReader;
import java.io.InputStreamReader;

//Accep
public class Uva10922 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			if(linea.trim().equals("0"))break;
			char[] m = linea.toCharArray();
			int sum = 0;
			for(int i=0;i<m.length;++i)	sum+=m[i]-'0';
			int profundidad = 0 ;
			while(sum% 9 ==0 && sum !=9){
				char[] x  = (sum+"").toCharArray();
				sum = 0;
				for(int i=0;i<x.length;++i)	sum+=x[i]-'0';
				profundidad++;
			}
			if(sum%9==0){profundidad++;
				sb.append(linea+" is a multiple of 9 and has 9-degree "+profundidad+".\n");
			}
			else
			{
				sb.append(linea+ " is not a multiple of 9.\n");
			}
		}
		System.out.print(new String(sb));
	}

}
