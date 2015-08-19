import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF540A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] desde = new int[N];
			ln = in.readLine();
			for(int i=0;i<N;++i){
				desde[i]=Integer.parseInt(ln.charAt(i)+"");
			}
			int cont=0;
			ln = in.readLine();
			for(int i=0;i<N;++i){
				int hasta =Integer.parseInt(ln.charAt(i)+"");
				int  min = Math.min(desde[i], hasta);
				int  max = Math.max(desde[i], hasta);
				int val =  Math.min(max - min ,10-max+min);
				cont+=val;
			}
			System.out.println(cont);
		}
	}
}
