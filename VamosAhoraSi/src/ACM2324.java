

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ACM2324 {
	
	static int[][] valores = new int[][]{{5,-1,-2,-1,-3},{-1,5,-3,-2,-4},{-2,-3,5,-2,-2},{-1,-2,-2,5,-1},{-3,-4,-2,-1,0}};

	static HashMap<Character, Integer> k ;
	
	static char p[],m[];
	
	
	static int[][] memo;
	
	static int f(int i, int j){
		if(i<p.length && j < m.length){
			
		}
		return 0;
	}
	
	
	public static void main(String[] args ) throws Exception {
		k= new HashMap<Character, Integer>();
		k.put('A',0);k.put('C', 1);k.put('G',2);k.put('T', 3);k.put('-', 4);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());st.nextToken();
			p = st.nextToken().toCharArray();
			st = new StringTokenizer(in.readLine());st.nextToken();
			m = st.nextToken().toCharArray();
			
			System.out.println(f(0,0));
			
		}
	}
}
