import java.math.BigInteger;
import java.util.HashMap;


public class Uva160 {

	
	static HashMap<BigInteger, int[]> valores = new HashMap<BigInteger, int[]>();
	
	static boolean[] primos;
	
	public static void main(String[] args)throws Exception {
		primos = new boolean[1000000];
		primos[0]=primos[1] =true;
		for(int i=2;i*i<primos.length;++i){
				for(int j=i*i;j<primos.length;j+=i)
					primos[j]=true;
		}
		System.out.println(fact (new BigInteger("53")));
		factorizacion(new BigInteger("5"));
	}
	
	static void factorizacion(BigInteger n ){
		while(!n.equals(BigInteger.ONE)){
			//System.out.println(n);
			for(BigInteger i = new BigInteger("2"); i.compareTo(n)==-1||i.compareTo(n)==0;i=i.add(BigInteger.ONE)){
				System.out.println(i + " mod " + (n.mod(i)));
				if(n.mod(i).equals(BigInteger.ZERO))
				{
					n = n.divide(i);
					System.out.println(n);
					break;
				}
			}
		}
	}
	
	static BigInteger fact ( BigInteger f ){
		HashMap<Integer, Integer> cant = new HashMap<Integer, Integer>();
		BigInteger ini = BigInteger.ONE;
		for(BigInteger i = BigInteger.ONE;i.compareTo(f)!=1;i = i.add(BigInteger.ONE)){
			ini = ini.multiply(i);
			if(!primos[i.intValue()]){
				if(cant.get(i.intValue()) == null)
					cant.put(i.intValue(), 1);
				else
					cant.put(i.intValue(), cant.get(i.intValue())+1);
			}
			String x = ini.toString();
			for(int p=0;p<x.length();++p){
				if(!primos[x.charAt(p)-'0']){
					if(cant.get(x.charAt(p)-'0') == null)
						cant.put(x.charAt(p)-'0', 1);
					else
						cant.put(x.charAt(p)-'0', cant.get(x.charAt(p)-'0')+1);
				}
			}
		}
		System.out.println(cant);
		return ini;
	}
	
}
