import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF266B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int N = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			char[] info = in.readLine().toCharArray();
			for(int i=0;i<T;++i){
				char[] res = Arrays.copyOf(info, info.length);
				for(int j=1;j<N;++j){
					if(info[j-1]=='B' && info[j]=='G'){
						res[j-1]='G';
						res[j]='B';
					}
				}
				if(new String(res).equals(new String(info)))
					break;
				info = res;
			}
			System.out.println(new String(info));
		}
	}

}
