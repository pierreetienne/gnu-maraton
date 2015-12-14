import java.io.InputStreamReader;

import java.io.BufferedReader;


public class Uva264 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] m = new int[10000001];
		int[] m1 = new int[10000001];
		int cont = 2;
		int pos = 2;
		m[1]=1;
		m1[1]=1;
		while(cont< m.length && pos < m.length){
			for(int i=0, j=(cont%2==0)?1:cont;i<cont && pos < m.length;++i){
				m[pos]=j;
				m1[pos]=(cont+1)-j;
				if(cont%2==0)
				j++;
				else j--;
				pos++;
			}
			cont++;
		}
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			int val = Integer.parseInt(linea.trim());
			sb.append("TERM "+val+ " IS "+m[val]+"/"+m1[val]+"\n");
		}
		System.out.print(new String(sb));
	}

}
