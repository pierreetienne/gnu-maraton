import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Uva11805 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine().trim());
		int caso = 1;
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken());
			int[]  x = new int[A];
			for(int i=0;i<x.length;++i)
				x[i]=i+1;
			
			int fin = K;
			for(int i=K, j = 0;j<P;++i,++j){
				fin = x[i%A];
			}
			sb.append("Case "+(caso++)+": "+fin+"\n");
		}
		System.out.print(new String(sb));
	}
}
