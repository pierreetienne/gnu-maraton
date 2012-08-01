import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class CF124B {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			
			Queue<int[]> c1 = new LinkedList<int[]>();
			Queue<Integer> c2 = new LinkedList<Integer>();
			
//			Stack<int[]> c1 = new Stack<int[]>();
//			Stack<Integer> c2 = new Stack<Integer>();
			
			c1.add(new int[]{1,1});
			c2.add(0);

			
			int nivel = -1;
			
			while(!c1.isEmpty() && nivel == -1 )
			{
				int[] val = c1.poll();
				int n = c2.poll();
				
//				int[] val = c1.pop();
//				int n = c2.pop();
				
				if(val[0] == N || val[1] == N )
					nivel = n;
				else{
					if(n+1 <= 30 && val[0]+val[1]<=N)
					{
						c1.add(new int[]{val[0], val[0]+ val[1]});
						c2.add(n+1);
						c1.add(new int[]{val[0]+val[1], val[1]});
						c2.add(n+1);
					}
				}
			}
			
			System.out.println(nivel);
			
		}
	}

}
