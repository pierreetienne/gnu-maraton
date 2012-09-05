import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Uva417 {

	public static void main(String[] args) throws Exception{
		Queue<String> cola = new LinkedList<String>();
		for(int i='a' ; i<='z';++i)cola.add(((char)i)+"");
		HashMap<String, Integer> h = new HashMap<String, Integer>();	
		int cont = 1;
		while(!cola.isEmpty())
		{
			String x = cola.poll();
			h.put(x, cont++);
			if(x.length()+1 <=5)
				for(int i=x.charAt(x.length()-1)+1;i <= 'z';++i)cola.add(x+(char)i);
		}
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			linea = linea.trim();
			if(linea.length()==1)
				sb.append((linea.charAt(0)-'a'+1)+"\n");
			else 
			{
				boolean valida = true;
				for(int i=1;i<linea.length()&&valida;++i)
					if(linea.charAt(i-1)>linea.charAt(i))valida=false;

				if(!valida)sb.append("0\n");
				else
					sb.append(h.get(linea)+"\n");
			}
		}
		System.out.print(new String(sb));
	}

}
