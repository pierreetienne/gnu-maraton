import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF69A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] values = new int[3];
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				for(int j=0;j<values.length;++j){
					values[j]+=Integer.parseInt(st.nextToken());
				}
			}
			if(values[0]==0 && values[1]==0 && values[2] == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
