
import static java.lang.Integer.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ACM2451 {

	
	static class Nodo {
		char v;
		boolean utilizado = false;
		Nodo sig;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int N = parseInt(in.readLine());
//		in.readLine();
//		while(N-->0){
//			String linea = in.readLine();
//			Nodo ini = new Nodo();
//			Nodo actual = ini;
//			for(int i=0;i<linea.length();++i){
//				if(i==0){
//					ini.v=linea.charAt(i);
//					ini.sig = new Nodo();
//					actual = ini.sig;
//				}else{
//					actual.v=linea.charAt(i);
//					actual.sig= new Nodo();
//					actual = actual.sig;
//				}
//			}
//			
//			
//			actual = ini;
//			while(actual.sig!=null){
//				if(actual.v == '('){
//					actual.utilizado = true;
//					Nodo aux = actual.sig;
//					boolean e = false;
//					while(aux != null && aux.sig!=null && !e){
//						if(aux.v==')'&& !aux.utilizado){
//							aux.utilizado=true;
//						}else if(aux.v!=')')
//						
//					}
//				}
//				System.out.print(actual.v);
//				actual = actual.sig;
//			}
//			
//			
//			if(N-1>=0)in.readLine();
//		}
//		
	}

}
