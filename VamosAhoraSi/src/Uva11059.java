

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Uva11059 {

	static int[] m;
	
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		for(String linea; (linea = bf.readLine())!=null;){
			m = new int[Integer.parseInt(linea)];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<m.length;++i)
				m[i] = Integer.parseInt(st.nextToken());
			long max = 0 ;
			for(int i=0;i<m.length;++i){
				long mul = m[i];
				max = (mul > max)? mul:max;
				for(int j=i+1;j<m.length;++j){
					mul *= m[j];
					max = (mul > max)? mul:max;
				}
			}
			sb.append("Case #"+(caso++)+": The maximum product is "+max+".\n\n");
			bf.readLine();
		}
		System.out.print(new String(sb));
	}
}
