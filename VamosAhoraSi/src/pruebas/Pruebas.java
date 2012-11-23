package pruebas;

import java.util.Arrays;

public class Pruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] m = "la casa blanca".toCharArray();

		int T[] = getBorderArray(m);
		System.out.println(Arrays.toString(T));



		System.out.println(indexOf("blanca".toCharArray(), m, T));



	}

	static int[] getBorderArray(char[] W) {
		int[] T=new int[W.length+1]; T[0]=-1; T[1]=0;
		for (int i=2,j=0; i<=W.length; )
		{
			if (W[i-1]==W[j])
				T[i++]=++j; 
			else if (j>0)
				j=T[j]; 
			else 
				T[i++]=0;
		}
		return T;
	}


	static int indexOf(char[] S, char[] W, int[] T) { // Índice donde ocurre S en W. T=getBorderArray(W).
		if (S.length==0) return 0;
		for (int m=0,i=0; m+i<W.length; )
		{if (S[i]==W[m+i]) {if (++i==S.length) return m;} else {m+=i-T[i]; if (i>0) i=T[i];}}
		return -1;
	}
}
