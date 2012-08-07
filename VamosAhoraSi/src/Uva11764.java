import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11764 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		int T = Integer.parseInt(bf.readLine().trim());
		while(T-->0){
			int[] m = new int[Integer.parseInt(bf.readLine().trim())];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int max = 0 , min = 0; 
			for(int i=0;i<m.length;++i){
				m[i] = Integer.parseInt(st.nextToken());
				if(i>0){
					if(m[i-1]< m[i])
						max ++;
					if( m[i-1]> m[i] )
						min ++;
				}
			}
			
		
			sb.append("Case "+(caso++)+": "+ max + " " + min + "\n");
		}
		System.out.print(new String(sb));

	}

}
