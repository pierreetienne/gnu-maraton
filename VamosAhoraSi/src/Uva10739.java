

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Uva10739 {

	static String linea ;
	
	static int memo[][];
	
	static int f(int i , int j){
		if(i>=j)return 0;
		if(memo[i][j]!=-1)return memo[i][j];
		if(linea.charAt(i)==linea.charAt(j))return memo[i][j] = f(i+1,j-1);
		return memo[i][j]=	Math.min(f(i+1,j), Math.min(f(i,j-1), f(i+1,j-1)))+1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		memo = new int[1001][1001];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine()),casos = 1;
		StringBuilder sb = new StringBuilder();
		while(C-->0){
			for(int[] x :memo)Arrays.fill(x, -1);
			linea = bf.readLine();
			sb.append("Case "+(casos++)+": "+f(0,linea.length()-1)+"\n");
		}
		System.out.print(new String(sb));
	}

}
