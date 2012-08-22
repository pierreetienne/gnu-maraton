import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11192 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea ;(linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken());
			if(N == 0)break;
			String palabra = st.nextToken();
			StringBuilder aux = new StringBuilder();
			for(int i=0;i<palabra.length();++i){
				System.out.println(N%(i+1) + " n  " +  N + " i " +  i);
				if((i+1)%N == 0){
					sb.append(aux.reverse().toString());
					aux = new StringBuilder();
				}
				else
					aux.append(palabra.charAt(i));
			}
			sb.append(aux.reverse()+"\n");
		}
		System.out.print(new String(sb));
	}

}
