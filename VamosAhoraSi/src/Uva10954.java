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
			int cont = 0;
			while(!p.isEmpty()){
				if(p.size()==1)
					p.poll();
				else
				{
					int a = p.poll();
					int b = p.poll();
					cont += a+b;
					p.add(a+b);
				}
			}
			sb.append(cont + "\n");
			N = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}

}
