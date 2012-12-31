import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva562 {

	static int[] m;
	
	static int mitad;
	static int f(int pos, int val){
		if(val==0)return 0;
		if(val<0)return Integer.MAX_VALUE;
		if(pos >= m.length)return Integer.MAX_VALUE;
		return Math.min(f(pos+1,val), Math.min(f(pos+1,val-m[pos]), (val-m[pos]>=0)?val-m[pos]:Integer.MAX_VALUE));
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			int C = Integer.parseInt(bf.readLine());
			StringTokenizer st = new StringTokenizer(bf.readLine());
			m = new int[C];
			int suma = 0 ;//nooooooooooooooooo
			for(int i=0;i<C;++i)
				suma += m[i]=Integer.parseInt(st.nextToken());
			mitad = (int) Math.ceil((double)(suma/2));
			int val =f(0,mitad);
			int res = 0;
			if(val == 0 ){
				res = (suma-mitad)-mitad;
			}
			else {
				res = val+(suma-mitad)-1;
			}
			System.out.println(res);
		}
	}

}
