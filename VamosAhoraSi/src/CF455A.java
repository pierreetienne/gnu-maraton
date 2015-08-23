import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class CF455A {


	static Map<Integer, Integer> map ;
	static List<Integer> keys;
	static long[] memo;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			map = new HashMap<Integer,Integer>();
			keys = new ArrayList<Integer>();
			int N = Integer.parseInt(ln);
			memo = new long[N+5];
			Arrays.fill(memo, -1);
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				int val =Integer.parseInt(st.nextToken());
				if(map.get(val)==null)
					map.put(val, 1);
				else 
					map.put(val, map.get(val)+1);
			}
			keys.addAll(map.keySet());
			System.out.println(f(0));
		}
	}
	
	
	static long f(int index  ){
		if(index>=keys.size())
			return 0;
		if(memo[index]!=-1)return memo[index];
		long max = 0;
		long value = (map.get(keys.get(index))*keys.get(index));
		if(index+1 < keys.size() && keys.get(index+1).equals(keys.get(index)+1)){
			max = f(index+2)+value;
		}else {
			max = f(index+1)+value;
		}
		max = Math.max(max, f(index+1));
		return memo[index]=max ;
	}
	

}
