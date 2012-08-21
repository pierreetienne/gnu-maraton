import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Uva10954 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N != 0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			PriorityQueue<Integer> p = new PriorityQueue<Integer>();
			for(int i=0;i<N;++i)p.add(Integer.parseInt(st.nextToken()));
			long cont = 0;
			long aux = p.poll();
			while(!p.isEmpty()){
				aux += p.poll();
				cont += aux;
			}
			sb.append(cont + "\n");
			N = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}

}
