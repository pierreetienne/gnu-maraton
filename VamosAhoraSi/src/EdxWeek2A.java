import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;
import java.util.StringTokenizer;

public class EdxWeek2A {

	public static void main(String[] args)throws Exception  {
		System.setIn(new FileInputStream("stack.in"));
		System.setOut(new PrintStream("stack.out"));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N=Integer.parseInt(ln);
			Stack<Integer> stack=new Stack<>();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<N;++i){
				ln=in.readLine();
				StringTokenizer st=new StringTokenizer(ln);
				if(st.nextToken().equals("+")){
					int num=Integer.parseInt(st.nextToken());
					stack.push(num);
				}else{
					sb.append(stack.pop()).append("\n");
				}
			}
			System.out.print(new String(sb));
		}
	}

}
