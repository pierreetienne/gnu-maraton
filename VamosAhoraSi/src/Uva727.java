import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Uva727 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			bf.readLine();
			Stack<Character> c = new Stack<Character>();
			Stack<Integer> n = new Stack<Integer>();
			while((linea=bf.readLine()).length()>0){
				if(Character.isDigit(linea.charAt(0))) 
					n.add(linea.charAt(0)-'0');
				else
					c.add(linea.charAt(0));
			}
			StringBuilder sol = new StringBuilder();
			while(!c.isEmpty() || !n.isEmpty()){
				while(!c.isEmpty() && (c.peek()==')' || c.peek()=='(')){
						c.pop();
				}
				if(!c.isEmpty() ){
						sol.append(c.pop());
				}
				if(!n.isEmpty()){
					sol.append(n.pop());
				}
			}
			
			sol = sol.reverse();
			sb.append(sol+"\n");
		}
		System.out.print(new String(sb));
	}

}
