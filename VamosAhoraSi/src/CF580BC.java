import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF580BC {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			Set<Integer>[] lAdy = new TreeSet[n];
			int[] gatos = new int[n];
			st = new StringTokenizer(in.readLine());
			for(int i = 0;i<lAdy.length;++i){
				lAdy[i]=new TreeSet<Integer>();
				gatos[i]=Integer.parseInt(st.nextToken());
			}
			for(int i=0;i<n-1;++i){
				st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				lAdy[a].add(b);
			}
			Queue<Integer> cola = new LinkedList<Integer>();
			Queue<Integer> cantGatos = new LinkedList<Integer>();
			cola.add(0);
			cantGatos.add(gatos[0]);
 			long cont = 0;
			while(!cola.isEmpty()){
				int nodo = cola.poll();
				int cantGato = cantGatos.poll();
				boolean tieneHijos = lAdy[nodo].size()>0;
				for(Integer x : lAdy[nodo]){
					cola.add(x);
					cantGatos.add(cantGato+gatos[x]);
				}
				
				if(!tieneHijos ){
					if( cantGato == m )
						cont++;
					System.out.println("nodo "+ (nodo+1 ) + " can gatos " + cantGato + " m " + m);
				}
				
			}
			
			System.out.println(cont);
		}
	}

}
