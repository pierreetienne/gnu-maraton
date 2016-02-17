import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CF621A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			List<Long> impar = new ArrayList<Long>();
			StringTokenizer st = new StringTokenizer(in.readLine());
			long sum = 0;
			for(int i=0;i<n;++i){
				long num = Long.parseLong(st.nextToken());
				sum += num;
				if(num%2!=0)
					impar.add(num);
			}
			Collections.sort(impar);
			if(impar.size()%2!=0 && impar.size()>0){
				sum -= impar.get(0);
			}
			System.out.println(sum);
			
		}

	}

}
