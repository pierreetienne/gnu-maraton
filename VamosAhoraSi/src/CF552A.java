import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;


public class CF552A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int[][] m = new int[100][100];
			for(int i=0,p=100;i<100;++i,--p){
				for(int j=0;j<100;++j){
					m[i][j]=p-(j+1);
				}
				System.out.println(Arrays.toString(m[i]));
			}
		}

	}

}
