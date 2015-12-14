import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class party {
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N  = Integer.parseInt(bf.readLine().trim());
		boolean[] horas = new boolean[33];
		int casos = 1;
		while(N != 0){
			int[][] m = new int[N][];
			for(int i=0;i<m.length;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				m[i] = new int[]{Integer.parseInt(st.nextToken())-8,Integer.parseInt(st.nextToken())-8}; 
			}
			Arrays.sort(m, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					int dif = (o1[1]-o1[0]) -(o2[1]-o2[0]);
					return   dif == 0 ? o1[0]-o2[0]: dif ;
				}
			});
			int cont = 0;
			for(int i=0;i<m.length;++i){
				for(int j=m[i][0];j<m[i][1];++j){
					if(!horas[j*2]){
						cont++;
						horas[j*2]=true;
						break;
					}
					else if(!horas[(j*2)+1])
					{
						cont++;
						horas[(j*2)+1]=true;
						break;
					}
				}
			}
			Arrays.fill(horas, false);
			sb.append("On day "+(casos++)+" Emma can attend as many as "+cont+" parties.\n");
			N  = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}
}