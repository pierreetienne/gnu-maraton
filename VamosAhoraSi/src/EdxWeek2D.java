import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;

public class EdxWeek2D {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("brackets.in"));
		System.setOut(new PrintStream("brackets.out"));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			Stack<Character> s=new Stack<>();
			boolean ws=true;
			for(int i=0;i<ln.length()&&ws;++i){
				if(ln.charAt(i)=='('||ln.charAt(i)=='['){
					s.push(ln.charAt(i));
				}else{
					char other = ln.charAt(i)==')'?'(':'[';
					if(s.isEmpty()||other!=s.pop())
						ws=false;
				}
			}
			System.out.println((ws&&s.isEmpty())?"YES":"NO");
		}
	}

}
