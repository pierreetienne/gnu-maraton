import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF49B {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			String a = st.nextToken().trim();
			String b = st.nextToken().trim();
			
			int ini = 1;
		
			for(int i = 0 ;i<a.length();++i){
				if(ini < (a.charAt(i)-'0'))
					ini =  (a.charAt(i)-'0');
			}
			
			for(int i = 0 ;i<b.length();++i){
				if(ini < (b.charAt(i)-'0'))
					ini =  (b.charAt(i)-'0');
			}
			int min = 0;
			for(int i=ini+1;i<=Character.MAX_RADIX;++i){
				String val = Integer.toString(Integer.valueOf(a,i)+Integer.valueOf(b, i), i);
				if(val.length() > min )
					min = val.length();
			}
			sb.append(min+"\n");
		}
		System.out.print(new String(sb));
	}

}
