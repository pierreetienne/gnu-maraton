import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class CF568B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			boolean[] util = new boolean[N];
			int[] pos = new int[N];
			int[] result = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				result[i]= Integer.parseInt(st.nextToken());
				if(result[i]<=N){
					if(!util[result[i]-1]){
						util[result[i]-1]=true;
						pos[result[i]-1]=i;
					}
				}
			}
			
			Queue<Integer> noUtilizados = new LinkedList<Integer>();
			
			for(int i=0;i<N;++i){
				if(!util[i])
					noUtilizados.add(i+1);
			}
			
			for(int i=0;i<N;++i){
				if(result[i]>N)
					result[i] = noUtilizados.poll();
				else if(util[result[i]-1]&& pos[result[i]-1]!=i)
					result[i]=noUtilizados.poll();
			}
			
			for(int i=0;i<N;++i){
				if(i==0)
					System.out.print(result[i]);
				else
					System.out.print(" " + result[i]);
			}
			System.out.println();
		}

	}

}
