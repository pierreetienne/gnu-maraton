import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Uva11631 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			if(N == 0 && M == 0)break;
			ArrayList<int[]>[] mAdy = new ArrayList[N];
			for(int i=0;i<mAdy.length;++i){
				mAdy[i]=new ArrayList<int[]>();
			}
			long cont = 0;
			for(int i=0;i<M;++i){
				st = new StringTokenizer(in.readLine());
				int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), z = Integer.parseInt(st.nextToken());
				mAdy[x].add(new int[]{y,z});
				mAdy[y].add(new int[]{x,z});
				cont+=z;
			}
			sb.append(cont-prim(mAdy, 0)+"\n");
		}
		System.out.print(new String(sb));
	}
	
	public static long prim(ArrayList<int[]> lAdy[], int v){
		int n,p[]=new int[n=lAdy.length];double d[]=new double[n];boolean[] vis = new boolean[n];
		PriorityQueue<double[]> cola = new PriorityQueue<double[]>(n, new Comparator<double[]>() {
			public int compare(double[] o1, double[] o2) {
				if(o1[1]<o2[1])return -1;
				if(o1[1]>o2[1])return 1;
				if(o1[0]<o2[0])return -1;
				if(o1[0]>o2[0])return 1;
				return 0;
			}
		});
		cola.add(new double[]{v,0});
		Arrays.fill(d,Double.POSITIVE_INFINITY);
		d[v]=0;
		vis[v]=true;
		Arrays.fill(p, -1);
		for(;!cola.isEmpty();) {
			double[] nodo=cola.poll();
			int s=(int)nodo[0];
			vis[s]=true;
			for(int[] u:lAdy[s]){
				if(!vis[u[0]]&&d[u[0]]>u[1]) {
					p[u[0]]=s;
					cola.add(new double[]{u[0],d[u[0]]=u[1]});
				}
			}
		}
		long s=0;
		for(double h:d)s+=(long)h;
		return s;
	}


}
