import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF233A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			if(N == 1)System.out.println(-1);
			else{
				
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
