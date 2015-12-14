import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class sweets {
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N -- > 0){
			bf.readLine();
			StringTokenizer st = new StringTokenizer(bf.readLine());
			char[][] m = new char[Integer.parseInt(st.nextToken().trim())][Integer.parseInt(st.nextToken().trim())];
			int cont = 0;
			for(int i=0;i<m.length;++i){
				m[i] = bf.readLine().trim().toCharArray();
				for(int j=2;j<m[i].length;++j)
					if(m[i][j-2]==(char)62 &&  m[i][j-1]==(char)111 && m[i][j]==(char)60){
//						System.out.println( "fila " + i );
						cont++;
					}
			}
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=2;i<m.length;++i){
				for(int j=0;j<m[i].length;++j){
					if(m[i-2][j]==(char)118 && m[i-1][j]==(char)111 && m[i][j]==(char)94){
//						System.out.println( "col " + j );
						a.add(j);
						cont++;
					}
				}
			}
			
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i][5]+""+m[i][6]);
			}
			
//			Collections.sort(a);
//			for (int i = 0; i < a.size(); i++) {
//				System.out.println(a.get(i));
//			}
			sb.append(cont+"\n");
		}
		System.out.print(new String(sb));
	}
}
