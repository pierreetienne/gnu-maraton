import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF496A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] m = new int[N];
			int max = 0;
			int min = Integer.MAX_VALUE;
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
				if(i>0){ 
					max = Math.max(max, m[i]-m[i-1]);
					if(i-2>=0 ){
						min = Math.min(min, m[i]-m[i-2]);
					}
				}
			}
			System.out.println(Math.max(min, max));
		}
	}
}
