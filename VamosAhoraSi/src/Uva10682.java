import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//accept
public class Uva10682 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); 
		while(in.hasNext()){
			int N = in.nextInt();
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			HashMap<Integer, String> mapS = new HashMap<Integer, String>();
			int[][] mAdy = new int[501][501];
			int pos = 0;
			for(int i=0;i<N;++i){
				String nombreCiudad1 = in.next();
				String nombreCiudad2 = in.next();
				int val = in.nextInt();
				if(map.get(nombreCiudad1)==null){map.put(nombreCiudad1, pos++);mapS.put(map.get(nombreCiudad1), nombreCiudad1);}
				if(map.get(nombreCiudad2)==null){map.put(nombreCiudad2, pos++);mapS.put(map.get(nombreCiudad2), nombreCiudad2);}
				if(map.get(nombreCiudad1) >= mAdy.length ||map.get(nombreCiudad2) >= mAdy.length )return ;
				mAdy[map.get(nombreCiudad1)][map.get(nombreCiudad2)]=val;
				mAdy[map.get(nombreCiudad2)][map.get(nombreCiudad1)]=val;
			}

			String ciuOrigen = in.next();
			String ciuDestino = in.next();

			Queue<Integer> c1 = new LinkedList<Integer>();
			Queue<Integer> c2 = new LinkedList<Integer>();
			Queue<String> c3 = new LinkedList<String>();

			if(map.get(ciuOrigen)!=null &&map.get(ciuDestino)!=null )
			{
				c1.add(map.get(ciuOrigen));
				c2.add(0);
				c3.add(ciuOrigen);
			}

			String rutaF = null;

			while(!c2.isEmpty()){
				int vel = c2.poll();
				int index = c1.poll();
				String ruta = c3.poll();
				if(index == map.get(ciuDestino)){
					rutaF = ruta;
					break;
				}
				for(int i=0;i<mAdy.length;++i){
					if(mAdy[index][i]>0 && vel <= mAdy[index][i]){
						c1.add(i);
						c2.add(mAdy[index][i]);
						c3.add(ruta +" "+mapS.get(i));
						mAdy[index][i]=-1;
						mAdy[i][index]=-1;
					}
				}
			}
			if(rutaF!=null)
				sb.append(rutaF+"\n\n");
			else
				sb.append("No valid route.\n\n");
		}
		System.out.print(new String(sb.substring(0,sb.length()-1)));
	}
}

