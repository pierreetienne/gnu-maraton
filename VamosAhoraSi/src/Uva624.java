import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva624 {

	static int[] c;

	static int N;

	static String x;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			N = Integer.parseInt(st.nextToken()); int T =Integer.parseInt(st.nextToken());
			c = new int[T];
			for(int i=0;i<T;++i)c[i]= Integer.parseInt(st.nextToken());

			System.out.println(N- f(0, N,"" ) + " y " + x);
		}
	}

	static int f(int index , int V , String y ){
		if(V ==  0){x = y; return 0;}
		if(V > 0  ){
			if( index < c.length){
				return Math.min(f(index+1, V,y), f(index+1, V-c[index], y+c[index]+" "));
			}
			x= y;
			return V;
		}
		return Integer.MAX_VALUE;
	}
}
