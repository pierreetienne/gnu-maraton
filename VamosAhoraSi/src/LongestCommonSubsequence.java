
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class LongestCommonSubsequence {

	
	public static String linea1 ;
	
	public static String linea2;
	
	public static int[][] m = new int[1003][1003];
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		linea1= null ;
		while((linea1=bf.readLine())!=null){
			linea2 = bf.readLine();			
			for(int i=0;i<m.length;++i)
				Arrays.fill(m[i], -1);
			System.out.println(f(0,0));
		}
	}
	public static int f(int i, int j ){
		if(i>=linea1.length()|| j>=linea2.length())
			return 0;
		if(linea1.charAt(i)==linea2.charAt(j)){
			if(m[i][j]!=-1)
				return m[i][j];
			else{
				m[i][j] = f(i+1, j+1)+1;
				return m[i][j];
			}
		}else {
			if(m[i+1][j]== -1)
				m[i+1][j] = f(i+1, j );
			if(m[i][j+1]==-1)
				m[i][j+1]= f(i, j+1);
			return Math.max(m[i+1][j], m[i][j+1]);
		}
	}

}
