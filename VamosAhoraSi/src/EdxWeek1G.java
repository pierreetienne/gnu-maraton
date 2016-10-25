import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EdxWeek1G {

	public static void main(String[] args) throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int K=Integer.parseInt(ln)+1;
			int	[] m=new int[K];
			boolean[] prime=new boolean[K];
			int max=0;
			for(int i=2;i*i<K;++i){
				for(int j=i+i;j<K;j+=i){
					prime[j]=true;
					m[j]++;
				}
			}
			System.out.println(Arrays.toString(prime));
			System.out.println(Arrays.toString(m));
		}
		
	}

}
