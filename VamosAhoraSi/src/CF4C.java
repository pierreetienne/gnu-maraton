import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class CF4C {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			Map<String, Integer> s = new TreeMap<String, Integer>();
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<N;++i){
				String p = in.readLine();
				Integer num = s.get(p);
				if(num==null){
					s.put(p,0);
					sb.append("OK");
				}else{
					num++;
					s.put(p, num);
					sb.append(p+""+num);
				}
				if(i+1<N)
					sb.append("\n");
			}
			System.out.println(new String(sb));
		}
	}

}
