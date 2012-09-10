import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class SPOJMegaInversion {

	static int[] vec;
	
	static int[] segIni;
	
	static int[] segFin;
	
	static int[] segCant;
	
	static int[] segMay;
	
	static int[] segMen;
	
	static int[] posiciones;
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			vec = new int[N];
			segIni = new int[4*N];
			segFin = new int[4*N];
			segCant = new int[4*N];
			segMay = new int[N];
			segMen = new int[N];
			posiciones = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<N;++i){
				vec[i]=Integer.parseInt(st.nextToken());
				posiciones[vec[i]]=i;
			}
			segIni[0]=1;
			segFin[0]=N;
			llenarSegment(0);
			for(int i=0;i<N;++i){
				actualizarSeg(vec[i],0);
			}
			System.out.println( Arrays.toString(segMay));
			System.out.println(Arrays.toString(segIni));
			System.out.println(Arrays.toString(segFin));
			System.out.println(contarEnRango(0, segMay.length-1, 0));
		}
	}
	
	static void actualizarSeg ( int n , int pos){
		if(segIni[pos]== segFin[pos] && segIni[pos] == n){
			segCant[pos]++;
			
			segMay[posiciones[segIni[pos]]] = contarEnRango(1, segIni[pos]-1, 0);
			System.out.println(segIni[pos] + " -- " + segMay[posiciones[segIni[pos]]] );
			System.out.println("Seg COnt " + Arrays.toString(segCant));
		}
		else if(segIni[pos]!=segFin[pos]){
			actualizarSeg(n, hijoIzq(pos));
			actualizarSeg(n, hijoDer(pos));
			segCant[pos]= segCant[hijoIzq(pos)]+segCant[hijoDer(pos)];
		}
	}
	
	static int contarEnRango(int desde , int hasta, int pos){
		if(desde == segIni[pos]  && hasta == segFin[pos])
			return segCant[pos];
		else if(desde < hasta)
		{
			int cont = 0;
			if(segIni[pos]<=desde && desde<= segFin[pos] && hasta<=segFin[pos])//desde y hasta estan contenidos 
			{
				int ini = segIni[hijoDer(pos)];
				int fin = segFin[hijoDer(pos)];
				if(desde <= fin)
					cont+= contarEnRango(Math.max(desde, ini), Math.min(fin, hasta), hijoDer(pos));
				
				ini = segIni[hijoIzq(pos)];
				fin = segFin[hijoIzq(pos)];
				if(ini <= hasta)
					cont+= contarEnRango(Math.max(desde, ini), Math.min(fin, hasta), hijoDer(pos));
				
			}
			return cont;
		}
		return 0;
	}
	
	static void llenarSegment(int papa){
		int mitad = (segIni[papa] + segFin[papa])/2;
		int pos = hijoDer(papa);
		segIni[pos]= segIni[papa] ;
		segFin[pos] = mitad;
		if(segIni[pos]!=segFin[pos])llenarSegment(pos);
		pos = hijoIzq(papa);
		segIni[pos]=mitad+1;
		segFin[pos] =segFin[papa] ;
		if(segIni[pos]!=segFin[pos])llenarSegment(pos);
	}
	
	static int hijoIzq(int i){ return (2*i)+2; }
	static int hijoDer(int i){ return (2*i)+1; }
}
