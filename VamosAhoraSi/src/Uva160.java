import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//AC
public class Uva160 {
	static BigInteger[] factorial;
	static int mayor = 0;
	public static void main(String[] args)throws Exception 
	{
		boolean[] primos = new boolean[100];
		primos[0]=primos[1]=true;
		for(int i=2;i*i<primos.length;++i)
			for(int j=i*i;j<primos.length;j+=i)
				primos[j]=true;
	
		factorial = new BigInteger[101];
		factorial[0]=factorial[1]=BigInteger.ONE;
		StringBuilder[] sb = new StringBuilder[101];
		for(int i=2;i<=100;++i){
			factorial[i]=factorial[i-1].multiply(new BigInteger(i+""));
			int[] m = factorizacion(factorial[i]);
			sb[i] = new StringBuilder();
			if(i<10)sb[i].append("  "+i+"! =");
			else if(i<100)sb[i].append(" "+i+"! =");
			else sb[i].append(i+"! =");
			for(int j=0;j<primos.length&& j<=mayor;++j){
				if(!primos[j]){
					if(sb[i].length()==51)
						sb[i].append("\n      ");
					if(m[j] < 10 )sb[i].append("  "+m[j]);
					else if(m[j]<100)sb[i].append(" "+m[j]);
					else sb[i].append(j);
				}
			}
			mayor =0;
		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(bf.readLine().trim());
		StringBuilder res = new StringBuilder();
		while(N != 0){
			res.append(sb[N]);
			N  = Integer.parseInt(bf.readLine().trim());
				res.append("\n");
		}
		System.out.print(new String(res));
	}
	
	static int[] factorizacion(BigInteger n ){
		int[] m = new int[99];
		BigInteger c = n;
		BigInteger dos = new BigInteger("2");
		while(c.mod(dos).equals(BigInteger.ZERO)){
			m[2]++;
			c=c.divide(dos);
			mayor = 2;
		}
		BigInteger i=new BigInteger("3");
		
		while(i.pow(2).compareTo(c.add(BigInteger.ONE)) == -1 ){
			if(c.mod(i).equals(BigInteger.ZERO)){
				m[i.intValue()]++;
				c = c.divide(i);
				if(i.intValue()> mayor)
					mayor = i.intValue();
			}
			else
				i=i.add(dos);
		}
		if(c.compareTo(BigInteger.ONE)==1){m[c.intValue()]++;if(c.intValue()> mayor)mayor = c.intValue();}
		return m;
	}
	

	
}
