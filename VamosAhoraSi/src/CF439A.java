import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF439A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int[] m = new int[N];
			st = new StringTokenizer(in.readLine());
			int cont = 0;
			int jokes = 0;
			for(int i=0;i<N;++i){
				m[i]= Integer.parseInt(st.nextToken());
				cont+=m[i];
				if(i+1<N){
					cont+=10;
					jokes+=2;
				}
			}
			if(cont<=D){
				int restJokes = Math.abs(cont-D)/5;
				jokes+=restJokes;
				System.out.println(jokes);
			}else{
				System.out.println(-1);
			}
		}
	}

}
