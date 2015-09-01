import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class CF515C {

	static long[] memo;
	static int[] candidates = new int[]{2,3,4,5,6,7,8,9};
	static BigInteger fNum, max = BigInteger.ZERO;
	static long[] primos ;
	public static void main(String[] args) throws Exception {
		memo = new long[10];
		memo[0]=1;
		memo[1]=1;
		for(int i=2;i<memo.length;++i)
			memo[i]=i*memo[i-1];
//		System.out.println("memo " + Arrays.toString(memo));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			String number = in.readLine();
			fNum = f(number);
//			primos = getPrimos((int)memo[9]+1);
//			
//			for(int i=2;i<memo.length;++i){
//				long[][] fact = factoresPrimos(memo[i], primos);
//				for(long[] x : fact)
//					System.out.println(memo[i] + " = " + Arrays.toString(x));
//				
//			}
			
			BigInteger big = new BigInteger(number);
			
			String result = "";
			for(int i=0;i<number.length();++i){
				int val = number.charAt(i)-'0';
				if(val==4)
					result+="322";
				else if(val>1)
					result+=val;
			}
			
//			System.out.println("fNum " +fNum);
//			Queue<String> c = new LinkedList<String>();
//			Queue<BigInteger> c1 = new LinkedList<BigInteger>();
//			for(int i=0;i<candidates.length;++i){
//				c.add(""+candidates[i]);
//				c1.add(new BigInteger(""+candidates[i]));
//			}
//			String res = number;
//			boolean encontre = false;
//			while(!encontre && !c.isEmpty()){
//				String actual = c.poll();
//				BigInteger valuF = c1.poll();
//				BigInteger bigActual = new BigInteger(actual);
//
//				//				System.out.println("actual " +actual + " value " + valuF  + " fNum " + fNum + "  compare ");
//				if(valuF.equals(fNum) && bigActual.compareTo(big)>0){
//					res = actual;
//					encontre=true;
//				}else{
//					if(valuF.compareTo(fNum)<0){
//						for(int i=0;i<candidates.length;++i){
//							c.add(actual+""+candidates[i]);
//							c1.add(valuF.multiply(BigInteger.valueOf( memo[candidates[i]]  )));
//						}
//					}
//				}
//			}
//
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
			if(nBig.compareTo(big)>0)
				System.out.println(nBig);
			else 
				System.out.println(big);
			
		}
	}
	static BigInteger f(List<Integer> list){
		String x = "";
		for(int xx: list){
			x= x+xx;
		}
		return f(x);
	}
	static BigInteger f(String n ){
		BigInteger x = BigInteger.ONE;
		for(int i=0;i<n.length();++i){
			x = x.multiply(BigInteger.valueOf(memo[n.charAt(i)-'0']));
		}
		return x;
	}

	static long[] getPrimos(int cota) {
		boolean[] arr = new boolean[cota + 1];
		long[] res = new long[cota];
		arr[0] = arr[1] = true;
		int K = 0;
		for (int i = 0; i < arr.length; i++)
			if (!arr[i]) {
				res[K++] = i;
				for (int j = 2 * i; j < arr.length; j += i) arr[j] = true;
			}
		return Arrays.copyOfRange(res, 0, K);
	}



	static long[][] factoresPrimos(long x, long[] primos) {
		List<long[]> res=new ArrayList<long[]>(); double R=(long)(Math.sqrt(x)+1+1e-5); long p,c;
		for (int i=0,n=primos.length; i<n&&(p=primos[i])<=R; i++) {
			for (c=0; x%p==0; x/=p,c++); if (c>0) res.add(new long[]{p,c});
		}
		if (x>1) res.add(new long[]{x,1});
		return res.toArray(new long[0][]);
	}
	
	static List<Integer> lista(int index ){
		List<Integer> list = new ArrayList<Integer>();
		
		
		return list;
	}
	
}
/*

15
012345781234578


7777553333222222222222


 */