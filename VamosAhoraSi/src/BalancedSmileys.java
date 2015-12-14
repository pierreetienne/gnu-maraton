import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


public class BalancedSmileys {

	static String linea;

	static boolean f(int pos, int s ){
		if(s<0)return false;
		if(pos < linea.length()){
			if(linea.charAt(pos)!=')'&&linea.charAt(pos)!='(')
				return f(pos+1, s);
			int val = ( linea.charAt(pos)=='('?1:-1);
			if(linea.charAt(pos-1)==':')
				return f(pos+1,s)||f(pos+1, s +val);
			else
				return f(pos+1,s+val);
		}
		return s==0;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new FileReader("balanced_smileystxt.txt"));
	//	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int casos = 1;
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			linea = bf.readLine();
			int val = 0 ;
			if(linea.charAt(0)=='(')val = 1;
			if(linea.charAt(0)==')')val = -1;
			sb.append("Case #"+(casos++)+": "+(f(1,val)?"YES":"NO")+"\n");
		}
		System.out.print(new String(sb));
	}

}
