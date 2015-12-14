import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;


public class subset {

	static long[] bags;
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new FileReader("subset"));
		int C = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(C-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long l = Long.parseLong(st.nextToken());
			bags = new long[Integer.parseInt(st.nextToken())];
			for(int i=0;i<bags.length;++i)
				bags[i] = Long.parseLong(bf.readLine().trim());
			long val = f(l, 0);
			if(val == Long.MAX_VALUE)
				sb.append("IMPOSSIBLE\n");
			else
				sb.append((l+val)+"\n");
		}
		System.out.print(new String(sb));
	}
	
	static long f(long n , int i){
		if(n<=0)return Math.abs(n);
		if(i>=bags.length)return Long.MAX_VALUE;
		return Math.min(f(n-bags[i], i+1), f(n, i+1));
	}

}
