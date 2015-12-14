
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Pierre Etienne Pradere Palacios
 * @linkDeArchivo http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2595
 * @veredict Accepted 
 * @problemId 11559
 * @problemName  Event Planning
 * @judge http://uva.onlinejudge.org/
 * @category AC
 * @level easy
 * @date 30/12/2011
 **/

public class Uva11559 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		while((linea = bf.readLine())!= null){
			String aux[] = linea.split(" ");
			int N = Integer.parseInt(aux[0]), B = Integer.parseInt(aux[1]), H = Integer.parseInt(aux[2]), W = Integer.parseInt(aux[3]);
			int min = Integer.MAX_VALUE;
			for(int i=0;i<H;++i){
				int p =Integer.parseInt(bf.readLine());
				if(W>0){
					aux = bf.readLine().split(" ");
					for(int j=0;j<W;++j){
						int c =Integer.parseInt(aux[j]);
						if(c >= N && p * N <= B && p * N <= min){
							min = p * N;
						}
					}
				}
			}

			if(min== Integer.MAX_VALUE)
				System.out.println("stay home");
			else 
				System.out.println(min);

		}

	}

}
