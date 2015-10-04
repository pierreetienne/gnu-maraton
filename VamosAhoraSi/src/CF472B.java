import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class CF472B {

	static Integer[] m;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			m = new Integer[n];
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				int f = Integer.parseInt(st.nextToken());
				m[i]=f;
			}
			Arrays.sort(m, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o2.intValue()-o1.intValue();
				}
			});
			int sum = 0;
			int piso =1;
			for(int i=0;i<m.length;++i){
				if(i>0 && i%k==0){
					sum+=Math.abs(piso-1);
					piso =1;
				}
				sum+= Math.abs(piso-m[i]);
				piso = m[i];
			}
			sum+=Math.abs(piso-1);
			piso =1;
			System.out.println(sum);
					
		}	
	}
	
	

}
