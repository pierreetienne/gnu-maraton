import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
	
	static int N;
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			N = Integer.parseInt(linea);
			vec = new int[N+1];
			segIni = new int[4*N];
			segFin = new int[4*N];
			segCant = new int[4*N];
			segMay = new int[N+1];
			segMen = new int[N+1];
			posiciones = new int[N+1];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<N;++i){
				vec[i]=Integer.parseInt(st.nextToken());
				posiciones[vec[i]]=i;
			}
			segIni[0]=1;
			segFin[0]=N;
			llenarSegment(0);
			for(int i=0;i<N;++i)
				actualizarSegMay(vec[i],0);
			
			Arrays.fill(segCant, 0);
			for(int i=N-1;i>=0;--i)
				actualizarSegMen(vec[i],0);
			
			BigInteger res = BigInteger.ZERO;
			
			for(int i=0;i<N;++i)
				res = res.add(new BigInteger((segMay[i]*segMen[i])+""));
			
			sb.append(res.toString()+"\n");
		}
		System.out.print(new String(sb));
	}
	
	static void actualizarSegMay( int n , int pos){
		if(segIni[pos]== segFin[pos] && segIni[pos] == n){
			segCant[pos]++;
			segMen[posiciones[segIni[pos]]] = contarEnRango(segIni[pos]+1, N, 0);
		}
		else if(segIni[pos]!=segFin[pos]){
			actualizarSegMay(n, (2*pos)+2);
			actualizarSegMay(n, (2*pos)+1);
			segCant[pos]= segCant[(2*pos)+2]+segCant[(2*pos)+1];
		}
	}
	
	
	static void actualizarSegMen(int n , int pos){
		if(segIni[pos]== segFin[pos] && segIni[pos] == n){
			segCant[pos]++;
			segMay[posiciones[segIni[pos]]] = contarEnRango(1,segIni[pos], 0);
		}
		else if(segIni[pos]!=segFin[pos]){
			actualizarSegMen(n, (2*pos)+2);
			actualizarSegMen(n, (2*pos)+1);
			segCant[pos]= segCant[(2*pos)+2]+segCant[(2*pos)+1];
		}
	}
	
	static int contarEnRango(int desde , int hasta, int pos){
		if(desde == segIni[pos]  && hasta == segFin[pos])
			return segCant[pos];
		else if(desde < hasta)
		{
			int cont = 0;
			int index = (2*pos)+1;
			int a = (segIni[index]> desde)?segIni[index]:desde;
			int b = (segFin[index]< hasta)?segFin[index]:hasta;
			if(a<=b)
				cont = contarEnRango(a, b, index);
			index = (2*pos)+2;
			a = (segIni[index]> desde)?segIni[index]:desde;
			b = (segFin[index]< hasta)?segFin[index]:hasta;
			if(a<=b)
				cont += contarEnRango(a, b, index);
			return cont;
		}
		return 0;
	}
	
	static void llenarSegment(int papa){
		int mitad = (segIni[papa] + segFin[papa])/2;
		int pos = (2*papa)+1;
		segIni[pos]= segIni[papa] ;
		segFin[pos] = mitad;
		if(segIni[pos]!=segFin[pos])llenarSegment(pos);
		pos = (2*papa)+2;
		segIni[pos]=mitad+1;
		segFin[pos] =segFin[papa] ;
		if(segIni[pos]!=segFin[pos])llenarSegment(pos);
	}
	
}



