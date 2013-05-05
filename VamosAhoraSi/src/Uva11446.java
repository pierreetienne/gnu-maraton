import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Uva11446 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		while (casos-- > 0) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int P = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st
					.nextToken());
			ArrayList<Integer>[] adjList = new ArrayList[P];
			for(int i=0;i<adjList.length;++i)adjList[i]=new ArrayList<Integer>();
			for (int i = 0; i < L; ++i) {
				st = new StringTokenizer(in.readLine());
				int from = Integer.parseInt(st.nextToken()), to = Integer
						.parseInt(st.nextToken());
				adjList[from].add(to);
			}
			adjList[0].add(0);
			boolean[] visitados = new boolean[adjList.length];
			for(int i=1;i<adjList.length;++i){
				if(seConectaACero(adjList, i)){
					Queue<Integer> c = new LinkedList<Integer>();
					c.add(i);
					visitados[i]=true;
					while(!c.isEmpty()){
						int nodo = c.poll();
						for(int j=0;j<adjList[nodo].size();++j){
							if(!visitados[adjList[nodo].get(j)]){
								c.add(adjList[nodo].get(j));
								if(!seConectaACero(adjList, adjList[nodo].get(j)))
									adjList[nodo].add(0);
								visitados[adjList[nodo].get(j)]=true;
							}
						}
								
					}
				}
			}

			int[] m = kosaraju(adjList);
			System.out.println(Arrays.toString(m));
			int min = m.length;
			sb.append(min);
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}
	
	static boolean seConectaACero(ArrayList<Integer>[] adjList, int nodo){
		for(int j=0;j<adjList[nodo].size();++j)if(adjList[nodo].get(j)==0)return true;
		return false;
	}

	static int nVisitados;

	// supone los nodos numerados 0..n-1

	static int[] kosaraju(ArrayList<Integer>[] adjList) {
		int n = adjList.length;
		int[] orden = new int[n];
		boolean[] visitado = new boolean[n];
		nVisitados = 0;
		for (int i = 0; i < orden.length; i++) {
			if (!visitado[i])
				dfs(i, orden, visitado, adjList);
		}
		// transponer Grafo
		adjList = transponerGrafo(adjList);
		int[] componente = new int[n];
		visitado = new boolean[n];
		int nComponente = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (!visitado[orden[i]]) {
				dfsComp(orden[i], componente, visitado, nComponente, adjList);
				nComponente++;
			}
		}
		return componente;
	}

	static void dfsComp(int nodo, int[] componente, boolean[] visitado,int nComponente, ArrayList<Integer>[] adjList) {
		componente[nodo] = nComponente;
		visitado[nodo] = true;
		for (int v : adjList[nodo]) {
			if (!visitado[v]) {
				dfsComp(v, componente, visitado, nComponente, adjList);
			}
		}
	}

	static void dfs(int nodo, int[] orden, boolean[] visitado,	ArrayList<Integer>[] adjList) {
		visitado[nodo] = true;
		for (int v : adjList[nodo]) {
			if (!visitado[v]) {
				dfs(v, orden, visitado, adjList);
			}
		}
		orden[nVisitados] = nodo;
		nVisitados++;
	}

	static ArrayList<Integer>[] transponerGrafo(ArrayList<Integer>[] adjList) {
		int n = adjList.length;
		ArrayList<Integer>[] transpose = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			transpose[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n; i++) {
			for (int v : adjList[i]) {
				transpose[v].add(i);
			}
		}
		return transpose;
	}
}
