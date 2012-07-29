import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


/**
 * BFS 
 * @author PierreEtienne
 *
 */
public class elevator {

	
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int f = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			if(f == 0 && s == 0 && g == 0 && u == 0 && d == 0)break;
			
			int cont = 0;
			Queue<int[]> cola = new LinkedList<int[]>();
			cola.add(new int[]{s,0});
			boolean[] visitados = new boolean[f+6];
			while(!cola.isEmpty()){
				int[] pisoActual = cola.poll();
				
				if( pisoActual[0]!= g && !visitados[pisoActual[0]]){
					if(pisoActual[0] + u <= f)
						cola.add(new int[]{pisoActual[0]+u,pisoActual[1]+1});
					if( pisoActual[0]-d >= 1 )
						cola.add(new int[]{pisoActual[0]-d, pisoActual[1]+1});
					
				}else if(pisoActual[0]==g){
					cont = pisoActual[1];
					break;
				}visitados[pisoActual[0]]=true;
			}
			if(cont==0)
				sb.append("use the stairs\n");
			else
				sb.append(cont+"\n");
			
		}
		System.out.print(new String(sb));

	}

}
