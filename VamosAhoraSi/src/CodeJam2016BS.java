import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeJam2016BS {

	public static void main(String[] args)throws Exception  {
		boolean [] primos = new boolean[1<<17];
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i){
				if(!primos[j])
					primos[j]=true;
			}
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//		BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			int casos = Integer.parseInt(ln);
			int c = 1;
			while(casos-->0){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int N = Integer.parseInt(st.nextToken());
				int J = Integer.parseInt(st.nextToken());
				sb.append("Case #"+c+":\n");

				int desde = (1<<(N-1))+1;
				int hasta = (1<<N)-1;
				for(int cont = 0;desde<=hasta&& cont<J;desde++){
					for(int i=2;i<10;++i){
						System.out.println("base: " + i +" valor " + Integer.toString(desde, i));
					}

				}
				System.out.println(Integer.toBinaryString(desde));
				System.out.println(Integer.toBinaryString(hasta));
				c++;
			}
		}
		System.out.print(new String(sb));
	}

}
