import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Accepted
public class Uva785 {

	static char[][] matriz;
	
	static boolean[][] marcados;
	
	public static void main(String[] args) throws Exception {
		marcados = new boolean[31][81];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<char[]> grid = new ArrayList<char[]>();
		for(String ln;(ln = in.readLine())!=null;){
			boolean allUnderscore = true;
			for(int i=0;i<ln.length()&&allUnderscore;++i)
				if(ln.charAt(i)!='_')allUnderscore=false;
			if(ln.length()==0)
				allUnderscore=false;
			if(allUnderscore){
				matriz = new char[grid.size()][];
				for(int i=0;i<grid.size();++i)matriz[i]= grid.get(i);
				for(int i=0;i<matriz.length;++i){
					for(int j=0;j<matriz[i].length;++j){
						if(matriz[i][j]!='X' && matriz[i][j]!=' '&&!marcados[i][j])
							floodFill(i	, j, matriz[i][j]);
					}
				}
				for(int i=0;i<matriz.length;++i)
					sb.append(new String(matriz[i])+"\n");
				sb.append(ln+"\n");
				grid.clear();
			}
			else{
				grid.add(ln.toCharArray());
			}
			for(int i=0;i<marcados.length;++i)
				Arrays.fill(marcados[i],false);
		}
		System.out.print(new String(sb));
	}
	
	static int[] dx={0,0,1,-1,};
	static int[] dy={-1,1,0,0};
	
	static void floodFill(int x , int y, char sim){
		Queue<Integer> c1 = new LinkedList<Integer>();
		Queue<Integer> c2 = new LinkedList<Integer>();
		c1.add(x);
		c2.add(y);
		while(!c1.isEmpty()){
			int posx = c1.poll();
			int posy = c2.poll();
			matriz[posx][posy]=sim;
			marcados[posx][posy]=true;
			for(int i=0;i<dx.length;++i){
				int auxx = posx+dx[i];
				int auxy = posy+dy[i];
				if(auxx >=0 && auxx<matriz.length && auxy >= 0 && auxy <matriz[auxx].length && matriz[auxx][auxy]==' '&&!marcados[auxx][auxy]){
					c1.add(auxx);
					c2.add(auxy);
					matriz[auxx][auxy]=sim;
					marcados[auxx][auxy]=true;
				}
			}
		}
	}
}
