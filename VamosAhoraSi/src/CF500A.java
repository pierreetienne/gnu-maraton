import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class CF500A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int[] a = new int[n-1];
			int[] go = new int[n-1];
			for(int i=0;i<n-1;++i){
				a[i]=Integer.parseInt(st.nextToken());
				go[i] = i+a[i];
			}
			boolean encontre = false;
			Set<Integer> visitados = new TreeSet<Integer>();
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(0);
			while(!q.isEmpty()&&!encontre){
				int actual = q.poll();
				if((actual+1)== t){
					encontre=true;
					break;
				}
				if(actual<go.length &&!visitados.contains(go[actual])){
					q.add(go[actual]);
				}
				visitados.add(actual);
			}
			
			if(encontre)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}

	}

}
