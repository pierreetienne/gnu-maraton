import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF230B {

	public static void main(String[] args)throws Exception  {
		boolean[] primos = new boolean[1000000];
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i){
				if(!primos[j])
					primos[j]=true;
			}
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			for(int i=0;i<n;++i){
				
			}
		}
	}

}
