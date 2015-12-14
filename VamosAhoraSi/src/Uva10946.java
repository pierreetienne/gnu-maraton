import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;


public class Uva10946 {
	
	static boolean[][] visitados;
	static char[][] m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso= 1;
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0 && C == 0)break;
			m = new char[F][];
			visitados = new boolean[F][C];
			for(int i=0;i<F;++i)m[i]=in.readLine().toCharArray();
			ArrayList<int[]> datos = new ArrayList<int[]>();
			for(int i=0;i<F;++i){
				for(int j=0;j<C;++j){
					if(m[i][j]!='.'&&!visitados[i][j]){
						datos.add(new int[]{m[i][j], f(i, j,m[i][j])});
					}
				}
			}
			
			Collections.sort(datos, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o2[1]-o1[1]==0?o1[0]-o2[0]:o2[1]-o1[1];
				}
			});
			sb.append("Problem ").append(caso++).append(":\n");
			for(int i=0;i<datos.size();++i){
				sb.append((char)datos.get(i)[0]).append(" ").append(datos.get(i)[1]).append("\n");
			}
		}
		System.out.print(new String(sb));
	}
	
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	static int f(int x, int y, char letter){
		Stack<Integer> c1 = new Stack<Integer>();
		Stack<Integer> c2 = new Stack<Integer>();
		c1.add(x);
		c2.add(y);
		int max = 1;
		while(!c1.isEmpty()){
			int i = c1.pop();
			int j = c2.pop();
			visitados[i][j] = true;
			for(int p=0;p<dx.length;++p){
				int auxI = i+dx[p];
				int auxJ = j+dy[p];
				if(auxI>=0 && auxI<m.length&& auxJ>=0 && auxJ<m[auxI].length&&m[auxI][auxJ]==letter && !visitados[auxI][auxJ]){
					c1.add(auxI);
					c2.add(auxJ);
					max++;
					visitados[auxI][auxJ]=true;
				}
			}
		}
		return max;
	}
	

}
