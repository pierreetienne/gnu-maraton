import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF459B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] m = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			int mini = Integer.MAX_VALUE;
			int maxi = 0;
			long cantMax = 0;
			long cantMin = 0;
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
				if(m[i]<mini){
					mini = m[i];
					cantMin=1;
				}else if(m[i]==mini){
					cantMin++;
				}
				
				if(m[i]>maxi){
					maxi = m[i];
					cantMax=1;
				}else if(m[i]==maxi){
					cantMax++;
				}
			}
			Arrays.sort(m);
			int max = m[m.length-1]-m[0];
			long mul = (mini == maxi&&cantMax==cantMin)? ((cantMin-1)*((cantMin)))/2:cantMax*cantMin;
			System.out.println(max + " " + mul);
				
		}
	}

}
