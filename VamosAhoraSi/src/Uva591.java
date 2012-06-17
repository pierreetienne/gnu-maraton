
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva591 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String l=bf.readLine();
		int cont = 1;
		while(!l.equals("0")){
			int a = Integer.parseInt(l);
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int suma = 0;
			int[] v = new int[a];
			for(int i=0;i<a;++i){
				v[i]=Integer.parseInt(st.nextToken());
				suma += v[i];
			}
			
			suma /= a;
			int d = 0;
			for(int i=0;i<a;++i){
				int s = v[i]-suma;
				if(s>0)
					d+=s;
			}
			System.out.println("Set #"+(cont++));
			System.out.println("The minimum number of moves is "+d+".");
			System.out.println();
			l=bf.readLine();
		}

	}

}
