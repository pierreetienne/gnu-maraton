import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva12241 {

	static int[][] easy;

	public static void main(String[] args) throws Exception {

		easy = new int[10][10];
		easy[0][0]=1;
		for(int i=1;i<10;++i){
			easy[i] = Arrays.copyOf(easy[i-1], 10) ;
			String n = i+"";
			for(int j=0;j<n.length();++j)easy[i][n.charAt(j)-'0']++;
		}


		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println("Arrays a: " + Arrays.toString(f(a)));
			System.out.println("Arrays a':" + Arrays.toString(normal(a)));
			System.out.println("Arrays b: " + Arrays.toString(f(b)));
			System.out.println("Arrays b':" + Arrays.toString(normal(b)));
		}
	}
	
	static int[] normal (int n ){
		int m[] = new int[10];
		for(int i=0;i<=n;++i){
			String num = i+"";
			for(int j=0;j<num.length();++j)
				m[num.charAt(j)-'0']++;
		}
		return m;
	}


	static int[] f ( int n ){
		if(n < 10 )return easy[n];
		int[] m = Arrays.copyOf(easy[9],10);
		String num = n +"";
		for(int i=num.length()-1,p=0;i>=0;--i,++p){
			int val = num.charAt(i)-'0';
			if(i==num.length()-1 )
				for(int j=0;j<=val;++j)	m[j]++;
			else
			{
				for(int j=1;j<val;++j){
					m[j]+=Math.pow(10, p);
				}
				m[val]++;
				for(int j=1;j<val;++j){
					for(int q=0;q<m.length;++q){
						m[q]++;
					}
				}
				
			}
		}
		return m;
	}


	static int[] multiply (int[] m , int n ){
		for(int i=0;i<m.length;++i)
			m[i]*=n;
		return m;
	}
}
