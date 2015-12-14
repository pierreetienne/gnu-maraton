import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF405A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[] values = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				values[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(values);
			for(int i=0;i<values.length;++i){
				if(i==0)
					System.out.print(values[i]);
				else
					System.out.print(" "+ values[i]);
			}
			System.out.println();
		}
	}

}
