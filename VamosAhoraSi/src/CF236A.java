import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF236A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int differentChar = 0;
			boolean[] chars  = new boolean[30];
			for(int i=0;i<ln.length();++i){
				if(!chars[ln.charAt(i)-'a']){
					differentChar++;
					chars[ln.charAt(i)-'a']=true;
				}
			}
			if(differentChar%2!=0)
				System.out.println("IGNORE HIM!");
			else
				System.out.println("CHAT WITH HER!");
		}

	}

}
