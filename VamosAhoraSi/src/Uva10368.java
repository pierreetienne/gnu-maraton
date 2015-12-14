import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10368 {

	static boolean f(int N , int M, boolean turno ){
		int max = Math.max(N, M);
		int min = Math.min(N, M);
		int mult = min, i=1;
		while(mult< max) { if(f(max-mult, min, !turno)==turno)return turno; mult*=(i++); }
		return !turno;
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			if(N == 0 && M == 0) break;
			if(f(N, M, true ))sb.append("Stan wins\n");
			else sb.append("Ollie wins\n");
		}
		System.out.print(new String(sb));
	}

}
