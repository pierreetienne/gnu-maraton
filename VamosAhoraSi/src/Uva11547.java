import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva11547 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			int x = Integer.parseInt(bf.readLine().trim());
			String res = ((((((x * 567)/9)+7492)*235)/47)-498)+"";
			sb.append(res.charAt(res.length()-2)+"\n");
		}
		System.out.print(new String(sb));
	}

}
