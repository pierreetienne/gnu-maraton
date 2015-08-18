import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF570A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			int[][] data = new int[m][n];
			int[] wins = new int[n];
			for(int i=0;i<m;++i){
				st = new StringTokenizer(in.readLine());
				int max = -1;
				int win = -1;
				for(int j=0;j<n;++j){
					data[i][j]=Integer.parseInt(st.nextToken());
					if(data[i][j]>max){
						max = data[i][j];
						win = j;
					}
				}
				wins[win]++;
			}
			int max = -1;
			int index = -1;
			for(int i=0;i<wins.length;++i)
				if(max< wins[i]){
					max = wins[i];
					index = i+1;
				}
				
			System.out.println(index);
		}

	}

}
