import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.math.BigInteger;


public class Uva10106 {
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			BigInteger  a = new BigInteger(linea.trim());
			BigInteger b = new BigInteger(bf.readLine().trim());
			sb.append(a.multiply(b)+"\n");
		}
		System.out.print(new String(sb));
	}
}
