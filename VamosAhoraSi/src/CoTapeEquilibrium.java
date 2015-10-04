import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CoTapeEquilibrium {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n  = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] v = new int[n];
			for(int i=0;i<n;++i){
				v[i]=Integer.parseInt(st.nextToken());
			}
			System.out.println(solution(v));
		}
	}
	
	public static int solution(int[] A){
		int min = Integer.MAX_VALUE;
		for(int i=1;i<A.length;++i){
			A[i]+=A[i-1];
		}
		for(int i=0;i<A.length;++i){
			int val = Math.min(min , Math.abs(A[i]- (A[A.length-1]- A[i])));
			min = Math.min(val, min);
		}
		return min;
	}
	

}
