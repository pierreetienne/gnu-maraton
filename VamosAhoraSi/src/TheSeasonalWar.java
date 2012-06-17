
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TheSeasonalWar {

	public static char[][] m ;
	public static final int dx[] = new int[]{-1,1,0,0,1,-1, -1, 1};
	public static final int dy[] = new int[]{0,0, -1,1,1,-1, 1,-1};
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = null;int casos = 1;
		while((line = bf.readLine())!= null){
			int n = Integer.parseInt(line);
			m = new char[n][n];
			for(int i=0;i<n;++i)
				m[i]=bf.readLine().toCharArray();
			int cont = 0 ;
			for(int i=0;i<n;++i){
				for(int j=0;j<n;++j){
					if(m[i][j]=='1'){
						f(i, j );
						cont++;
					}
				}
			}
			System.out.println("Image number "+(casos++)+" contains "+cont+" war eagles.");
		}
	}
	
	
	public static void f(int i, int j){
		m[i][j]='0';
		for(int p=0;p<dx.length;++p){
			if(i+dx[p]>=0 && i+dx[p]< m.length && j+dy[p]>=0 && j+dy[p]<m.length && m[i+dx[p]][j+dy[p]]=='1' ){
				f(i+dx[p] , j+dy[p]);
			}
		}
	}
	
	

}
