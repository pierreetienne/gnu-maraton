import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class EdxWeek2B {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("queue.in"));
		System.setOut(new PrintStream("queue.out"));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N=Integer.parseInt(ln);
			Queue<Integer> stack=new LinkedList<>();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<N;++i){
				ln=in.readLine();
				StringTokenizer st=new StringTokenizer(ln);
				if(st.nextToken().equals("+")){
					int num=Integer.parseInt(st.nextToken());
					stack.add(num);
				}else{
					sb.append(stack.poll()).append("\n");
				}
			}
			System.out.print(new String(sb));
		}
	}

}
