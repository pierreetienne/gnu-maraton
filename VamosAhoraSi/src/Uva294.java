import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

//NO 
public class Uva294 {
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int max = 0;
			int num = 0;
			for(int i=S;i<=E;++i){
				int cont =1;
				Long[] m = factPrima(i);
				TreeSet<Long> t = new TreeSet<Long>();
				System.out.println(m .length);
				for(int j=0;j<m.length;++j){
					for(long p=m[j];p<=i;p+=m[j]){
						if(i%p==0)
							t.add(p);
					}
				}
				cont = t.size()+1;
				if(cont>max){
					max = cont;
					num = i;
				}
//				for(int j=1;j<=i;++j){
//					if(i%j==0){cont++;System.out.println("p: " + j);}
//				}
//				System.out.println(i+" -- " + cont);
			}
			sb.append("Between "+S+" and "+E+", "+num+" has a maximum of "+max+" divisors.\n");
		}
		System.out.print(new String(sb));
	}

	static Long[] factPrima(long x){
		Set<Long> list = new TreeSet<Long>();
		long i; /* counter */
		long c; /* remaining product to factor */
		c = x;
		while ((c % 2) == 0) {
			list.add(2l);
			c = c / 2;
		}
		i = 3;
		while (i <= (Math.sqrt(c)+1)) {
			if ((c % i) == 0) {
				list.add(i);
				c = c / i;
			}
			else
				i = i + 2;
		}
		if (c > 1)	list.add(c);
		return list.toArray(new Long[0]);
	}
}