import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva686 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean[] primos = new boolean[32769];
		primos[0]=primos[1]=true;
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i)
				primos[j]=true;
		}

		int[] m = new int[32769];
		for(int j=2;j<primos.length ;++j){
			for(int p=j;p<primos.length&& j+p<m.length  ;++p){
				if(!primos[j] && !primos[p])
					m[j+p]++;
			}
		}
		
		int N = Integer.parseInt(bf.readLine());
		while(N != 0){
			System.out.println(m[N]);
			N = Integer.parseInt(bf.readLine());
		}
	}
}
