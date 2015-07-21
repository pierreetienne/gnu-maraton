import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF478A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			if(sum%5==0){
				int val = sum/5;
				if((val*5)== sum && sum >0)
					System.out.println((int)(sum/5));
				else 
					System.out.println(-1);
			}
			else
				System.out.println(-1);
		}

	}

}
