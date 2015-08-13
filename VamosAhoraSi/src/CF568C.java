import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF568C {

	public static void main(String[] args) 	throws Exception  {
		boolean[] primos = new boolean[2000000];
		int[] primosC = new int[2000000];
		int[] palC = new int[2000000];
		primos[0]=primos[1]=true;
		palC[1]=1;
		for(int i=2;i<primos.length;++i){
			if(!primos[i]&&i<10000)
				for(int j=i*i;j<primos.length;j+=i){
					primos[j]=true;
				}
			primosC[i]=primosC[i-1]+(primos[i]?0:1);
			palC[i]=palC[i-1]+(isPal(i)?1:0);
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int sol=-1;
			for(int i=0;i<primosC.length;i++)
				if(q*primosC[i]<=p*palC[i])
					sol=i;
			if(sol==-1)
				System.out.println("Palindromic tree is better than splay tree");
			else
				System.out.println(sol);
		}
	}

	private static boolean isPal(int n) {
		char[] a=(n+"").toCharArray();
		for(int i=0;i<a.length/2;i++)
			if(a[i]!=a[a.length-1-i])
				return false;
		return true;
	}

}
