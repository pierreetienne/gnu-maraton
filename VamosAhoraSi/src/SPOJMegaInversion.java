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
			System.out.println( Arrays.toString(segCant));
			System.out.println(Arrays.toString(segIni));
			System.out.println(Arrays.toString(segFin));
		}
	}
	
	static void actualizarSeg ( int n , int pos){
		if(segIni[pos]== segFin[pos] && segIni[pos] == n){
			segCant[pos]++;
			segMay[posiciones[]]
		}
		else if(segIni[pos]!=segFin[pos]){
			actualizarSeg(n, hijoIzq(pos));
			actualizarSeg(n, hijoDer(pos));
			segCant[pos]= segCant[hijoIzq(pos)]+segCant[hijoDer(pos)];
		}
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
