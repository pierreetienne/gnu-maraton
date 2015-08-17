import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF556C {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int maximo = (2*N)-K-1;
			for(int i=0;i<K;++i){
				st = new StringTokenizer(in.readLine());
				int actual = 0;
				int s = Integer.parseInt(st.nextToken());
				for(int j=0;j<s;++j){
					int val = Integer.parseInt(st.nextToken());
					if(val==1){
						actual = val;
					}else if(val == actual+1){
						actual = actual+1;
						maximo -= 2;
					}
				}
			}
			System.out.println(maximo);
		}
	}

}
