import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ACM3026 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N != 0){
			char[] linea = bf.readLine().toCharArray();
			System.out.println(Arrays.toString(getBorderArray(linea)));
			System.out.println(periodo(linea));
			N = Integer.parseInt(bf.readLine());
		}
	}

	public static int[] getBorderArray(char[] W)
	{
		int[] T=new int[W.length+1]; T[0]=-1; T[1]=0;
		for (int i=2,j=0; i<=W.length; )
		{if (W[i-1]==W[j]) T[i++]=++j; else if (j>0) j=T[j]; else T[i++]=0;}
		return T;
	}
	
	static int periodo(char[] W) {int t=W.length,k=t-getBorderArray(W)[t]; return t%k==0?t/k:1;}
}
