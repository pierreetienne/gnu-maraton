import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF404A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			char[][]  m = new char[n][];
			for(int i=0;i<n;++i){
				m[i]=in.readLine().toCharArray();
			}
			char p = m[0][0];
			char mid = m[0][1];
			boolean valid = p!=mid;
			for(int i=0,j=0,q=n-1;i<n&&valid;++i,++j,--q){
				if(m[i][j]==p && m[i][q]==p){
					for(int r=0;r<n;++r){
						if(r!=j && r!=q ){
							if(m[i][r]==mid)
								continue;
							else
								valid=false;	
						}
					}
				}else
					valid =false;
			}
			System.out.println(valid?"YES":"NO");
		}
	}

}
