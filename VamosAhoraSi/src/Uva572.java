import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Uva572 {

	static char[][] m;
	static int[] dx = {0,0,1,-1,1,-1,1,-1};
	static int[] dy = {1,-1,0,0,1,-1,-1,1};
	static void marcar(int i,int j){
		Queue<Integer> c1 = new LinkedList<Integer>();
		Queue<Integer> c2 = new LinkedList<Integer>();
		c1.add(i);
		c2.add(j);
		while(!c1.isEmpty()){
			int posi = c1.poll();
			int posj = c2.poll();
			m[posi][posj]='?';
			for(int p=0;p<dx.length;++p){
				if(posi+dx[p]<m.length && posi+dx[p]>=0 && posj+dy[p]<m[0].length&&posj+dy[p]>=0 && m[posi+dx[p]][posj+dy[p]]=='@'){
					c1.add(posi+dx[p]);
					c2.add(posj+dy[p]);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0&&C==0)break;
			m = new char[F][];
			for(int i=0;i<m.length;++i)m[i]=bf.readLine().trim().toCharArray();
			int cant = 0;
			for(int i=0;i<m.length;++i){
				for(int j=0;j<m[i].length;++j){
					if(m[i][j]=='@'){
						cant++;
						marcar(i, j);
					}
				}
			}
			sb.append(cant);
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

	static void imprimir(){
		for(int i=0;i<m.length;++i)System.out.println(Arrays.toString(m[i]));
	}
}
