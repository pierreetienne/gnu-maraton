import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Uva144 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while(!(a==0 && b ==0) ){
			ArrayList<Integer> respuesta = new ArrayList<Integer>();
			Queue<Integer> cola = new LinkedList<Integer>();
			for(int i=0;i<a;++i)
				cola.add(i+1);
			
			int[] val = new int[a];
			int cont= 0;
			int sobra = 0;
			while(!cola.isEmpty()){		
				int actual = cola.poll();
				if(sobra > 0 ){
					if(val[actual-1]+sobra< 40){
						sobra = 0;
						val[actual-1]+= sobra;
						cola.add(actual);
					}else{
						sobra = (val[actual-1]+sobra)-40;
						val[actual-1]=40;
						respuesta.add(actual);
					}
				}
				else{
					if(val[actual-1]+(cont%b)+1 < 40){
						val[actual-1]+=(cont%b)+1;
						cont=(cont%b)+1;
						cola.add(actual);
					}
					else
					{
						sobra = (val[actual-1]+(cont%b)+1)-40;
						cont = (cont%b)+1;
						respuesta.add(actual);
					}
				}
			}
			for(int i=0;i<respuesta.size();++i){
				int cantidadEspacios = 3-(respuesta.get(i)+"").length();
				switch (cantidadEspacios) {
				case 1:sb.append(" ");
					break;
				case 2:sb.append("  ");
					break;
				default:
					break;
				}
				sb.append(respuesta.get(i));
			}
			sb.append("\n");
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken()); b = Integer.parseInt(st.nextToken());
		}
		System.out.print(new String(sb));
	}
}
