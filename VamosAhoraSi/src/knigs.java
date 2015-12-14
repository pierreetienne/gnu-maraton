import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class knigs {
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			int k = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			if(k==0 && n == 0)break;
			st = new StringTokenizer(bf.readLine());
			int N = n + k - 2;
			int[] alce = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

			PriorityQueue<Integer> cola = new PriorityQueue<Integer>(1,new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return (-1)*(o1-o2);
				}
			});

			PriorityQueue<int[]> l = new PriorityQueue<int[]>(1, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
			});

			int anio = 2011;

			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				int[] val = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
				if(cola.size()<k && val[0]==2011)
					cola.add(val[1]);
				else
					l.add(val);
			}

			if(alce[0]==2011)
				cola.add(alce[1]);
			else
				l.add(alce);


			boolean encontre = false;
			while(!cola.isEmpty() && !encontre && cola.size()==k){
				int peso =  cola.poll();
				if(peso == alce[1])
					encontre=true;
				else{
					if(!l.isEmpty()){
						int[] x  = l.poll();
						anio = x[0];
						cola.add(x[1]);
					}
				} 
			}
			if(encontre)
				sb.append(anio+"\n");
			else
				sb.append("unknown\n");
		}
		System.out.print(new String(sb));
	}
}