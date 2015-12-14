import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF378A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int x = 0;
			int y = 0;
			int t = 0;
			for(int i=1;i<=6;++i){
				int diffA = Math.abs(a-i);
				int diffB = Math.abs(b-i);
				if(diffA > diffB)
					y++;
				else if(diffB > diffA)
					x++;
				else if(diffA == diffB)	
					t++;
			}
			
			System.out.println(x +" "+t+" "+y);
		}

	}

}
