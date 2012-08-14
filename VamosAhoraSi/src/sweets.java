import java.io.BufferedReader;
import java.io.InputStreamReader;
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
					if(m[i][j-2]==(char)62 &&  m[i][j-1]==(char)111 && m[i][j]==(char)60)
						cont++;
			}
			
			for(int i=2;i<m.length;++i){
				for(int j=0;j<m[i].length;++j){
					if(m[i-2][j]==(char)118 && m[i-1][j]==(char)111 && m[i][j]==(char)94)
						cont++;
				}
			}
			sb.append(cont+"\n");
		}
		System.out.print(new String(sb));
	}
}
