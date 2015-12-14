

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10300 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			int F = Integer.parseInt(bf.readLine());
			StringTokenizer st = null;
			long total =0;
			while(F-->0){
				st = new StringTokenizer(bf.readLine());
				int tamanioGranja = Integer.parseInt(st.nextToken());
				st.nextToken();
				int envi = Integer.parseInt(st.nextToken());
				total += (tamanioGranja*envi); 
			}
			System.out.println(total);
		}
	}

}
