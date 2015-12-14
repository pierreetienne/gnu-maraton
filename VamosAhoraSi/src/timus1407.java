import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;


public class timus1407 {
	static BigInteger b;
	public static String mmm(String x){
		Queue<String> c = new LinkedList<String>();
		c.add(x);
		while(!c.isEmpty()){
			String s = c.poll();
			BigInteger y = new BigInteger(s);
			if(y.mod(b).equals(BigInteger.ZERO)){
				return s;
			}else
			{
				c.add("1"+s);
				c.add("2"+s);
			}
			if(s.length()>100 )return null;
		}
		return null;
	}
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n = "2";
		BigInteger num = new BigInteger("2");
		String[] solucion = new String[102];
		for(int i=2, j=1;i<solucion.length;++i, j++){
			b = num ;
			String res  = mmm(n);
			if(res != null){
				n = res;
				solucion[j]=n;
			}else{
				solucion[j]="No solution";
			}
			num = num.add(num);
		}
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea.trim());
			sb.append(solucion[N]+"\n");
		}
		System.out.print(new String(sb));
	}
}
