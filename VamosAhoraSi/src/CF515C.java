import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;


public class CF515C {

	static long[] memo;
	static BigInteger fNum;
	public static void main(String[] args) throws Exception {
		memo = new long[10];
		memo[0]=1;
		memo[1]=1;
		for(int i=2;i<memo.length;++i)
			memo[i]=i*memo[i-1];

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			Integer.parseInt(ln);
			String number = in.readLine();
			fNum = f(number);
			boolean contains = false;
			for(int i=0;i<number.length()&& !contains;++i){
				if(number.charAt(i)=='0'|| number.charAt(i)=='1'){
					contains=true;
				}
			}
			BigInteger big = new BigInteger(number);
			String result = "";
			for(int i=0;i<number.length();++i){
				int val = number.charAt(i)-'0';
				if(val==4)
					result+="322";
				else if(val==6)
					result+="35";
				else if(val==9)
					result+="7332";
				else if(val == 8)
					result+="7222";
				else if(val>1)
					result+=val;
			}
			Integer[] list = new Integer[result.length()];
			for(int i=0;i<list.length;++i){
				list[i]= result.charAt(i)-'0';
			}
			Arrays.sort(list, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o2.intValue()-o1.intValue();
				}
			});
			String fin = "";
			for(int i=0;i<list.length;++i)
				fin += list[i];

			BigInteger nBig = new BigInteger(fin);
			if(!contains){
				if(nBig.compareTo(big)>0)
					System.out.println(nBig);
				else 
					System.out.println(big);
			}else
				System.out.println(nBig);
		}
	}
	static BigInteger f(String n ){
		BigInteger x = BigInteger.ONE;
		for(int i=0;i<n.length();++i){
			x = x.multiply(BigInteger.valueOf(memo[n.charAt(i)-'0']));
		}
		return x;
	}
}

