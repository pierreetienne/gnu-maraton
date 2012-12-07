import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva12532 {

	static class SegmentTreeArray
	{
		int[] start, end, valores, A;
		int n;

		public SegmentTreeArray(int[] A) {
			this.A = A;
			n = A.length;
			start = new int[4*n];
			end = new int[4*n];
			valores = new int[4*n];
			Arrays.fill(start, -1);
			initSegmentTree();
		}

		void initSegmentTree(){
			createTree(0, 0, n - 1);
		}

		void initNegativos(){
			for(int i=0;i<A.length;++i){
				if(A[i]<0)set(i, 1);
			}
		}
		
		void createTree(int node, int s, int e){
			if (s>e) return;
			start[node] = s;
			end[node] = e;
			if (s==e){
				return;
			}
			int mid = (s+e)/2;
			createTree(2 * node + 1, s, mid);
			createTree(2 * node + 2, mid + 1, e);
		}

		void set(int pos, int value){
			set(pos, value, 0);
		}

		void set(int pos, int value, int node){
			if (start[node] == -1 || start[node] > pos || end[node] < pos)
				return;
			if (start[node] == end[node]){
				valores[node] = start[node];
				
				return;
			}
			int mid = (start[node] + end[node]) / 2;
			if (pos <= mid)
				set(pos, value, 2 * node + 1);
			else
				set(pos, value, 2 * node + 2);
			
			funcionActualizacion( node );
		}
		
		void funcionActualizacion(int node){
			valores[node ] =  valores[2 * node + 1] + valores[2 * node + 2] ;
		}

		int getPosMin(int low, int high){
			return getPosMin(low, high, 0);
		}

		int getPosMin(int low, int high, int node){
			if (start[node] == -1) 
				return -1;
			if (low == start[node] && high == end[node]){
				return valores[node];
			}
			int mid = (start[node] + end[node]) / 2;
			if (high <= mid)
				return getPosMin(low, high, 2 * node + 1);
			if (low > mid)
				return getPosMin(low, high, 2 * node + 2);
			int p, q;
			p = getPosMin(low, mid, 2 * node + 1);
			q = getPosMin(mid + 1, high, 2 * node + 2);
			if ( A[p] < A[q])
				return p;
			else
				return q;
		}
	}

	public static void main(String[] args)throws Exception	 {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int[] A = new int[Integer.parseInt(st.nextToken())];
			int N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(bf.readLine());
			for(int i=0;i<A.length;++i)	A[i]=Integer.parseInt(st.nextToken());
			SegmentTreeArray segNeg = new SegmentTreeArray(A);
			segNeg.initSegmentTree();
			
		}
	}

}
