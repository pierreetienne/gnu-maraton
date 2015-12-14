import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Uva439 {

   static int[] dx = {1,-1,1,-1,2,2,-2,-2};
   static int[] dy = {2,2,-2,-2,1,-1,1,-1};
   
	public static void main(String[] args) throws Exception {
			
		boolean[][] m = new boolean[8][8];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = in.readLine())!=null;){
			for(boolean[] xx : m){
				Arrays.fill(xx,false);
			}
			StringTokenizer st = new StringTokenizer(linea);
			String a = st.nextToken();
			int p = a.charAt(0)-'a';
			int q = Integer.parseInt(a.substring(1))-1;
				
			String b = st.nextToken();
			int x = b.charAt(0)-'a';
			int y = Integer.parseInt(b.substring(1))-1;
			
			Queue<Integer> c1 = new LinkedList<Integer>();
			Queue<Integer> c2 = new LinkedList<Integer>();
			Queue<Integer> c3 = new LinkedList<Integer>();
			c1.add(p);
			c2.add(q);
			c3.add(0);
			int res = -1;
			while(!c1.isEmpty() && res == -1){
				int r = c1.poll();
				int s = c2.poll();
				int d = c3.poll();
				if(r==x && s==y)
					res = d;
				for(int i=0;i<dx.length;++i){
					int cX = r+dx[i];
					int cY = s+dy[i];
					if(cX<8&&cX>=0 && cY<8 && cY>=0 && !m[cX][cY]){
						if(cX == x && cY == y){
							res = d+1;
							break;
						}
						c1.add(cX);
						c2.add(s+dy[i]);
						c3.add(d+1);
						m[cX][cY]=true;
					}
				}
				m[r][s]=true;
			}
			sb.append("To get from "+a+" to "+b+" takes "+res+" knight moves.\n");
		
		}
		System.out.print(new String(sb));
	}

}
