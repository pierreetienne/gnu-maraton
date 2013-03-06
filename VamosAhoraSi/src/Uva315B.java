import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;


public class Uva315B {

	static ArrayList<Integer>[] lAdy;
	static int[] dfs_low, dfs_num, dfs_parent;
	static boolean[] articulation_vertex;
	static int cont =0, dfs_root=0, root_Children=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		while(N!=0){
			lAdy = new ArrayList[N];
			for(int i=0;i<N;++i)lAdy[i]=new ArrayList<Integer>();
			dfs_low = new int[N];
			dfs_num = new int[N];
			Arrays.fill(dfs_num, -1);
			dfs_parent = new int[N];
			cont = 0;
			articulation_vertex = new boolean [N];
			while(true){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int aux = Integer.parseInt(st.nextToken())-1;
				if(aux ==-1)break;
				while(st.hasMoreTokens()){
					int pos = Integer.parseInt(st.nextToken())-1;
					lAdy[aux].add(pos);
					lAdy[pos].add(aux);
				}
			}
			for(int i=0;i<N;++i){
				if(dfs_num[i]==-1){
					dfs_root=i;
					root_Children=0;
					Stack<Integer> p = new Stack<Integer>();
					p.add(i);
					while(!p.isEmpty()){
						int u = p.pop();
						dfs_low[u]= dfs_num[u] =cont++;
						for(int j=0;j<lAdy[u].size();++j){
							int v = lAdy[u].get(j);
							if(dfs_num[v]==-1){
								dfs_parent[v]=u;
								if(u==dfs_root)root_Children++;
								
								p.add(v);
							}
							else if(v != dfs_parent[u])
								dfs_low[u]=Math.min(dfs_low[u], dfs_num[v]);
							else 
							{
								if(dfs_low[v]>=dfs_num[u])
									articulation_vertex[u]=true;
								if(dfs_low[v]>dfs_num[u]){
									//Hay bridge
								}
								dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);
							}
						}
					}
					articulation_vertex[dfs_root]=(root_Children>1);
				}
			}
			int cont = 0;
			for(int j=0;j<N;++j)
				if(articulation_vertex[j])cont++;
			System.out.println(cont);
			N = Integer.parseInt(in.readLine());
		}
	}
	

	
	static void articulatioPointAndBridge(int u){
		dfs_low[u]= dfs_num[u] =cont++;
		for(int i=0;i<lAdy[u].size();++i){
			int v = lAdy[u].get(i);
			if(dfs_num[v]==-1){
				dfs_parent[v]=u;
				if(u==dfs_root)root_Children++;
				
				articulatioPointAndBridge(v);

				if(dfs_low[v]>=dfs_num[u])
					articulation_vertex[u]=true;
				if(dfs_low[v]>dfs_num[u]){
					//Hay bridge
				}
				dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);
			}
			else if(v != dfs_parent[u])
				dfs_low[u]=Math.min(dfs_low[u], dfs_num[v]);
		}
	}


}
