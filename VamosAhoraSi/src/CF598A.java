import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF598A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int cases = Integer.parseInt(ln);
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<cases;++i){
				long c = Long.parseLong(in.readLine());
				long suma = (c*(c+1l))/2l;
				long cuadrados = 0;
				for(int q=1;q<=c;q*=2){
					cuadrados+=q;
				}
				cuadrados*=-2;
				suma+=cuadrados;
				sb.append(suma+"\n");
			}
			System.out.println(new String(sb));
		}
	}
}
