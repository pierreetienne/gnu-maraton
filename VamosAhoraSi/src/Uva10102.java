import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Uva10102 {


	static int[]dx = {0,0,1,-1};
	static int[]dy = {1,-1,0,0};
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea ;(linea = bf.readLine() )!=null;){
			int N = Integer.parseInt(linea);
			byte[][] m  = new byte[N][N];
			for(int i=0;i<N;++i){
				String l = bf.readLine();
				for(int j=0;j<l.length();++j)
					m[i][j]=(byte) (l.charAt(j)-'0');
			}

			Queue<Integer> c = new LinkedList<Integer>();
			Queue<Integer> c1 = new LinkedList<Integer>();
			Queue<Integer> c2 = new LinkedList<Integer>();
			
			c.add(0);
			c1.add( 0);
			c2.add( 0);
			int f = 0;
			while(!c.isEmpty()){
				int a = c.poll();
				int x = c1.poll();
				int y = c2.poll();
				m[x][y]=-1;
				byte value = m[x][y];
				if(value == 3){f =  a; break;}
				else
				{
					for(int i=0;i<dx.length;++i){
						if(x+dx[i]<m.length && x+dx[i]>=0 && y+dy[i]<m.length && y+dy[i]>=0  && m[x+dx[i]][y+dy[i]]!=-1){
							c.add(a+1);
							c1.add(x+dx[i]);
							c2.add(y+dy[i]);
						}
					}
				}
			}
			System.out.println(f);
		}
		
	}

}
