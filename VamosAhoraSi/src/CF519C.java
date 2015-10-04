import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF519C {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int rest = 0;
			int mayor = Math.max(N, M);
			int min = Math.min(N, M);
			while(mayor+min >=3 && mayor>0 & min > 0){
				mayor-=2;
				min-=1;
				int auxA = mayor;
				int auxB = min ;
				mayor = Math.max(auxA, auxB);
				min = Math.min(auxA, auxB);
				rest++;
			}
			System.out.println(rest);
		}

	}

	static int f(int n ,int m ){
		if(n>0 && m>0 ){
			return Math.max(f(n-1,m-2), f(n-2, m-1))+1;
		}
		return 0;
		
	}
	
}
