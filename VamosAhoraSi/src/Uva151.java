

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Accepted
public class Uva151 {

	static boolean marcado[];
	public static void main(String[] args) throws Exception {
		
		int[] s = new int[]{1,18,10,11,7,17,11,15,29,5,21,13,26,14,11,23,22,9,73,17,42,7,98,15,61,22,84,24,30,9,38,15,54,27,9,61,38,22,19,178,38,53,79,68,166,20,9,22,7,21,72,133,41,10,82,92,64,129,86,73,67,19,66,115,52,24,22,176,10,57,137,239,41,70,60,116,81,79,55,102,49,5,22,54,52,113,15,66};
		
//		
//		for(int p = 13;p<=100;++p)
//		{
//			int []m = new int[p];
//			for(int i=0;i<m.length;++i)
//				m[i]=i+1;
//			
//
//			boolean hay = false;
//			int x = 1;
//			int respuesta = -1;
//			while(!hay)
//			{
//				marcado = new boolean[p];
//				int pos = 0;
//				while(termine())
//				{
//					marcado[pos]=true;
//					int cont = 0;
//					while(cont < x)
//					{
//						boolean encontre = false;
//						while(!encontre)
//						{
//							pos = (pos+1)%m.length;
//							if(!marcado[pos])
//							{
//								cont++;
//								encontre=true;
//							}
//						}
//					}
////					System.out.println("++" +m[pos]+" ");
//					marcado[pos]=true;
//					if(!termine() && m[pos]==13){
//						hay = true;
//						respuesta = x ;
//					}
//				}
//				x++;
//			}
//			System.out.print( respuesta+",");
//		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N!=0){
			sb.append(s[N-13]+"\n");
			N = Integer.parseInt(bf.readLine());
		}
		System.out.print(new String(sb));
		
	}
	static boolean termine(){
		for(int i=0;i<marcado.length;++i)
			if(!marcado[i])
				return true;

		return false;
	}
}
