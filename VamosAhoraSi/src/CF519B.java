import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class CF519B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			TreeMap<Integer, Integer> a1 = new TreeMap<Integer, Integer>();
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				int v = Integer.parseInt(st.nextToken());
				if(a1.get(v)==null)
					a1.put(v, 1);
				else
					a1.put(v, a1.get(v)+1);
				
			}
			TreeMap<Integer, Integer> a2 = new TreeMap<Integer, Integer>();
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<N-1;++i){
				int v = Integer.parseInt(st.nextToken());
				if(a2.get(v)==null)
					a2.put(v, 1);
				else
					a2.put(v, a2.get(v)+1);
			}
			TreeMap<Integer,Integer > cpyA2 = new TreeMap<Integer, Integer>(a2);
			TreeMap<Integer, Integer> a3 = new TreeMap<Integer, Integer>();
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<N-2;++i){
				int v = Integer.parseInt(st.nextToken());
				if(a3.get(v)==null)
					a3.put(v, 1);
				else
					a3.put(v, a3.get(v)+1);
			}
			
			for(int x : a1.keySet()){
				if(a2.get(x)==null||a2.get(x).intValue()-a1.get(x).intValue()<0){
					System.out.println(x);
				}else  {
					a2.put(x,a2.get(x)-1);
				}
			}
			
			for(int x : cpyA2.keySet()){
				if(a3.get(x)==null||a3.get(x).intValue()-cpyA2.get(x).intValue()<0){
					System.out.println(x);
				}else  {
					a3.put(x,a3.get(x)-1);
				}
			}
		}
	}
}
