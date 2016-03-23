import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF595A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int count = 0;
			for(int i=0;i<n;++i){
				st=new StringTokenizer(in.readLine());
				for(int j=0;j<2*m;j+=2){
					String s = st.nextToken();
					if(s.equals("1")| st.nextToken().equals("1"))
						count++;
				}
			}
			System.out.println(count);
		}
	}
}
