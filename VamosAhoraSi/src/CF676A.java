import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF676A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[] m = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			int posN = 0;
			int pos1 = 0;
			for(int i=0;i<n;++i){
				m[i]=Integer.parseInt(st.nextToken());
				if(m[i]==1)
					pos1=i;
				if(m[i]==n)
					posN =i;
			}
			int a = pos1;
			int b = posN;
			int c = Math.abs(pos1 - n)-1;
			int d = Math.abs(posN - n)-1;
			int max = Math.max(a, Math.max(b, Math.max(c, d)));
			System.out.println(max);
		}

	}

}
