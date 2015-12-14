

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Uva369 {

	public static void main(String[] args) throws Exception {
		BigInteger[] f = new BigInteger[101];
		f[0]=f[1]=BigInteger.ONE;
		for(int i=2;i<f.length;++i){
			f[i]= f[i-1].multiply(new BigInteger(i+""));
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea; (linea = bf.readLine())!=null ;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken().trim());
			int b = Integer.parseInt(st.nextToken().trim());
			if(a==0 && b == 0)break;
			sb.append(a+" things taken "+b+" at a time is "+f[a].divide(f[a-b].multiply(f[b]))+" exactly.\n");
		}
		System.out.print(new String(sb));
	}

}
