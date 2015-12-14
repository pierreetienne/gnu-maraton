import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class CF369A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int dias = Integer.parseInt(st.nextToken());
			int tazones = Integer.parseInt(st.nextToken());
			int platos = Integer.parseInt(st.nextToken());
			int cont = 0;
			st = new StringTokenizer(in.readLine());
			int[] m  = new int[dias];
			int[] suma = new int[3];
			for(int i=0;i<dias;++i){
				m[i] = Integer.parseInt(st.nextToken());
				suma[m[i]]++;
			}
			
			int diffP = platos-suma[2];
			int auxTazones = tazones;
			if(diffP<0){
				
				 int diffT = tazones + diffP;
				 if(diffT<0){
					 cont+= Math.abs(diffT);
				 }		
				 auxTazones = diffT;
			}
			
			if(auxTazones>=0){
				int auxT = auxTazones - suma[1];
				if(auxT<0){
					cont+= Math.abs(auxT);
				}
			}
			System.out.println(cont);
			
			
			

//			Queue<Integer> c1 = new LinkedList<Integer>();
//			Queue<Integer> c2 = new LinkedList<Integer>();
//			Queue<Integer> c3 = new LinkedList<Integer>();
//			Queue<Integer> c4 = new LinkedList<Integer>();
//			c1.add(tazones );
//			c2.add(platos);
//			c3.add(0);
//			c4.add(0);
//			int min = Integer.MAX_VALUE;
//			while(!c1.isEmpty()){
//				System.out.println(c1.peek() + " " + c2.peek() + " " + c3.peek()+ " "+c4.peek());
//				int t = c1.poll();
//				int p = c2.poll();
//				int indexType = c3.poll();
//				int lavadas = c4.poll();
//				
//				if(t==0 && p==0){
//					lavadas += dias-indexType;
//					min = Math.min(lavadas, min);
//				}else if(m[indexType]==1){
//					if(t>0)
//						t--;
//					else
//						lavadas++;
//					if(indexType+1<dias){
//						c1.add(t);
//						c2.add(p);
//						c3.add(indexType+1);
//						c4.add(lavadas);
//					}else{
//						min = Math.min(lavadas, min);
//						break;
//					}
//				}else {
//					int auxp = p;
//					int auxt = t;
//					int auxLava = lavadas;
//					if(p>0){
//						auxp--;
//					}else if(auxt>0){
//						auxt--;
//					}else{
//						auxLava++;
//					}
//
//					if(indexType+1<dias){
//						c1.add(auxt);
//						c2.add(auxp);
//						c3.add(indexType+1);
//						c4.add(auxLava);
//					}else{
//						min = Math.min(auxLava, min);
//						break;
//					}
//
//					auxt = t;
//					auxp = p;
//					auxLava = lavadas;
//					if(t>0){
//						auxt--;
//					}else if(p>0){
//						auxp--;
//					}else{
//						auxLava++;
//					}
//					
//					if(indexType+1<dias){
//						c1.add(auxt);
//						c2.add(auxp);
//						c3.add(indexType+1);
//						c4.add(auxLava);
//					}else{
//						min = Math.min(auxLava, min);
//						break;
//					}
//				}
//			}
//			System.out.println(min);
		}

	}

}
