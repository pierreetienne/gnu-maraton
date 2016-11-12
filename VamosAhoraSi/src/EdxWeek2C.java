import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class EdxWeek2C {
	
	public static void main(String[] args)throws Exception  {
		System.setIn(new FileInputStream("queuemin.in"));
//		System.setIn(new FileInputStream("out.out"));
		System.setOut(new PrintStream("queuemin.out"));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N=Integer.parseInt(ln);
			Queue<Integer> c=new LinkedList<>();
			StringBuilder sb=new StringBuilder();
//			Deque<Integer> dq=new LinkedList<>();
			
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			for(int i=0;i<N;++i){
				ln=in.readLine();
				StringTokenizer st=new StringTokenizer(ln);
				String token=st.nextToken();
				if(token.equals("+")){
					int val=Integer.parseInt(st.nextToken());
					pq.add(val);
					c.add(val);
				}else if(token.equals("-")){
					Integer val=c.poll();
					pq.remove(val);
				}else{
					sb.append(pq.peek()).append("\n");
				}
			}
			System.out.print(new String(sb));
		}
	}

}
