

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ACM2326 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bf.readLine());
		boolean[] b = new boolean[501];
		while(cases-->0){
			int[][] m = new int[Integer.parseInt(bf.readLine())][2];
			for(int i=0;i<m.length;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				m[i][0]=Integer.parseInt(st.nextToken());
				m[i][1]=Integer.parseInt(st.nextToken());
			}
			int cont = 1;
			for(int i=0;i<m.length;++i){
				int min = Math.min(m[i][0], m[i][1]);
				int max = Math.max(m[i][1], m[i][1]);
				if(min%2==0)
					min --;
				if(max%2!=0)
					max++;
				boolean conte = false;
				for(int j=min ;j<=max;++j){
					if(b[j]==true && !conte){
						cont++;
						conte=true;
					}
					b[j]=true;
				}
			}
			System.out.println(cont*10);
			Arrays.fill(b, false);
		}
	}

}
