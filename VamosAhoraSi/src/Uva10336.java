import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Uva10336 {

	static char[][] m;
	
	static int[] dx = {0,0,-1,1};
	
	static int[] dy = {-1,1,0,0};
	
	static boolean[][] visitados;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		int cas = 1;
		StringBuilder sb = new StringBuilder();
		while(casos-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			visitados = new boolean[F][C];
			m = new char[F][];
			for(int i=0;i<F;++i)
				m[i] = in.readLine().toCharArray();
			TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
			for(int i=0;i<m.length;++i){
				for(int j=0;j<m[i].length;++j){
					if(!visitados[i][j]){
						flooFill(i, j, m[i][j]);
						if(map.containsKey(m[i][j]))
							map.put(m[i][j], map.get(m[i][j])+1);
						else
							map.put(m[i][j], 1);
					}
				}
			}
			int[][] res = new int[map.size()][];
			int pos = 0;
			for(Character x: map.keySet()){
				res[pos++]= new int[]{x, map.get(x)};
			}
			
			Arrays.sort(res, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o2[1]-o1[1]==0?o1[0]-o2[0]:o2[1]-o1[1];
				}
			});
			sb.append("World #").append(cas++).append("\n");
			for(int i=0;i<res.length;++i){
				sb.append((char)res[i][0]);
				sb.append(": ");
				sb.append(res[i][1]);
				sb.append("\n");
			}
		}
		System.out.print(new String(sb));
	}

	
	static void flooFill(int x , int y , char letter){
		Stack<Integer> p1 = new Stack<Integer>();
		Stack<Integer> p2 = new Stack<Integer>();
		p1.add(x);
		p2.add(y);
		while(!p1.isEmpty()){
			int posX = p1.pop();
			int posY = p2.pop();
			visitados[posX][posY]=true;
			for(int i=0;i<dx.length;++i){
				int auxX = posX + dx[i];
				int auxY = posY  + dy[i];
				if(auxX>=0 && auxX<m.length&& auxY>=0 && auxY<m[0].length && !visitados[auxX][auxY] && m[auxX][auxY] == letter){
					visitados[auxX][auxY]=true;
					p1.add(auxX);
					p2.add(auxY);
				}
			}
		}
	}
}
