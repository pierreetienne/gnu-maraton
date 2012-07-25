import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;


public class Uva10391 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> p = new ArrayList<String>();
		HashSet<String> sp = new HashSet<String>();
		for(String linea;(linea = bf.readLine())!= null;){
			String pal = linea.trim();
			String aux = "";
			for(int i=pal.length()-1;i>=0;--i){
				System.out.println("busco " + aux + " con " + sp.contains(aux));
				if(sp.contains(aux)){
					p.add(pal);
					break;
				}else{
					aux = pal.charAt(i)+aux ;
				}
			}
			sp.add(pal);
		}
		
		for(int i=0;i<p.size();++i){
			System.out.println(p.get(i));
		}
		

	}

}
