import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class SPOJMegaInversion {

	static int[] vec;

	static int[] segIni;

	static int[] segFin;

	static int[] segCant;

	static int[] segCant2;

	static int[] segMay;

	static int[] segMen;

	static int N;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			N = Integer.parseInt(linea);
			vec = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int i=0;i<N;++i){
				vec[i]=Integer.parseInt(st.nextToken());
			}

			if(N >2 )
			{
				segIni = new int[4*N];
				segFin = new int[4*N];
				segCant = new int[4*N];
				segCant2 = new int[4*N];
				segMay = new int[N];
				segMen = new int[N];
				segIni[0]=1;
				segFin[0]=N;

				Queue<Integer> c = new LinkedList<Integer>();
				c.add(0);
				while(!c.isEmpty())
				{
					int pos = c.poll();
					int mitad = (segIni[pos] + segFin[pos])/2;
					int posHijo = (2*pos)+1;
					segIni[posHijo]= segIni[pos] ;
					segFin[posHijo] = mitad;
					if(segIni[posHijo] != segFin[posHijo])c.add(posHijo);
					posHijo = (2*pos)+2;
					segIni[posHijo]= mitad+1;
					segFin[posHijo] = segFin[pos];
					if(segIni[posHijo] != segFin[posHijo])c.add(posHijo);
				}


				for(int i=0, j=N-1;i<N;++i,--j)
				{
					Queue<Integer> c1 = new LinkedList<Integer>();
					c1.add(0);
					while(!c1.isEmpty()){
						int pos = c1.poll();
						if(segIni[pos]== segFin[pos] && segIni[pos] == vec[i]){
							segCant[pos]++;
							segMay[i] = contarEnRango( segIni[pos]+1, N , 0);
							actualizarSegCantidad(pos);
							break;
						}else if(segIni[pos]!=segFin[pos]){
							int hijoIzqui = (2*pos)+1;
							if(segIni[hijoIzqui]<= vec[i] && segFin[hijoIzqui]>= vec[i])
								c1.add(hijoIzqui);
							int hijoDere = (2*pos)+2;
							if(segIni[hijoDere]<= vec[i] && segFin[hijoDere]>= vec[i])
								c1.add(hijoDere);
						}
					}
					Queue<Integer> c2 = new LinkedList<Integer>();
					c2.add(0);
					while(!c2.isEmpty()){
						int pos = c2.poll();
						if(segIni[pos]== segFin[pos] && segIni[pos] == vec[j]){
							segCant2[pos]++;
							segMen[j] = contarEnRango2(1,segIni[pos]-1, 0);
							actualizarSegCantidad2(pos);
							break;
						}else if(segIni[pos]!=segFin[pos]){
							int hijoIzqui = (2*pos)+1;
							if(segIni[hijoIzqui]<= vec[j] && segFin[hijoIzqui]>= vec[j])
								c2.add(hijoIzqui);
							int hijoDere = (2*pos)+2;
							if(segIni[hijoDere]<= vec[j] && segFin[hijoDere]>= vec[j])
								c2.add(hijoDere);
						}
					}
				}
				BigInteger res = BigInteger.ZERO;
				for(int i=0;i<N;++i)
					res = res.add(BigInteger.valueOf(segMay[i]).multiply(BigInteger.valueOf(segMen[i])));
				sb.append(res.toString()+"\n");
			}
			else
			{
				sb.append("0\n");
			}
		}
		System.out.print(new String(sb));
	}

	static int contarEnRango(int desde , int hasta, int pos){
		if(desde == segIni[pos]  && hasta == segFin[pos]){
			return segCant[pos];
		}
		else if(desde <= hasta)
		{
			int cont = 0;
			int index = (2*pos)+1;
			int a = (segIni[index]> desde)?segIni[index]:desde;
			int b = (segFin[index]< hasta)?segFin[index]:hasta;
			if(a<=b)
				cont += contarEnRango(a, b, index);
			index = (2*pos)+2;
			a = (segIni[index]> desde)?segIni[index]:desde;
			b = (segFin[index]< hasta)?segFin[index]:hasta;
			if(a<=b)
				cont += contarEnRango(a, b, index);
			return cont;
		}
		return 0;
	}

	static int contarEnRango2(int desde , int hasta, int pos){
		if(desde == segIni[pos]  && hasta == segFin[pos]){
			return segCant2[pos];
		}
		else if(desde <= hasta)
		{
			int cont = 0;
			int index = (2*pos)+1;
			int a = (segIni[index]> desde)?segIni[index]:desde;
			int b = (segFin[index]< hasta)?segFin[index]:hasta;
			if(a<=b)
				cont += contarEnRango2(a, b, index);
			index = (2*pos)+2;
			a = (segIni[index]> desde)?segIni[index]:desde;
			b = (segFin[index]< hasta)?segFin[index]:hasta;
			if(a<=b)
				cont += contarEnRango2(a, b, index);
			return cont;
		}
		return 0;
	}

	static void actualizarSegCantidad(int hijo){
		hijo = darPadre(hijo);
		while(hijo > 0){
			segCant[hijo]= segCant[(hijo*2)+1]+segCant[(hijo*2)+2];
			hijo = darPadre(hijo);
		}
		segCant[0]= segCant[1]+segCant[2];
	}


	static void actualizarSegCantidad2(int hijo){
		hijo = darPadre(hijo);
		while(hijo > 0){
			segCant2[hijo]= segCant2[(hijo*2)+1]+segCant2[(hijo*2)+2];
			hijo = darPadre(hijo);
		}
		segCant2[0]= segCant2[1]+segCant2[2];
	}
	static int darPadre(int hijo){
		return (hijo%2==0&& hijo>0)?(hijo-2)/2:(hijo-1)/2;
	}

}
