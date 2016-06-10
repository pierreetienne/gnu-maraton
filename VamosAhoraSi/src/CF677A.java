import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CF677A{

	public static void main(String[]args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			ln = in.readLine();
			st = new StringTokenizer(ln);
			int cont = 0;
			for(int i=0;i<a;++i){
				int x = Integer.parseInt(st.nextToken());
				if(x>h)cont+=2;
				else cont+=1;
			}
			System.out.println(cont);
		}
	}
}