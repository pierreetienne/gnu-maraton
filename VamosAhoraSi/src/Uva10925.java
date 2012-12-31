import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//accepted
public class Uva10925 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		for(String linea ;(linea = bf.readLine() )!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) break;
			BigInteger suma = BigInteger.valueOf(0);
			for(int i=0;i<a;++i)suma = suma.add(new BigInteger(bf.readLine()));
			sb.append("Bill #"+(caso++)+" costs "+suma.toString()+": each friend should pay "+suma.divide(BigInteger.valueOf(b)).toString());
			sb.append("\n\n");
		}
		System.out.print(new String(sb));
	}

}
