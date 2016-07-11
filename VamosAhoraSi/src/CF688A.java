import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF688A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int sol = 0 ;
			int lastIndex = -1;
			int count = 0;
			for(int i=0;i<d;++i){
				ln = in.readLine();
				boolean zeros = ln.indexOf('0')>=0;
				if(zeros){
					if(i-1==lastIndex){
						count++;
					}
					lastIndex= i;
					sol = Math.max(sol, count);
				}
			}
			System.out.println((int)Math.max(1, sol));
		}

	}

}
