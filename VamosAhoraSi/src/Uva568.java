import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//Accepted
public class Uva568 {

	public static void main(String[] args) throws Exception{
		int[] res = new int[10001];
		res[0]=res[1]=1;
		BigInteger val[] = new BigInteger[10001];
		val[0]=val[1]=BigInteger.valueOf(1);
		for(int i=2;i<res.length;++i)
			val[i] = val[i-1].multiply(BigInteger.valueOf(i));
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			if(res[N]==0)
			{
				String num = val[N].toString();
				for(int i=num.length()-1;i>=0&&res[N]==0;--i)
					if(num.charAt(i)!='0')res[N]=num.charAt(i)-'0';
			}
			for(int i=linea.length();i<=4;++i)sb.append(" ");
			sb.append(linea);
			sb.append(" -> ");
			sb.append(res[N]);
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
