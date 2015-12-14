import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;


public class Uva11286 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			if(N==0)break;
			HashMap<String , Integer> h = new HashMap<String, Integer>();
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int[] m = new int[5];
				for(int j=0;j<5;++j)m[j]=Integer.parseInt(st.nextToken());
				Arrays.sort(m);
				String arr = Arrays.toString(m);
				if(h.get(arr)==null)
					h.put(arr, 1);
				else
					h.put(arr, h.get(arr)+1);
			}
			int c = -1;
			boolean iguales = true;
			int mayor = 0 ;
			int suma = 0;
			
			List<Integer> xx = new ArrayList<Integer>(h.values());
			c = xx.get(0);
			suma = c;
			for(int i=1;i<xx.size();++i){
				if(c != xx.get(i))
					iguales=false;
				if(xx.get(i)>mayor)
					mayor = xx.get(i);
				suma +=xx.get(i);
			}	
			
			if(iguales)
				sb.append(suma);
			else
				sb.append(mayor);
		
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
