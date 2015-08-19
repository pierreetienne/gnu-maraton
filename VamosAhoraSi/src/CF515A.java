import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF515A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int sum = Math.abs(Integer.parseInt(st.nextToken()))+ Math.abs(Integer.parseInt(st.nextToken()));
			int s = Integer.parseInt(st.nextToken());
			if(sum%2==0 && s>=sum && s%2==0)
				System.out.println("Yes");
			else if(sum%2!=0 && s>=sum && s%2!=0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
