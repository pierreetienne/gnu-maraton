import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Uva11498 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N!=0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int[] posIni = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			
			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if(x == posIni[0] || y == posIni[1])
					sb.append("divisa\n");
				else if(x  > posIni[0]  && y > posIni[1])
					sb.append("NE\n");
				else if(x > posIni[0] && y < posIni[1])
					sb.append("SE\n");
				else if(x < posIni[0] && y < posIni[1])
					sb.append("SO\n");
				else
					sb.append("NO\n");
						
			}
			N = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}
}
