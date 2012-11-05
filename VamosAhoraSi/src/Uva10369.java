import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10369 {

	static int[][] pos;
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int S = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			pos = new int[P][];
			for(int i=0;i<pos.length;++i){
				st = new StringTokenizer(bf.readLine());
				pos[i]=new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())}; 
			}
			
			for(int i=0;i<pos.length;++i){
				for(int j=i+1;j<pos.length;++j){
					System.out.println("Distancia entre: " + i+ " , " + j + " es : " + distancia(i, j));
				}
			}
			
		}
	}
	
	
	static double distancia(int i, int j ){
		return Math.sqrt(((pos[j][0]-pos[i][0])*(pos[j][0]-pos[i][0]))+((pos[j][1]-pos[i][1])*(pos[j][1]-pos[i][1])) );
	}

}
