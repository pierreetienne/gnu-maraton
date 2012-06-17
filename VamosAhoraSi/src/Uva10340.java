

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Uva10340 {


	static char[] s ;
	
	static char[] d ;
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea ; (linea = bf.readLine())!= null ;){
			StringTokenizer st = new StringTokenizer(linea);
			s = st.nextToken().trim().toCharArray();
			d = st.nextToken().trim().toCharArray();
			boolean encontre = false;
			for(int i=0;i<d.length&&!encontre;++i)
				if(s[0] == d[i])
					encontre = encuentroPalabra(i);
			sb.append(((encontre)?"Yes":"No")+"\n");
		}
		System.out.print(new String(sb));
	}
	
	static boolean encuentroPalabra ( int i ){
		for(int j=1;j<s.length;++j){
			boolean encontre = false;
			for(;i<d.length&&!encontre;i++){
				if(s[j]==d[i])
					encontre=true;
			}
			if(!encontre)return false;
		}
		return true;
	}

}
