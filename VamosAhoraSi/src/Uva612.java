import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Uva612 {
	
	static Comparator<int[]>  c = new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {
			return (o1[1]-o2[1]==0)?o1[0]-o2[0]:o1[1]-o2[1];
		}
	};

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());

		while(N-->0){
			bf.readLine();
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int T = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			char[][] m = new char[C][];
			int[][] pos = new int[C][];
			for(int i=0;i<C;++i){
				m[i]=bf.readLine().toCharArray();
				int val = 0;
				for(int j=0;j<m[i].length-1;++j){
					for(int p=j+1;p<m[i].length;++p){
						if(m[i][j]>m[i][p])val++;
					}
				}
				pos[i] =new int[]{ i,val};
			}
			
			Arrays.sort(pos,c);
			for(int i=0;i<pos.length;++i){
				sb.append(new String(m[pos[i][0]]));
				sb.append("\n");
			}
			if(N-1>=0)sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
