import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CF508B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			
			int index = -1;
			int min = Integer.MAX_VALUE;
			for(int i=0;i<ln.length();++i){
				int val = ln.charAt(i)-'0';
				if(val%2==0){
					if(min>=val){
						index = i;
						min = val;
					}
				}
			}
			
			if(index!=-1){
				int val = ln.charAt(index)-'0';
				boolean firts = val > (ln.charAt(ln.length()-1)-'0');
				if(firts){
					
				}
				
				
			}
			
			if(index != -1){
				char[] num = ln.toCharArray();
				char n = num[index];
				num[index]=num[num.length-1];
				num[num.length-1] = n;
				BigInteger par  = new BigInteger(new String(num));
				if(par.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
					System.out.println(par);
				}else{
					System.out.println(-1);
				}
			}else{
				if((new BigInteger(ln)).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
					System.out.println(ln);
				}else{
					System.out.println(-1);
				}
			}

		}
	}
}
