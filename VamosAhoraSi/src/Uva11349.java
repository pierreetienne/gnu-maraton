import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11349 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int casos = 1;
		while(T-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			st.nextToken();st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			long m[][] = new long[N][N];
			boolean symetric = true;
			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				for(int j=0;j<N;++j){
					m[i][j]=Long.parseLong(st.nextToken());
					if(m[i][j]<0)symetric = false;
				}
			}
			if(symetric){
				for(int i=0;i<m.length/2 && symetric;++i){
					for(int j=0;j<m.length&&symetric;++j){
						if(m[i][j]!=m[m.length-1-i][m.length-1-j])
							symetric=false;
					}
				}
				if(symetric){
					
					if(m.length%2 != 0){
						for(int i=0;i<m.length/2&&symetric;++i)
							if(m[m.length/2][i]!=m[m.length/2][m.length-1-i])
								symetric=false;
					}
					if(symetric)
						sb.append("Test #"+(casos++)+": Symmetric.\n");
					else
						sb.append("Test #"+(casos++)+": Non-symmetric.\n");
				}
				else
					sb.append("Test #"+(casos++)+": Non-symmetric.\n");
				
			}
			else{
				sb.append("Test #"+(casos++)+": Non-symmetric.\n");
			}
			 
		}
		System.out.print(new String(sb));
	}

}
