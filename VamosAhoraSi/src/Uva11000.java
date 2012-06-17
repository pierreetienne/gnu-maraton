
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pierre Etienne Pradere Palacios
 * @linkDeArchivo http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1941
 * @veredict Accepted 
 * @problemId 11000
 * @problemName  Bee
 * @judge http://uva.onlinejudge.org/
 * @category AC
 * @level easy
 * @date 12/28/2011
 **/ 

public class Uva11000 {
	public static void main(String[] args) throws Exception{
		long[][] m = new long[2000][2];
		m[0][1]=1;
		m[1][0]=1;m[1][1]=2;
		for(int i=2;i<m.length;++i){
			m[i][0]=m[i-1][1];
			m[i][1]=m[i-1][0]+m[i-1][1]+1;
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		while(n!=-1){
			System.out.println(m[n][0]+" "+m[n][1]);
			n = Integer.parseInt(bf.readLine());
		}
	}
}
