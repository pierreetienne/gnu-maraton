

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Uva10004 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N!=0){
			int M = Integer.parseInt(bf.readLine());
			int[][] m = new int[N][N];
			for(int i=0;i<M;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken()); 
				m[x][y] = -1;
				m[y][x] = -1;
			}
//			for(int i=0;i<m.length;++i){
//				for(int j=0;j<m.length;++j){
//					System.out.print(m[i][j]+" " );
//				}
//				System.out.println();
//			}
			boolean bicoloring = true;
			Queue<Integer> cola = new LinkedList<Integer>();
			int[] colores = new int[N];
			colores[0]=2;
			cola.add(0);
			while(!cola.isEmpty()&&bicoloring){
				int val = cola.poll();
				int color=(colores[val]==2)?1:2;
				for(int i=0;i<N;++i){
					if(m[val][i]==-1&&colores[i]==0){
						colores[i]=color;
						cola.add(i);
					}else if(m[val][i]==-1 && colores[i]!=0 && colores[i]!=color&&i!=val ){
						bicoloring=false;
					}
				}
			}
			System.out.println((bicoloring)?"BICOLORABLE.":"NOT BICOLORABLE.");
			N = Integer.parseInt(bf.readLine());
		}

	}

}
