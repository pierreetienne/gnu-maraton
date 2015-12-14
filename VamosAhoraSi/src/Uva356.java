

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Uva356 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		long[][] m = new long[151][2];
		m[1][1]=4;
		m[2][0]=12;
		m[2][1]=4;
		
		int d = 2;
		for(int i=3;i<151;++i){
			m[i][0]=(d*d)+8;
			m[i][1]=4*((2*(i))-1);
			d+=2;
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			int N = Integer.parseInt(linea);
			sb.append("In the case n = "+N+", "+m[N][1]+" cells contain segments of the circle.\nThere are "+m[N][0]+" cells completely contained in the circle.\n\n");
		}
		System.out.print(new String(sb));
	}

}
