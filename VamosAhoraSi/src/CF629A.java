import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF629A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			char[][] m = new char[n][];
			for(int i=0;i<n;++i){
				m[i]=in.readLine().toCharArray();
			}
			long count = 0;
			
			for(int i=0;i<n;++i){
				int cant = 0;
				for(int j=0;j<n;++j){
					if(m[i][j]=='C')
						cant++;
				}
				count+= (cant*(cant-1))/2.;
				cant=0;
				for(int j=0;j<n;++j){
					if(m[j][i]=='C')
						cant++;
				}
				count+= (cant*(cant-1))/2.;
			}
			
			System.out.println(count);
			
		}

	}

}
