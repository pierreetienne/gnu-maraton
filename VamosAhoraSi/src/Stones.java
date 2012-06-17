

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Stones {
	static int[][][] m ;
	static int f(int i, int j , int  p ){
		if(i<=0)return (p==0)?1:0;
		if(m[i][j][p]!= -1)
			return m[i][j][p];
		for(int s = 1;s<=j;++s){
			if(f(i-s,2*s,(p==0)?1:0)==p){
				return m[i][j][p]=p;
			}
		}
		return m[i][j][p]=(p==0)?1:0;
	}
	public static void main(String[] args)throws Exception {
		m = new int[1005][2010][2];
		for(int[][] x: m)for(int[] y : x)Arrays.fill(y, -1);
		String r[] = new String[1001];
		for(int i=2;i<=1000;++i)
			r[i]=(f(i,i-1,0)==0)?"Alicia":"Roberto";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(C!=0){
			sb.append(r[C]+"\n");
			C = Integer.parseInt(bf.readLine());
		}
		System.out.print(new String(sb));
	}
}
