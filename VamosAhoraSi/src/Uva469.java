import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Uva469 {

	static int[] dx = {0,0,-1,1,-1,1,1,-1};
	static int[] dy = {-1,1,0,0,-1,1,-1,1};
	
	
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		in.readLine();
		while(N-->0){
			String linea = in.readLine();
			ArrayList<char[]> m = new ArrayList<char[]>();

			while(linea.indexOf('L')!=-1 || linea.indexOf('W')!=-1){
				m.add(linea.toCharArray());
				linea = in.readLine();
			}
			int tamax = m.size(),tamay = 0 ;
			if(m.size()>0)tamay=m.get(0).length;
			
			StringTokenizer st = new StringTokenizer(linea);
			while(st.countTokens()==2){
				int  x = Integer.parseInt(st.nextToken())-1;
				int y = Integer.parseInt(st.nextToken())-1;
				Queue<Integer> c1 = new LinkedList<Integer>();
				Queue<Integer> c2 = new LinkedList<Integer>();
				
				c1.add(x);
				c2.add(y);
				boolean[][] visitados = new boolean[tamax][tamay];
				visitados[x][y]=true;
				int cont = 1;
				while(!c1.isEmpty()){
					int i = c1.poll();
					int j = c2.poll();
					for(int p=0;p<dx.length;++p){
						int dX = i+dx[p],dY=j+dy[p];
						if(dX<tamax && dX>=0&&dY<tamay&&dY>=0&& !visitados[dX][dY]&& m.get(dX)[dY]=='W'){
							visitados[dX][dY] =true;
							c1.add(dX);
							c2.add(dY);
							cont++;
						}
					}
				}
				sb.append(cont+"\n");
				linea = in.readLine();
				if(linea == null)break;
				st = new StringTokenizer(linea);
			}
			if(N>=1)
				sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
