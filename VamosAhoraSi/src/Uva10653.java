import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//acept
public class Uva10653 {

	public static void main(String[] args)throws Exception {
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0 && C==0)break;
			boolean[][] m = new boolean[F][C];
			int N = Integer.parseInt(bf.readLine());
			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				int P = Integer.parseInt(st.nextToken());
				int X = Integer.parseInt(st.nextToken());
				while(st.hasMoreTokens())m[P][Integer.parseInt(st.nextToken())]=true;
			}
			st = new StringTokenizer(bf.readLine());
			int[] ini = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			st = new StringTokenizer(bf.readLine());
			int[] fin = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

			if(ini[0]== fin[0] && ini[1]==fin[1])
				sb.append("0\n");
			else
			{
				Queue<Integer> c1  = new LinkedList<Integer>();
				Queue<Integer> c2  = new LinkedList<Integer>();
				Queue<Integer> c3  = new LinkedList<Integer>();

				c1.add(ini[0]);
				c2.add(ini[1]);
				c3.add(0);

			//	m[ini[0]][ini[1]]=true;
			
				int dis = -1;
				while(!c2.isEmpty()&& dis == -1){
					int x = c1.poll();
					int y = c2.poll();
					int cont = c3.poll();
					if(x == fin[0] && y == fin[1])
						dis = cont;
					else
					{
						for(int i=0;i<dx.length;++i){
							if(x+dx[i]<m.length && x+dx[i]>=0 && y+dy[i]<m[0].length && y+dy[i]>=0 && !m[x+dx[i]][y+dy[i]]){
								m[x+dx[i]][y+dy[i]]=true;
								c1.add(x+dx[i]);
								c2.add(y+dy[i]);
								c3.add(cont+1);
							}
						}
					}
				}
				if(dis == -1) dis = 0;
				sb.append(dis+"\n");
			}
		}
		System.out.print(new String(sb));
	}
}
