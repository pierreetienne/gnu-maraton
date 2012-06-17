

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uva673 {


	static char[] m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N -- > 0 ){
			m = bf.readLine().trim().toCharArray();
			if(m[0] == ')' || m[0]== ']' || m[m.length-1]=='(' || m[m.length-1]=='[')
				sb.append("No\n");
			else {
				int contadorP = 0 , contadorQ = 0;
				int[][] cantidad = new int[m.length][2];
				if(m[0] == '(')
					cantidad[0][0]=1;
				if(m[0]=='[')
					cantidad[0][1]=1;
				
				for(int i=1;i<m.length;++i){
					if(m[i]=='('){
						cantidad[i][0]+= cantidad[i-1][0]+1;
						cantidad[i][1] += cantidad[i-1][1];
					}
					else if(m[i]=='['){
						cantidad[i][1]  += cantidad[i-1][1]+1;
						cantidad[i][0] += cantidad[i-1][0];
					}
					else if(m[i]==']'){
						cantidad[i][1]+= cantidad[i-1][1]-1;
						cantidad[i][0] += cantidad[i-1][0];
					}
					else if(m[i]==')'){
						cantidad[i][0] += cantidad[i-1][0]-1;
						cantidad[i][1] += cantidad[i-1][1];
					}
				}
				System.out.println();
				
				for(int i=0;i<m.length;++i){
					System.out.println(cantidad[i][0] + " -- " + cantidad[i][1] + " >> "  + m[i]);
				}
				System.out.println();
				for(int i=0;i<m.length;++i){
					if(m[i]=='(')
						contadorP++;
					else if(m[i]==')')
						contadorP--;
					else if(m[i]=='[')
						contadorQ ++;
					else if(m[i]==']')
						contadorQ--;
					if(contadorP < 0 || contadorQ < 0 )
						break;
					System.out.println("i: " + i + " ( " + contadorP +" , " + contadorQ +" )");
				}
				if(contadorP == 0 && contadorQ == 0)
					sb.append("Yes\n");
				else 
					sb.append("No\n");
			}
		}
		System.out.print(new String(sb));
	}
	
}
