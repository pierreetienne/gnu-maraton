

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ACM5784 {

	
	static ArrayList<Integer> m;
	
	static HashMap<Integer,Integer> cont;
	
	static int Q;
	
	static int csont = 0 ;
	
	static void f(int actual , int suma, String x  ){
		if(actual>=0){
			
			f(actual-1, suma, x+"");
			f(actual-1, suma + m.get(actual), x+","+ m.get(actual));
		//	System.out.println((csont++)+"actual " + m.get(actual) + " - - "+x);
		}
	}
	
	static BigInteger fact(int h ){
		BigInteger p =BigInteger.ONE ;
		for(int i=1;i<=h;++i){
			p= p.multiply(new BigInteger(""+i));
		}
		return p;
	}

	
	
	static BigInteger f(int pos, int qCumplida){
		if(pos < vect.length){			
			if(!memo[pos][qCumplida].equals(new BigInteger("-1")))
				return memo[pos][qCumplida];
			if(qCumplida == q){
				return new BigInteger("1");
			}else{
				return memo[pos][qCumplida]= f(pos+1, qCumplida+1).add(f(pos+1, qCumplida));
			}
		}
		return BigInteger.ZERO;
	}
	
	static int q;
	
	static int[] vect ;
	
	static BigInteger[][] memo; 
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  
	{
		memo = new BigInteger[61][61];
		for(BigInteger[] c : memo)Arrays.fill(c, new BigInteger("-1"));
		
		q=31;
		vect = new int[60];
		for(int i=0;i<vect.length;++i){
			vect[i]=1;
		}
		
		System.out.println(f(0,0));
		
		//System.out.println(f(1, BigInteger.ZERO));
		
//		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		int N = Integer.parseInt(st.nextToken());Q = Integer.parseInt(st.nextToken());
//		while(N!=0 && Q != 0){
//			cont = new HashMap<Integer, Integer>();
//			m = new ArrayList<Integer>();
//			st = new StringTokenizer(bf.readLine());
//			for(int i=0;i<N;++i){
//				int num = Integer.parseInt(st.nextToken().trim());
//				cont.put(num,0);
//				int can = Integer.parseInt(st.nextToken().trim());
//				while(can-->0)m.add(num);
//			}
//			Collections.sort(m);
//			System.out.println(m);
//			f(m.size()-1, 0, "");
//			System.out.println(csont);
//			st = new StringTokenizer(bf.readLine());
//			N = Integer.parseInt(st.nextToken());Q = Integer.parseInt(st.nextToken());
//		}
		
	}

}
