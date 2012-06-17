
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CostCutting {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n = null;
		while((n = bf.readLine())!= null){
			int m = Integer.parseInt(n);
			int caso = 1;
			while(m-->0){
				String[] aux = bf.readLine().split(" ");
				int[] valores = new int[]{Integer.parseInt(aux[0]),Integer.parseInt(aux[1]),Integer.parseInt(aux[2])};
				Arrays.sort(valores);
				System.out.println("Case "+(caso++)+": "+valores[1]);
			}
		}
	}

}
