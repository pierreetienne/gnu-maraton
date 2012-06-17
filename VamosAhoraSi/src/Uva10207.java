

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;
//Accepted
public class Uva10207 {
	public static void main(String[] args)throws Exception  {
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setMaximumFractionDigits(5);
		nf.setMinimumFractionDigits(5);
		BigInteger dos = new BigInteger("2");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		double p = Double.parseDouble(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while(N>0){
			double q=(double)1-p;
			int[][] datos = new int[N][2];
			int maximo = 0;
			for(int i=0;i<N;++i){
				st = new StringTokenizer(in.readLine());
				datos[i][0]= Integer.parseInt(st.nextToken()) ;
				datos[i][1]= Integer.parseInt(st.nextToken());
				maximo = Math.max(datos[i][0],Math.max(datos[i][1], maximo));
			}
			maximo+=3;
			double[][] f= new double[maximo][maximo];
			BigInteger[][] t = new BigInteger[maximo][maximo];
			
			for(int i=0;i<maximo;++i){
				f[i][0]=0;
				f[0][i]=1;
				t[0][i]=BigInteger.ZERO;
				t[i][0]=BigInteger.ZERO;
			}
			f[0][0]=-1;
			for(int i=1;i<maximo;++i){
				for(int j=1;j<maximo;++j){
					f[i][j]=p*f[i-1][j]+q*f[i][j-1];
					t[i][j]=t[i-1][j].add(t[i][j-1]).add(dos);
				}
			}

			for(int i=0;i<N;++i)
				sb.append(nf.format( f[datos[i][0]][datos[i][1]]) + "\n"+t[datos[i][0]][datos[i][1]]+"\n");

			st = new StringTokenizer(in.readLine());
			p = Double.parseDouble(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			if(N!=0)sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
