
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva10041 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int T = Integer.parseInt(st.nextToken());
			int[] v = new int[T];
			for(int i=0;i<T;++i)v[i]=Integer.parseInt(st.nextToken());
			Arrays.sort(v);
			int sum = 0, m = (T%2==0)?(v[T/2]+v[T/2-1])/2:v[T/2]; 
			for(int i=0;i<T;++i)sum += Math.abs(v[i]-m);
			System.out.println(sum);
		}
	}

}
