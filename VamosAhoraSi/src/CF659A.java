import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF659A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(b < 0){
				while(b<0){
					a--;
					if(a==0){
						a=n;
					}
					b++;
				}
			}else{
				while(b>0){
					a++;
					if(a==n+1)
						a=1;
					b--;
				}
			}
			System.out.println(a);
				
			
			
		}
				

	}

}
