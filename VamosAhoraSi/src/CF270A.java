import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF270A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			for(int i=0;i<n;++i){
				int g = Integer.parseInt(in.readLine());
				double val = (360./(g-180.));
				double o = (int) val;
				if(o==val){
					System.out.println("YES");
				}else 
					System.out.println("NO");
			}
		}

	}

}
