

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Professor {

	
	static double alfa ;
	
	static double beta;
	
	
	static double f(double n ){
		if(n==0)return alfa;
		if(n==1)return beta;		
		return (1	+f(n-1))/f(n-2);
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		 alfa = Long.parseLong(st.nextToken()); beta = Long.parseLong(st.nextToken());
		 BigInteger c = new BigInteger(st.nextToken());
		 StringBuilder sb = new StringBuilder();
		while(!(alfa== 0 && beta == 0 && c.equals(BigInteger.ZERO))){
			double i = 2f;
			double epsilon = 1e-10;
			boolean tAlfa = false, tBeta = false;
			while(!tAlfa && !tBeta){
				if(epsilon > (alfa-f(i+1)) ){
					tAlfa=tBeta=true;
				}
				if(alfa== f(i+1) && beta == f(i+2)){
					tAlfa=tBeta=true;
				}
				i++;
			}
			int p = c.mod( new BigInteger(((int)i)+"")  ).intValue();
			sb.append(((int)f(p))+"\n");
			st = new StringTokenizer(bf.readLine());
			alfa = Double.parseDouble(st.nextToken()); beta = Double.parseDouble(st.nextToken());
			c = new BigInteger(st.nextToken());
		}
		System.out.print(new String(sb));
	}		

}
