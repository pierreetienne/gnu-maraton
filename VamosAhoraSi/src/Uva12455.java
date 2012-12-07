import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva12455 {

	static int[] v;
	
	static boolean f(int index , int T){
		if(T == 0)
			return true;
		if(T < 0)
			return false;
		else if(index< v.length)
			return f(index+1, T-v[index])|| f(index+1, T);
		return false;
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			int T = Integer.parseInt(bf.readLine().trim() );
			v = new int[Integer.parseInt(bf.readLine().trim())];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<v.length;++i)	v[i] = Integer.parseInt(st.nextToken());
			sb.append(f(0,T)?"YES\n":"NO\n");
		}
		System.out.print(new String(sb));
	}

}
