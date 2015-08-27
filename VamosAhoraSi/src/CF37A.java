import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF37A {

	public static void main(String[] args)throws Exception  {
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] m = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] cont = new int[1001];
			int h = 0;
			int cant = 0;
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
				if(cont[m[i]]==0){
					cant++;
				}
				cont[m[i]]++;	
				h = Math.max(h,cont[m[i]]);
			}
			System.out.println(h + " "+ cant );
		}

	}

}
