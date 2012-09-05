import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;


public class LA3138 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while(!(N == 0 && R == 0)){
			st = new StringTokenizer(bf.readLine());
			int[] costos = new int[N];
			for(int i=0;i<N;++i)costos[i] = Integer.parseInt(st.nextToken());
			int[][] mAdy = new int[N][N];
			for(int i=0;i<N-1;++i){
				st = new StringTokenizer(bf.readLine());
				mAdy[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 1;
			}
			Stack<Integer> pila = new Stack<Integer>();
			pila.add(R-1);
			int cont = 0, time = 1;
			while(!pila.isEmpty()){
				int actual = pila.pop();
				cont += time*costos[actual];
				time++;
				ArrayList<int[]> hijos = new ArrayList<int[]>();
				for(int i=0;i<mAdy.length;++i){
					if(mAdy[actual][i]==1)
						hijos.add(new int[]{i, costos[i]});
				}
				Collections.sort(hijos, new Comparator<int[]>() {
					public int compare(int[] o1, int[] o2) 
					{
						return o2[1]-o1[1];
					}
				});
				for(int i=0;i<hijos.size();++i){
					pila.add(hijos.get(i)[0]);
				}
			}
			sb.append(cont+"\n");
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken()); R = Integer.parseInt(st.nextToken());
		}
		System.out.print(new String(sb));
	}

}
