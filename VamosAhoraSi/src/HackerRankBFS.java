import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HackerRankBFS {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());
		while(cases-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int aristas = Integer.parseInt(st.nextToken());
			int[][] m = new int[n][n];
			for(int i=0;i<aristas;++i){
				st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				m[a][b]=6;
				m[b][a]=6;
			}
			int start = Integer.parseInt(in.readLine().trim())-1;
			long[] dist = new long[n];
			boolean visitados[] = new boolean[n];
			Arrays.fill(dist, Integer.MAX_VALUE);
			Queue<Integer> q = new LinkedList<>();
			q.add(start);
			Queue<Long> q2 = new LinkedList<>();
			q2.add(0l);
			while(!q.isEmpty()){
				int nodo = q.poll();
				long distancia = q2.poll();
				visitados[nodo]=true;
				
				dist[nodo]=Math.min(distancia,dist[nodo]);
				for(int i=0;i<n;++i){
					if(m[nodo][i]>0 && !visitados[i]){
						q.add(i);
						q2.add(distancia+6);
					}
				}
			}
			
			StringBuilder res = new StringBuilder();
			for(int i=0;i<dist.length;++i){
				if(dist[i]>0 ){
					if(res.length() ==0){
						res.append(dist[i]==Integer.MAX_VALUE?-1:dist[i]);
					}else{
						res.append(" "+(dist[i]==Integer.MAX_VALUE?-1:dist[i]));
					}
				}
			}
			System.out.println(res);
				
		}
	}

}
