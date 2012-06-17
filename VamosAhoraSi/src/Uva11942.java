

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Acepted
public class Uva11942 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(in.readLine().trim());
		StringBuilder sb = new StringBuilder();
		sb.append("Lumberjacks:\n");
		while(C-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());
			boolean ordenadoAsc =true, ordenadoDes = true;
			int p = Integer.parseInt(st.nextToken());
			while(st.hasMoreTokens()){
				int s = Integer.parseInt(st.nextToken().trim());
				if(p>s)ordenadoDes=false;
				if(s>p)ordenadoAsc = false;
				p=s;
			}
			if(ordenadoDes || ordenadoAsc)sb.append("Ordered\n");
			else sb.append("Unordered\n");
		}
		System.out.print(new String(sb));
	}

}
