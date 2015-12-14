import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * Paso 
 * Grafo 
 * Dado un grafo decir si desde el nodo 0 puedo llegar a todos los demas 
 * nodos y decir si desde los otros nodos puedo llegar a el nodo 0 
 * @author PierreEtienne
 *
 */

public class car {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		boolean [][] mAdy = new boolean [1005][1005];
		boolean[] visitados = new boolean[2000000];
		while(N!= 0 ){
			int[] orden = new int[N];
		
			TreeSet<Integer> trapped = new TreeSet<Integer>();
			TreeSet<Integer> unrechable = new TreeSet<Integer>();
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				orden[i] = Integer.parseInt(st.nextToken().trim());
				if(orden[i]>0){
					trapped.add(orden[i]);
					unrechable.add(orden[i]);
				}
				int T = Integer.parseInt(st.nextToken());
				for(int j=0;j<T;++j){
					int posj = Integer.parseInt(st.nextToken());
					mAdy[orden[i]][posj] = true;
				}
			}
			Arrays.fill(visitados, false);
			Queue<Integer> cola = new LinkedList<Integer>();
			cola.add(0);
			while(!cola.isEmpty()){
				int val = cola.poll();
				for(int i=0;i<mAdy.length;++i){
					if( !visitados[i]  && mAdy[val][i]){
						cola.add(i);
						unrechable.remove(i);
					}
				}
				visitados[val] = true;
			}
			Arrays.fill(visitados, false);
			cola.clear();
			cola.add(0);
			while(!cola.isEmpty()){
				int val = cola.poll();
				for(int i=0;i<mAdy.length;++i){
					if( !visitados[i]  && mAdy[i][val]){
						cola.add(i);
						trapped.remove(i);
					}
				}
				visitados[val] = true;
			}

			for(int i=0;i<mAdy.length;++i)
				Arrays.fill(mAdy[i],false);
			//			System.out.println("TRAPED " +  trapped);
			//			System.out.println("UNREA  " +  unrechable);

			if(trapped.size() == 0 && unrechable.size() == 0)
				sb.append("NO PROBLEMS\n");
			else
			{
				StringBuilder s2 = new StringBuilder();
				for(int i=0;i<orden.length;++i){
					if(trapped.contains(orden[i]))
						sb.append("TRAPPED "+ orden[i] + "\n");
					if(unrechable.contains(orden[i]))
						s2.append("UNREACHABLE "+orden[i]+"\n");
				}
				sb.append(s2);
			}
			N = Integer.parseInt(bf.readLine().trim());	
		}
		System.out.print(new String(sb));
	}
}
