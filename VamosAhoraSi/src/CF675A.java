import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF675A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int aux = -1;
			int aux2 = -1;
			boolean ok = false;
			while(!ok){
				if(aux != -1 )
					aux2 = aux;
				aux = c + a;
				System.out.println(a+  " " + aux);
				if(aux==b||a==b|| aux2 %b ==0 ){
					ok = true;
				}else{
					a = aux;
				}
				boolean asc = aux > aux2;
				if(aux2!=-1 && asc && aux > b)
					break;
				if(aux2!=-1 && !asc && aux < b)
					break;
			}
			System.out.println(ok?"YES":"NO");
		}
	}

}
