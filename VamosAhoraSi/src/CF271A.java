import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF271A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			for(int i=n+1;i<=10000;++i){
				String num = i+"";
				boolean[] diff = new boolean[30];
				boolean ok = false;
				for(int j=0;j<num.length()&&!ok;++j){
					if(!diff[num.charAt(j)-'0']){
						diff[num.charAt(j)-'0']=true;
					}else
						ok = true;
				}
				if(!ok){
					System.out.println(num);
					break;
				}
			}
		}
	}

}
