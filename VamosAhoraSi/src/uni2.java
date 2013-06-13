import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class uni2 {

	static int M;
	static TreeSet<Integer> d;
	
	
//	public static int f ( int A , int m ){
//		if( d.size()-Integer.bitCount(A) > 0 )
//			return 0;
//		if( m > M ) return Integer.MAX_VALUE;
//		else{
//			int B = A;
//			
//			otro.removeAll(g(A,m));
//			return Math.min( f(A , m+1)  ,  f(otro,m)+1 ) ;
//		}
//	}
//	
//	public static  int g( TreeSet<Integer> A ,int m ){
//		int ant = 0;
//		TreeSet<Integer> sol = new TreeSet<Integer>();
//		for (Integer i : A ) {
//			if( Math.abs(i-ant) == m ){
//				ant = i;
//			}else{
//				sol.add(i);
//			}
//		}
//		return sol;
//	}
//	
	public static void main(String[] args) throws Throwable {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			M = Integer.parseInt(st.nextToken()); int  N = Integer.parseInt(st.nextToken());
			d=new TreeSet<Integer>();
			for (int i = 0; i < N; i++) {
				d.add(Integer.parseInt(st.nextToken()));
			}
			int min = Integer.MAX_VALUE;
			for (int i = 1; i < 101; i++) {
//				min = Math.min(min, f(d, i));
			}
			
			System.out.println(min);				
			
		}
	}

}
