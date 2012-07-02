import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Uva673 {
	static char[] m;
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N -- > 0 ){
			m = bf.readLine().trim().toCharArray();
			Stack<Character> s = new Stack<Character>();
			boolean fallo = false;
			for(int i=0;i<m.length;++i){
				if(m[i]== '(' || m[i]=='[')
					s.push(m[i]);
				else if(m[i]==')')
				{
					if(s.isEmpty()||s.peek()!='('){
						fallo = true;
						break;
					}
					else
						s.pop();
				}
				else if(m[i]==']'){
					if(s.isEmpty()||s.peek()!='['){
						fallo = true;
						break;
					}
					else
						s.pop();
				}
			}
			if(!fallo && s.isEmpty()){
				sb.append("Yes\n");
			}else
				sb.append("No\n");
		}
		System.out.print(new String(sb));
	}
}
