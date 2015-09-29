import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF463A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());//types
			int s = Integer.parseInt(st.nextToken())*100;//dollars
			int max = -1;
			for(int i=0;i<n;++i){
				st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken())*100;
				int b = Integer.parseInt(st.nextToken());
				int aux = s;
				int cont =-1;
				aux-=a;
				aux-=b;
				if(aux>=0 && b >0 ){
					cont=100-b;
				}else if(aux>=0&& b==0)
					cont=0;
				max = Math.max(max, cont);

			}
			System.out.println(max);
		}
	}
}
