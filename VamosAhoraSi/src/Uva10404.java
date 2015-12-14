import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva10404 {

	static int[] t ;

	static int[][] m ;

	static boolean f(int n ){
		if(n==1)return true;
		else if(n==0)return false;
		for(int i=0;i<t.length;++i){
			if(f(n-t[i])){
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken().trim());
			t = new int[Integer.parseInt(st.nextToken().trim())];
			for(int i=0;i<t.length;++i){
				t[i]= Integer.parseInt(st.nextToken().trim());
			}
			m= new int[N+2][2];
			for(int[]x: m)Arrays.fill(x,-1);
			
			System.out.println(f(N)?"Stan wins":"Ollie wins");
		}
	}

}
