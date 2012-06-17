
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pierre
 * @linkDeArchivo http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1491
 * @veredict Accepted 
 * @problemId 10550 
 * @problemName  Combination Lock
 * @judge http://uva.onlinejudge.org/
 * @category AC
 * @level easy
 * @date 12/29/2011
 **/ 

public class Uva10550 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		while(!line.equals("0 0 0 0")){
			String[] aux = line.split(" ");
			int suma=360+360+360;
			for(int i=1;i<aux.length;++i){
				int a = Integer.parseInt(aux[i-1]);
				int b = Integer.parseInt(aux[i]);
				if(i%2!=0){
					suma+=encontra(a, b);
				}else{
					suma+=ensentido(a, b);
				}
			}
			System.out.println(suma);
			line = bf.readLine();
		}

	}
	
	public static int encontra (int desde , int hasta ){
		desde = 40 - desde;
		hasta = 40 - hasta;
		if(desde > hasta)
			return  360 - ((desde-hasta)*9);
		else
			return (hasta-desde)*9; 
	}
	
	public static int ensentido (int desde , int hasta ){
		if(desde > hasta)
			return  360 - ((desde-hasta)*9);
		else
			return (hasta-desde)*9; 
	}
	

}
