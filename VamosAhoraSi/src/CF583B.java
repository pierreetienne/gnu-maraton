import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF583B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] m = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
			}
			int actual = 0;
			int count = 0;
			int dir = 1;
			boolean hay = true;
			while(hay){
				hay = false;
				for(int i=(dir==1)?0:N-1;i<N && i>=0 ;i+=dir){
					if(actual>=m[i] && m[i]!=-1){
						m[i]=-1;
						actual++;
					}
					if(m[i]!=-1)
						hay=true;
				}
				if(hay)
					count++;
				if(dir==1)
					dir=-1;
				else
					dir=1;
				
			}
			
			System.out.println(count);
		}
	}

}
