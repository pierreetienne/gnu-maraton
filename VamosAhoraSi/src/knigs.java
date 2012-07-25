import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class knigs {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			int k = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			if(k==0 && n == 0)break;
			st = new StringTokenizer(bf.readLine());
			int N = n + k - 2;
			int[] alce = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			Comparator<Integer> c = new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			};
			PriorityQueue<Integer>[] colas = new PriorityQueue[n];
			for(int i=0;i<colas.length;++i)
				colas[i]=new PriorityQueue<Integer>(1,c);

			colas[alce[0]-2011].add(alce[1]);

			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				colas[a-2011].add(p);
			}


			boolean encontre = false;
			int anio  = 0 ;
			int val = colas[0].poll();
			if(val == alce[1]){
				encontre = true;
				anio = 2011;
			}

			while(!encontre){
				int cont=0 , posicionGanador = -1, maxAnio=0;
				for(int i=0;i<colas.length&& cont<k;++i){
					cont += colas[i].size();
					if(cont>0  && posicionGanador == -1)
						posicionGanador = i;
					else if(posicionGanador != -1 && !colas[posicionGanador].isEmpty() &&!colas[i].isEmpty()&&colas[i].peek() > colas[posicionGanador].peek())
						posicionGanador = i;
					if(i+2011 > maxAnio && colas[i].size()>0 )
						maxAnio = i+2011;
				}
				//System.out.println("posicion Ganador " + posicionGanador +  " cont " + cont);
				if(posicionGanador != -1 && cont==k)
				{
					val = colas[posicionGanador].poll();
					if(val == alce[1]){
						encontre = true;
						anio = maxAnio;
					}
				}
				else
					break;
			}

			if(encontre)
				sb.append(anio+"\n");
			else 
				sb.append("unknown\n");
		}
		System.out.print(new String(sb));
	}



}
