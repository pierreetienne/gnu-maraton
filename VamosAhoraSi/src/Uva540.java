import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
//NO

public class Uva540 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int scenario = 1;
		for(String linea;(linea = bf.readLine())!=null;){
			int T = Integer.parseInt(linea);
			if(T==0)break;
			Queue<Integer>[] colas = new LinkedList[T];
			for(int i=0;i<T;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				st.nextToken();
				colas[i]=new LinkedList<Integer>();
				while(st.hasMoreElements())	colas[i].add(Integer.parseInt(st.nextToken()));
			}
			sb.append("Scenario #");
			sb.append(scenario++);
			sb.append("\n");
			PriorityQueue<Integer> p = new PriorityQueue<Integer>();
			while(true){
				linea = bf.readLine();
				if(linea.equalsIgnoreCase("STOP"))break;
				if(linea.indexOf("ENQUEUE ")!=-1){
					StringTokenizer st = new StringTokenizer(linea);
					st.nextToken();
					int val = Integer.parseInt(st.nextToken());
					boolean encontre = false;
					for(int i=0;i<colas.length&&!encontre;++i){
						if(!colas[i].isEmpty() &&colas[i].peek()==val){
							colas[i].poll();
							encontre=true;
						}
					}
					if(encontre){
						p.add(val);
					}
				}
				else{
					sb.append(p.poll());
					sb.append("\n");
				}
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
