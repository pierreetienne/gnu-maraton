import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF385A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int[] p = new int[n];
			st = new StringTokenizer(in.readLine());
			int max = 0;
			for(int i=0;i<n;++i){
				p[i]=Integer.parseInt(st.nextToken());
				if(i>0){
					if((p[i-1]-p[i]-c)>max){
						max = p[i-1]-p[i]-c;
					}
				}
			}
			System.out.println((int)Math.max(max,0));
			
		}
	}

}
