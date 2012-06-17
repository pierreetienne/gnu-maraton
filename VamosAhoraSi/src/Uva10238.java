

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Uva10238 {

	static int tiros, maximoValorDado, valor;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		while((linea = in.readLine())!= null){
			StringTokenizer st = new StringTokenizer(linea);
			maximoValorDado =Integer.parseInt(st.nextToken());
			tiros = Integer.parseInt(st.nextToken());
			valor =Integer.parseInt(st.nextToken());
			
			int[][] m = new int[100][100];
			for(int i=1;i<=6;++i){
				m[0][i]=i;
			}
			
			while(true){
				
			}
			
		}

	}

}
