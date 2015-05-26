import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF82A {

	public static void main(String[] args) throws Exception {
		String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			if(n<=names.length)
				System.out.println(names[n-1]);
			else{
				n-=names.length;
				int sum = 0;
				int i=2;
				for(;true;i*=2){
					sum+=i*(names.length);
					if(sum>n)break;
				}
				for(int j=0;j<names.length;++j){
					sum -=i;
					if(sum <  n){
						System.out.println(names[names.length-j-1]);
						break;
					}
					
				}
			}
		}
	}

}
