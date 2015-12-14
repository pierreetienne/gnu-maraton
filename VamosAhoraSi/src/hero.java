import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Ad hoc 
 * @author PierreEtienne
 *
 */
public class hero {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N != 0){
			int cont = N;
			for(int i=0;i<N;++i){
				String linea = bf.readLine();
				if(linea.indexOf("CD")!=-1)
					cont--;
			}
			sb.append(cont+"\n");
			N = Integer.parseInt(bf.readLine());
		}
		System.out.print(new String(sb));
	}

}
