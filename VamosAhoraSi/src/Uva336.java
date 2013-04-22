import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Accepted
public class Uva336 {

	public static void main(String[] args)throws Exception {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = in.nextInt();
		int[][] mAdy = new int[31][31];
		int caso = 1 ;
		while(N != 0){
			for(int[] x: mAdy)	Arrays.fill(x, -1);
			int cont = 0 ;
			HashMap<Integer, Integer> toCont = new HashMap<Integer, Integer>();
			for(int i=0;i<N;++i){
				int a = in.nextInt(), b = in.nextInt();
				if(!toCont.containsKey(a)){
					toCont.put(a, cont++);
				}
				if(!toCont.containsKey(b)){
					toCont.put(b, cont++);
				}
				mAdy[toCont.get(a)][toCont.get(b)]=1;
				mAdy[toCont.get(b)][toCont.get(a)]=1;
			}
			int[] niveles = new int[cont];
			int nodo = in.nextInt(), ttl = in.nextInt();
			while(!(nodo==0 && ttl ==0 )){
				Arrays.fill(niveles, -1);
				Queue<Integer> c = new LinkedList<Integer>();
				c.add(toCont.get(nodo));
				niveles[toCont.get(nodo)]=0;
				int cantidad = 0;
				while(!c.isEmpty()){
					int h = c.poll();
					for(int i=0;i<mAdy[h].length;++i){
						if(mAdy[h][i]!=-1 && niveles[i]==-1){
							c.add(i);
							niveles[i]= niveles[h]+1;
						}
					}
				}
				for(int i=0;i<niveles.length;++i){
					if(niveles[i]>ttl||niveles[i]==-1)
						cantidad++;
				}
				sb.append("Case "+caso+++": "+cantidad+" nodes not reachable from node "+nodo+" with TTL = "+ttl+".\n");
				nodo = in.nextInt(); ttl = in.nextInt();
			}
			N = in.nextInt();
		}
		System.out.print(new String(sb));
	}

}
