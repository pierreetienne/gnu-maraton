import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;


public class ACM4805 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N != 0){
			HashMap<Integer, Integer>[] lady = new HashMap[N];
			lady[0] = new HashMap<Integer, Integer>();
			StringTokenizer st = null;
			for(int i=0;i<N-1;++i){
				if(lady[i+1]==null)	lady[i+1]=new HashMap<Integer, Integer>();
				st = new StringTokenizer(bf.readLine());
				int valx = Integer.parseInt(st.nextToken());
				int valy = Integer.parseInt(st.nextToken());
				lady[i+1].put(valx, valy);
				if(lady[valx]==null)lady[valx]=new HashMap<Integer, Integer>();
				lady[valx].put(i+1, valy);
			}

			int H = 0;
			int[] nivel = new int[N];
			int[] padreSeccionAnterior = new int[N];
			int[] padre = new int[N];
			Arrays.fill(padre, -1);
			Queue<Integer> c = new LinkedList<Integer>();
			Queue<Integer> altura = new LinkedList<Integer>();
			boolean[] visitados = new boolean[N];
			c.add(0);
			altura.add(0);

			while(!c.isEmpty()){
				int h = altura.poll();
				int nodo = c.poll();
				visitados[nodo]=true;
				nivel[nodo]= h;
				for(int x:lady[nodo].keySet()){
					if(!visitados[x]){
						altura.add(h+1);
						H = (h+1>H)?h+1:H;
						c.add(x);
						padre[x]=nodo;
					}
				}
			}
			
			int sec = (int) Math.ceil(Math.sqrt(H));
			
			
			
			
			
			//int M = Integer.parseInt(bf.readLine());
			

			N = Integer.parseInt(bf.readLine());
		}

	}

}
