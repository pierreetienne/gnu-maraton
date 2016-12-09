import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HackerRankSort {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(in.readLine());
		int[] m = new int[Integer.parseInt(in.readLine())];
		StringTokenizer st = new StringTokenizer(in.readLine());
		int index = 0;
		for(int i=0;i<m.length;++i){
			m[i]=Integer.parseInt(st.nextToken());
			if(m[i]==V)
				index = i;
		}
		System.out.println(index);
	}

}
