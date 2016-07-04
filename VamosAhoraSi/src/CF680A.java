import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CF680A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			Map<Integer, Integer> map = new HashMap<Integer,Integer>();
			int sum = 0;
			for(int i=0;i<5;++i){
				int val = Integer.parseInt(st.nextToken());
				sum+=val;
				if(map.get(val)==null){
					map.put(val, 1);
				}else{
					map.put(val, map.get(val)+1);
				}
			}
			int min = Integer.MAX_VALUE;
			for(Integer val: map.keySet()){
				int aux = sum;
				if(map.get(val)==2){
					aux = aux  -  (2*val);
				}else if(map.get(val)>2){
					aux = aux - (3*val);
				}
				min = Math.min(min, aux);
			}
			System.out.println(min);
		}
	}
}
