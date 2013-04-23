import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva562 {

	static int[] m;


	static int f(int pos , int l, int x){
		if(l == x && l+x>0)
			return 0;
		else if(pos+1<m.length)
			return Math.min(f(pos+1, l+m[pos],x),f(pos+1, l, x+m[pos]));
		else
			return Math.abs(l-x);
	}



	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			int C = Integer.parseInt(bf.readLine());
			StringTokenizer st = new StringTokenizer(bf.readLine());
			m = new int[C];
			int suma = 0 ;
			for(int i=0;i<C;++i)
				suma += m[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(m);
			int min = f(0, 0, 0);

			System.out.println(min);

		}
	}

}
