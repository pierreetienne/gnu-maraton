import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva694 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
		int casos = 1;
		while(!(a==-1 && b==-1)){
			long cont = 1;
			long cpya = a ;
			do{
				if (a%2==0)
					a/=2;
				else
					a=3*a+1;
				if(a<=b)
				cont++;
				
			}while(a!=1 && a<=b );
			System.out.println("Case "+(casos++)+": A = "+cpya+", limit = "+b+", number of terms = "+cont);
			st = new StringTokenizer(bf.readLine());
			a = Long.parseLong(st.nextToken());
			b = Long.parseLong(st.nextToken());
		}
	}

}
