import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10446 {


	static int cont;

	static int f(int n, int back){
		int sum = 0;
		cont++;
		if(n<=0) return 0;
		if(n==1) return 1;
		for(int i=1;i<=back;i++)
			sum+=f(n-i,back);
		return sum;
	}


	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken().trim());
		int back = Integer.parseInt(st.nextToken().trim());
		StringBuilder sb = new StringBuilder();
		int casos = 1;
		while(N < 60){

//			if(N <= 0  )
//				cont = 1;
//			else if(N == 1)
//				cont = 1;
//			else {
//				cont = N;
//				for(int i=0;i<back-1;++i)
//					cont+=N-1;
//			}
			f(N, back);
			
			sb.append("Case "+(casos++)+": "+cont+"\n");
			cont = 0;
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken().trim());
			back = Integer.parseInt(st.nextToken().trim());
		}
		System.out.print(new String(sb));
	}
}
