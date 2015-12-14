
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Chessboard {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		Scanner sc = new Scanner(System.in);
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = sc.nextInt();//Integer.parseInt(bf.readLine());
		while(n!=0){
			int columna = 1, fila = 1,tamaSig= 1, finaAct=1;
			for(;finaAct<=n-1;++fila){
				tamaSig= fila+(fila+1);
				finaAct += tamaSig;
			}
			
			int mitadIntervalo = finaAct-((tamaSig/2)+1)+1;
			if(n <= mitadIntervalo){
				System.out.println(fila+" "+(n-(finaAct-tamaSig+1)+1));
			}else{
				System.out.println(((finaAct-n)+1)+" "+fila);
			}
			n =sc.nextInt();// Integer.parseInt(bf.readLine());
		}

	}

}
