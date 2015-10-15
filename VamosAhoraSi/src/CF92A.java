import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF92A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			int cont = 0, res = 0;
			while(true){
				cont++;
				int aux = m - cont;
				if(aux < 0 ){
					res = m;
					break;
				}else
					m=aux ;
				cont = cont%n;
			}
			System.out.println(res);
		}
	}
}
