import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11878 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cont = 0;
		for(String linea;(linea = bf.readLine())!=null;){
			if(linea.indexOf('?')==-1){
				if(linea.indexOf('+')!=-1){
					StringTokenizer st = new StringTokenizer(linea, "+");
					int a = Integer.parseInt(st.nextToken().trim());
					String aux = st.nextToken();
					st = new StringTokenizer(aux, "=");
					int b = Integer.parseInt(st.nextToken().trim());
					int r = Integer.parseInt(st.nextToken().trim());
					if(a+b ==r)
						cont++;
				}
				else
				{
					StringTokenizer st = new StringTokenizer(linea, "-");
					int a = Integer.parseInt(st.nextToken().trim());
					String aux = st.nextToken();
					st = new StringTokenizer(aux, "=");
					int b = Integer.parseInt(st.nextToken().trim());
					int r = Integer.parseInt(st.nextToken().trim());
					if(a-b ==r)
						cont++;
				}
			}
		}
		System.out.println(cont);
	}
}
