import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class ACM4805 {
	
	
	static int[] secciones;
	
	static int[] papaSeccionAnterior;
	
	static int[]  altura;
 
	static int[] papasDirectos;
	
	static long[] distancias;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N != 0){
			HashMap<Integer, Integer>[] lady = new HashMap[N];
			lady[0] = new HashMap<Integer, Integer>();
			StringTokenizer st = null;
			for(int i=0;i<N-1;++i){
				if(lady[i+1]==null)	lady[i+1]=new HashMap<Integer, Integer>();
				st = new StringTokenizer(bf.readLine());
				int valx = Integer.parseInt(st.nextToken());
				int valy = Integer.parseInt(st.nextToken());
				lady[i+1].put(valx, valy);
				if(lady[valx]==null)lady[valx]=new HashMap<Integer, Integer>();
				lady[valx].put(i+1, valy);
			}

			boolean[] visitado = new boolean[N];
			distancias = new long[N];
			altura = new int[N];
			int alturaArbol = 0;
			Queue<Integer> c1 = new LinkedList<Integer>();
			c1.add(0);
			while(!c1.isEmpty()){
				int nodo = c1.poll();
				long distanciaActual = distancias[nodo];
				int alturaActual = altura[nodo];
				for(int hijos:lady[nodo].keySet()){
					if(!visitado[hijos]){
						c1.add(hijos);
						distancias[hijos]= (distanciaActual+lady[nodo].get(hijos));
						altura[hijos] = alturaActual+1;
						alturaArbol = (altura[hijos]>alturaArbol)?altura[hijos]:alturaArbol;
					}
				}
				visitado[nodo]=true;
			}
			
//			System.out.println("Distancias " +Arrays.toString(distancias));
//			System.out.println("Alturas " + Arrays.toString(altura));
//			System.out.println("Altura Arbol "+ alturaArbol);
			int nivelesXsecciones = (int) Math.ceil(Math.sqrt(alturaArbol));
//			System.out.println("Secciones "+nivelesXsecciones);
			
			secciones = new int[N];
			for(int i=0;i<N;++i)
				secciones[i]=altura[i]/nivelesXsecciones;
			
			papaSeccionAnterior = new int[N];
			papaSeccionAnterior[0]=-1;
			
			papasDirectos = new int[N];
			papasDirectos[0]=-1;
			c1.clear();
			Arrays.fill(visitado, false);
			c1.add(0);
			while(!c1.isEmpty()){
				int nodo = c1.poll();
				if(altura[nodo]%nivelesXsecciones!=0)
					papaSeccionAnterior[nodo]= papaSeccionAnterior[papasDirectos[nodo]];
				else
					papaSeccionAnterior[nodo]= papasDirectos[nodo];
				for(int hijos:lady[nodo].keySet()){
					if(!visitado[hijos]){
						c1.add(hijos);
						papasDirectos[hijos]=nodo;
					}
				}
				visitado[nodo]=true;
			}
//			System.out.println("Secciones "+ Arrays.toString(secciones));
//			System.out.println("Papas Directos " + Arrays.toString(papasDirectos));
//			System.out.println("Papas seccion anterior " + Arrays.toString(papaSeccionAnterior));
			
			
			int M = Integer.parseInt(bf.readLine());
			for(int i=0;i<M;++i){
				st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken()); 
				long c = (distancias[a]+distancias[b]) -(2*lca(a, b));
				sb.append(c);
				if(i<M-1)
					sb.append(" ");
			}
			sb.append("\n");
			N = Integer.parseInt(bf.readLine());
		}
		System.out.print(new String(sb));

	}
	
	
	static long lca(int a, int b){
		if(secciones[a]>secciones[b])
			return lca(papaSeccionAnterior[a],b);
		else if(secciones[a]<secciones[b])
			return lca(a,papaSeccionAnterior[b]);
		else if(altura[a]>altura[b])
			return lca(papasDirectos[a],b);
		else if(altura[a]<altura[b])
			return lca(a,papasDirectos[b]);
		else if(a != b)
			return lca(papasDirectos[a],papasDirectos[b]);
		else
			return distancias[a];
	}

}
