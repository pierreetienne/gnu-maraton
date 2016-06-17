import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF233A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			if(N %2 !=0 )System.out.println(-1);
			else{
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<N;i+=2){
					if(i==0)
						sb.append((i+2)+" "+ (i+1));
					else
						sb.append(" "+(i+2)+" "+ (i+1));
				}
				System.out.println(new String(sb));
			}
		}
	}
	
	static boolean validation(int[] v){
		for(int i=0;i<v.length;++i){
			if(v[v[i]]==i+1 && v[i]!=i+1)
				continue;
			else
				return false;
		}
		return true;
	}

}
