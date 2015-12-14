import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Uva10539 {

	static ArrayList<Long> p;
	
	public static void main(String[] args) throws Exception{
		boolean[] primos  = new boolean[1000001];
		p = new ArrayList<Long>();
		p.add(1l);
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i){
				primos[j]=true;
			}
			if(!primos[i])
				p.add((long) i);
		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long x = Long.parseLong(st.nextToken());
			long y = Long.parseLong(st.nextToken());
			long tamaMax = y - x;
			
			if(tamaMax==0)
				sb.append("0\n");
			else{
				int cant = 0;
				for(long i=x;i<=y;++i){
					int contFactPrimos = 0;
					for(long j=2;j<i&& contFactPrimos<2;++j){
						if(i%j==0 && Collections.binarySearch(p, j) >= 0 ){
							contFactPrimos++;
						}
					}
					if(contFactPrimos==1)
						cant++;
				}
				sb.append(cant+"\n");
			}
		}
		System.out.print(new String(sb));
	}

}
