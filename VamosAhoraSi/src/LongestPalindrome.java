
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class LongestPalindrome {
	public static String linea;
	public static int[][] m= new int[1005][1005];
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		while(n-->0){
			linea = bf.readLine();
			for(int i=0;i<m.length;++i)
				Arrays.fill(m[i], -1);
			if(linea.length()==1)
				System.out.println(1);
			else{
				int val = f(0,0)-1;
				System.out.println(((val==-1)?0:val));
			}
			System.out.println(max+" ...........");
		}	
	}
	
	public static int max = 0 ;
	public static int f(int i, int j ){
		if( i+j <= linea.length()){
			String sub = linea.substring(i,i+j);
			
			if(sub.equals(new StringBuffer(sub).reverse().toString())){
				if(sub.length()>max)
					max = sub.length();
				return Math.max(f(i,j+1), f(i+1,1))+sub.length();
			}
			else
				return Math.max(f(i,j+1),f(i+1,1));
		}return 0 ;
	}
	
	
	
}
