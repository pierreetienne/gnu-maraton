import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF507B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int r = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			Queue<Integer> c1 = new LinkedList<Integer>();
			Queue<Integer> c2 = new LinkedList<Integer>();
			Queue<Integer> c3 = new LinkedList<Integer>();
			Queue<Double> c4 = new LinkedList<Double>();
			int[] dx = {2*r,-2*r,0,0,r,-r,r,-r};
			int[] dy = {0,0,2*r,-2*r,r,-r,-r,r};
			c1.add(x);
			c2.add(y);
			c3.add(0);
			c4.add(dist(x, y, x1, y1));
			TreeSet<String> visited = new TreeSet<String>();
			visited.add(x+" "+y);
			while(!c1.isEmpty()){
				int auxX = c1.poll();
				int auxY = c2.poll();
				int auxCont = c3.poll();
				double dis = c4.poll();
				if(auxX == x1 && auxY == y1){
					System.out.println(auxCont);
					break;
				}else{
					for(int i=0;i<dx.length;++i){
						int nX = auxX+dx[i];
						int nY = auxY+dy[i];
						double nDis = dist(nX, nY, x1, y1);
						System.out.println(nX+ " " + nY + " dis " + nDis + " ant dis " + dis);
						if(!visited.contains(nX+" "+nY) && nDis<=dis ){
							System.out.println(">>>>>>>>>>>>>"+nX+ " " + nY + " dis " + nDis + " ant dis " + dis);	
							c1.add(nX);
							c2.add(nY);
							c3.add(auxCont+1);
							c4.add(nDis);
						}
					}
				}
			}
		}

	}
	
	static double dist(int x, int y , int x1, int y1){
		return Math.sqrt(((x-x1)*(x-x1))-((y-y1)*(y-y1)));
	}

}
