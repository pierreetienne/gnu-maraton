import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF368B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				arr[i]=Integer.parseInt(st.nextToken());
			}
			Set<Integer> s = new TreeSet<Integer>();
			int[] diff = new int[arr.length];
			for(int i=n-1;i>=0;--i){
				s.add(arr[i]);
				diff[i]=s.size();
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<m;++i){
				int val = Integer.parseInt(in.readLine());
				sb.append(diff[val-1]+"\n");
			}
			System.out.print(new String(sb));
		}
	}
}
