import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF230B {

	static boolean[] primos;
	public static void main(String[] args)throws Exception  {
		primos = new boolean[1000000];
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i){
				if(!primos[j])
					primos[j]=true;
			}
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				long x = Long.parseLong(st.nextToken());
				System.out.println(x +" <<<< " +  f(x));
				
			}
		}
	}
	
	static Set<Integer> f(long x ){
		Set<Integer> s = new TreeSet<Integer>();
		s.add(1);
		s.add((int) x);
		while(x > 1){
			for(int i=2;i<primos.length;++i){
				if(primos[i] && x % i  == 0){
					x = x / i;
					s.add(i);
				}
			}
			System.out.println("---");
		}
		return s;
	}

}
