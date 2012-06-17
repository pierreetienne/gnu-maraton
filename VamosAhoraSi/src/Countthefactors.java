
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Countthefactors {

	public static void main(String[] atg)throws Exception {
		boolean[] m = new boolean[1000010];
		for(int i=2;i*i<m.length;++i){
			if(!m[i]){
				for(int j=i*i;j<m.length;j+=i){
					m[j]=true;
				}
			}
		}
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(bf.readLine());
		while(n!=0){
			int cont  = 0 ;
			for(int i=2;i<=n;++i){
				if(!m[i] && n%i==0)
					cont++;
			}
			System.out.println(n+ " : " + cont);
			
			n  = Integer.parseInt(bf.readLine());
		}
	}
}
