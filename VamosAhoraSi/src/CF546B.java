import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF546B {

	public static void main(String[] args) throws Exception  {
		System.out.println(f(a.length()-1, b.length()-1));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int m[] = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(m);


		}
	}

	static String a = "exponential";
	static String b = "polynomial";

	static int f(int i, int j ){
		if(i>=0 && j>=0){
			int val = 1;
			return Math.min(f(i-1,j)+val,Math.min(f(i,j-1)+val,f(i-1,j-1)+val));
		}return 0;
	}



}
