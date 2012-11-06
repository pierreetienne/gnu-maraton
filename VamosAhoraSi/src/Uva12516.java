import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//Accepted
public class Uva12516 {


	
	public static void main(String[] args) throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0 && C == 0) break;
			boolean[][] m = new boolean[F][C+1];
			int N = Integer.parseInt(bf.readLine());
			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				String a = st.nextToken();
				int fila = a.charAt(0)-'A';
				int colum = Integer.parseInt(a.substring(1))-1;
				a = st.nextToken();
				if(a.trim().equals("-"))m[fila][colum]=true;
				else m[fila][colum+1]=true;
			}
			N = Integer.parseInt(bf.readLine());
			int[][] info = new int[N][];
			for(int i=0;i<N;++i){
				String x = bf.readLine(); 
				int fila = x.charAt(0)-'A';
				int colum = Integer.parseInt(x.substring(1))-1;
				info[i]= new int[]{fila,colum};
			}
			Arrays.sort(info, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0]==0?o1[1]-o2[1]:o1[0]-o2[0];
				}
			});
			
			boolean funciona = true;
			for(int i=0;i<N&&funciona;++i){
				int fila = info[i][0];
				int colum = info[i][1];
				if(!m[fila][colum])
					m[fila][colum]=true;
				else if(!m[fila][colum+1])
					m[fila][colum+1]=true;
				else
					funciona=false;
			}
			sb.append((funciona)?"YES\n":"NO\n");
		}
		System.out.print(new String(sb));
	}
}
