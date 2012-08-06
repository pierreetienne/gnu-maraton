import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Uva11827 {
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			ArrayList<Integer> d = new ArrayList<Integer>();
			while(st.hasMoreTokens()){
				d.add(Integer.parseInt(st.nextToken().trim()));
			}
			int max = 0;
			for(int i=0;i<d.size()-1;++i){
				for(int j=i+1;j<d.size();++j){
					int val = gcd(d.get(i), d.get(j));
					if(val> max)
						max = val;
				}
			}
			sb.append(max+"\n");
		}
		System.out.print(new String(sb));
	}
	
	static int gcd(int a , int b ){
		int max = Math.max(a, b);
		int min  = Math.min(a, b);
		for(int i = min; i>=1;--i){
			if(min%i== 0  && max%i == 0 )
				return i;
		}
		return 1;
	}
}
