import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF686A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			long n = Long.parseLong(st.nextToken());
			long x = Long.parseLong(st.nextToken());
			long dis = 0;
			for(int i=0;i<n;++i){
				ln = in.readLine();
				long val = Long.parseLong(ln.substring(2));
				if(ln.charAt(0)=='+'){
					x+=val;
				}else{
					if(x>=val){
						x-=val;
					}else{
						dis++;
					}
				}
			}
			System.out.printf("%d %d\n", x, dis);
		}
	}

}
