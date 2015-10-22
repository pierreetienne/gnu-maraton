import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF465A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (String ln;(ln=in.readLine())!=null;) {
			int N = Integer.parseInt(ln);
			String o = in.readLine();
			int diff = 0;
			boolean carry  = true;
			for(int i=0;i<o.length();++i){
				if(o.charAt(i)=='1'){
					if(carry){
						diff++;
						carry=true;
					}
				}else{
					if(carry){
						diff++;
						carry=false;
					}
				}
			}
			System.out.println(diff);
		}
	}
}
