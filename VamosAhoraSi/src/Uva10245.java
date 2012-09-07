import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Uva10245 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		while(N != 0){
			int[][] m  = new int[N][];
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				m[i]= new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			}
			Arrays.sort(m, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
			});
			double r = puntoMasCercanos(m);
				System.out.println("res: " + r);
			N = Integer.parseInt(bf.readLine().trim());
		}
	}

	private static double puntoMasCercanos(int[][] m) {

		if(m.length ==2 )
			return distanciaPuntos(m);
		
		int[][] p1 = new int[(int) Math.ceil(m.length/2)][];
		int i=0;
		for(;i<p1.length;++i)
			p1[i]= new int[]{m[i][0], m[i][1]};
		
		int[][] p2 = new int[(int)Math.floor(m.length/2)][];
		for(int j=0;j<p2.length;++j,++i)
			p2[j]=new int[]{m[i][0],m[i][1]};
		
		return Math.min(puntoMasCercanos(p1),puntoMasCercanos(p2));
	}
	
	static double distanciaPuntos(int[][] puntos){
		return Math.sqrt(((puntos[1][0]-puntos[0][0])*(puntos[1][0]-puntos[0][0]) ) + ((puntos[1][1]-puntos[0][1])*(puntos[1][1]-puntos[0][1])));
	}
}
