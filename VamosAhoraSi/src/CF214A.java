import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class CF214A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			Set<String> set = new TreeSet<String>();
			for(int i=0;i<=1000;++i){
				for(int j=0;j<=1000;++j){
					if(((i*i)+j)==n && (i+(j*j))==m)
						set.add(i+" "+j);
				}
			}
			System.out.println(set.size());
		}
	}
}
