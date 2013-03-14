
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Uva532 {

	static int[] dx = {1,-1,0, 0,0 ,0};
	static int[] dy = {0, 0,1,-1,0 ,0};
	static int[] dz = {0, 0,0, 0,1,-1};


	public static void main(String[] args) throws Exception{
//		System.out.println("ini");
//		for(int i=0;i<30;++i){
//			for(int j=0;j<30;++j){
//				for(int p=0;p<30;++p){
//					System.out.print(".");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int A = parseInt(st.nextToken()), B = parseInt(st.nextToken()), C = parseInt(st.nextToken());
			if(A == 0 && B == 0 && C == 0 )break;
			char[][][] m = new char[A][B][];
			int posX = -1;
			int posY = -1;
			int posZ = -1;
			for(int i=0;i<A;++i){
				for(int j=0;j<B;++j){
					String n = in.readLine().trim();
					m[i][j] = n.toCharArray();
					int npos = n.indexOf('S');
					if(npos!=-1){
						posX = i;
						posY = j;
						posZ = npos; 
					}
				}
				in.readLine();
			}
			Queue<Integer> c1 = new LinkedList<Integer>();
			Queue<Integer> c2 = new LinkedList<Integer>();
			Queue<Integer> c3 = new LinkedList<Integer>();
			Queue<Integer> c4 = new LinkedList<Integer>();
			c1.add(posX);
			c2.add(posY);
			c3.add(posZ);
			c4.add(0);
			int sol = -1;
			while(!c1.isEmpty()){
				int x = c1.poll();
				int y = c2.poll();
				int z = c3.poll();
				int d = c4.poll();
				m[x][y][z]='#';
				for(int i=0;i<dx.length;++i){
					int cX = x+dx[i];
					int cY = y+dy[i];
					int cZ = z+dz[i];
					if(cX<A && cX>=0 && cY<B && cY>=0 && cZ<C && cZ>=0 && m[cX][cY][cZ]!='#'){
						if(m[cX][cY][cZ]=='E'){
							sol=d+1;
							break;
						}
						c1.add(cX);
						c2.add(cY);
						c3.add(cZ);
						c4.add(d+1);
						m[cX][cY][cZ]='#';
					}
				}
				if(sol!= -1)break;
			}
			if(sol ==-1)sb.append("Trapped!\n");
			else sb.append("Escaped in "+sol+" minute(s).\n");
		}
		System.out.print(new String(sb));
	}

}
