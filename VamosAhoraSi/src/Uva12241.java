import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva12241 {

	static int[][] easy;

	public static void main(String[] args) throws Exception {
		int[] vals = {10,190,2890,38890,488890,5888890,68888890};
		easy = new int[8][10];
		for(int i=0;i<10;++i)
			easy[0][i]=1;
		for(int i=1;i<easy.length;++i){
			for(int j=0;j<10;++j){
				if(j>0)		easy[i][j]= (int) ((i+1)*Math.pow(10, i));
				else easy[i][j]=vals[i-1];
			}
		}
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println("Arrays a':" + Arrays.toString(normal(a,b)));
			
		}
	}
	
	static int[] normal (int desm, int n ){
		int m[] = new int[10];
		for(int i=desm;i<=n;++i){
			String num = i+"";
			for(int j=0;j<num.length();++j)
				m[num.charAt(j)-'0']++;	
		}
		return m;
	}

}
