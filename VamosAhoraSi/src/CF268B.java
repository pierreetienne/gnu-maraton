import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF268B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			
			int[] m = new int[n+5];
			m[1]=2;
			m[2]=4;
			int[] x = new int[n+5];
			x[1]=1;
			x[2]=3;
			for(int i=3;i<m.length;++i){
				m[i]=m[i-1]+(i);
				x[i]=x[i-1]+m[i-1];
			}
			System.out.println(x[n]);
		}
	}

}
