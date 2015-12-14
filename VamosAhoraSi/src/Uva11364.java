import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva11364 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			int[] m = new int[Integer.parseInt(bf.readLine().trim())];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<m.length;++i){
				m[i]=Integer.parseInt(st.nextToken());
			}
			if(m.length>1){
				Arrays.sort(m);
				int pos = 0;
				if(m.length%2==0)
					pos = (m[m.length/2]+m[(m.length/2)-1])/2;
				else
					pos = m[(m.length/2)-1];

				int cont = 0;
				for(int i=1;i<m.length;++i){
					cont += m[i]-m[i-1];
				}
				cont += Math.abs(pos -m[m.length-1])+Math.abs(pos -m[0]);
				sb.append(cont+"\n");
			}
			else
				sb.append("0\n");
		}
		System.out.print(new String(sb));
	}
}
