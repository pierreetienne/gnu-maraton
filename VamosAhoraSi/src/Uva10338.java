import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

//Accepted
public class Uva10338 {

	static char[] letras;
	
	static HashMap<Character, Integer> contLetras;
	
	static public long f(int i, int c, int l, int lr){
		
		if(i==letras.length)return 1;
		if(c==1)return f(i+1,i==letras.length-1?0:contLetras.get(letras[i+1]), l, lr+1)+lr+1;
		long suma = 0;
		for(int j=0;j<=l;++j){
			suma+= f(i,c-1,l-j, lr+1);
		}
		return suma;
	}
	
	public static void main(String[] args)throws Exception {
		
		BigInteger[]  fact = new BigInteger[21];
		fact[0]=fact[1] = BigInteger.valueOf(1);
		for(int i=2;i<fact.length;++i)
			fact[i]=fact[i-1].multiply(BigInteger.valueOf(i));
		
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int casos = 1;
		while(N -->0){
			String linea = bf.readLine();
			contLetras = new HashMap<Character, Integer>();
			for(int i=0;i<linea.length();++i){
				if(contLetras.get(linea.charAt(i))==null)
					contLetras.put(linea.charAt(i), 1);
				else
					contLetras.put(linea.charAt(i), contLetras.get(linea.charAt(i))+1);
			}
			letras = new char[contLetras.size()];int pos = 0;
			for(Character x: contLetras.keySet())letras[pos++]=x;
			BigInteger r = fact[linea.trim().length()];
			BigInteger val = BigInteger.valueOf(1);
			for(int i=0;i<letras.length;++i)
				val = val.multiply(fact[contLetras.get(letras[i])]);
			sb.append("Data set "+(casos++)+": ");
			sb.append(r.divide(val));
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
