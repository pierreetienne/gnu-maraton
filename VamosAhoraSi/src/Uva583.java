import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Uva583 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;)
		{
			int N = Integer.parseInt(linea);
			if(N == 0)break;
			boolean negativo = N<0 ?true:false;
			ArrayList<Integer> m = fatorizacionPrima(negativo?-1*N:N);
			sb.append(N+" = ");
			if(negativo)
				sb.append("-1 x ");
			for(int i=0;i<m.size();++i){
				if(i+1<m.size() ){
					sb.append(m.get(i)+" x ");
				}else
					sb.append(m.get(i));
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}
	
	static ArrayList<Integer>  fatorizacionPrima (int n )
	{
		ArrayList<Integer> r = new ArrayList<Integer>();
		while(n%2==0){
			r.add(2);
			n/=2;
		}
		int j=3;
		while(j*j<n+1){
			if(n%j==0)
			{
				r.add(j);
				n = n /j;
			}
			else
				j+=2;
		}
		if(n > 1 )r.add(n);
		return r;
	}
}
