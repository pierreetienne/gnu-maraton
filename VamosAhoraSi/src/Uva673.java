import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uva673 {


	static char[] m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N -- > 0 ){
			m = bf.readLine().trim().toCharArray();
			if(m.length==0)
				sb.append("Yes\n");
			else if( m[0] == ')' || m[0]== ']' || m[m.length-1]=='(' || m[m.length-1]=='[' || m.length%2 ==1)
				sb.append("No\n");
			else {
				sb.append((valido( 0))?"Yes\n":"No\n");
			}
		}
		System.out.print(new String(sb));
	}
	
	
	static boolean valido( int desde) {
		char inicial = m[desde];
		if(inicial==']'||inicial==')')return false;
		char fin = (inicial=='(')?')':']';
		char inicialB = inicial=='('?'[':'(';
		char finB = fin==']'?')':']';
		int contA=1;
		int contB=0;
		for(int i=desde+1;i<m.length&&contA!=0&&contB!=-1;++i){
			if(m[i]==fin)
				contA--;
			else if(m[i]==inicial)
				contA++;
			else{
				if(!valido( i))
					return false;
			}
				
			
		}
		return (contB==-1)?false:true;
	}
}
