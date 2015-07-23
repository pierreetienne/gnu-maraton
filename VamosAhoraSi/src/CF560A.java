import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF560A {

	public static void main(String[] args)throws Exception  {
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] values = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				values[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(values);
			if(values[0]==1)
				System.out.println("-1");
			else
				System.out.println("1");
			
			
			
		}
	}

}
