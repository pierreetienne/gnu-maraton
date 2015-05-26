import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF110A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int count = 0;
			for(int i=0;i<ln.length();++i){
				if(ln.charAt(i)=='7'||ln.charAt(i)=='4'){
					count++;
				}
			}
			if(count==7 || count==4) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
