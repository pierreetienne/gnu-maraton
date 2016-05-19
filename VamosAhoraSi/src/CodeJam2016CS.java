import java.io.BufferedReader;
import java.io.FileReader;

public class CodeJam2016CS {

	public static void main(String[] args) throws Exception {
		BufferedReader in =new BufferedReader(new FileReader("B-large.in")); // new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln = in.readLine())!=null;){
			int c = Integer.parseInt(ln);
			int casos = 1;
			while(c-->0){
				char[] s = in.readLine().toCharArray();
				int cont = 0;
				for(int i=1;i<s.length;++i){
					if(s[i-1]!=s[i]){
						cont++;
					}
				}
				if(s[s.length-1]=='-')cont++;
				sb.append("Case #"+casos+": "+cont+"\n");
				casos++;
			}
		}
		System.out.print(new String(sb));
	}

}
