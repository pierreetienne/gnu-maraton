import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CF515C {

	static long[] memo;
	static int[] candidates = new int[]{2,3,4,5,6,7,8,9};
	static BigInteger fNum, max = BigInteger.ZERO;
	public static void main(String[] args) throws Exception {
		memo = new long[10];
		memo[0]=1;
		memo[1]=1;
		for(int i=2;i<memo.length;++i)
			memo[i]=i*memo[i-1];
		
		
		
		System.out.println(Arrays.toString(memo));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			String number = in.readLine();
			fNum = f(number);
			
			
			List<Integer> listChar = new ArrayList<Integer>();
			
			 f(listChar,2);
			 System.out.println(max);
			
		
			
			
		}

	}
//
	static BigInteger f(List<Integer> list, int index ){
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.intValue()-o1.intValue();
			}
		});
		BigInteger res = f(list);
		System.out.println("list " + list + " index " +  index  + "  fNum " + fNum + " res " + res + " equeals "  +res.equals(fNum));
		if(res.equals(fNum) ){
			if(res.compareTo(max)>0)
				max = res;
			return res;
		}
		if(list.size()==0 && index==9)
			return BigInteger.ZERO;
		if(list.size()>16)
			return BigInteger.ZERO;
		
		if(res.compareTo(fNum)>0)
			return BigInteger.ZERO;
		
		
		

		List<Integer> org =  new ArrayList<Integer>();
		List<Integer> org1 =  new ArrayList<Integer>();
		List<Integer> org2 =  new ArrayList<Integer>();
		for(int i=0;i<list.size();++i){
			org.add(list.get(i));
			org1.add(list.get(i));
			org2.add(list.get(i));
		}
		
		int nextIndex = index+1;
		if(nextIndex>=10){
			nextIndex=2;
		}
		BigInteger a = BigInteger.ZERO;
		if(org.size()>0)
			a= f(addOne(org),index);
		org1.add(index);
		BigInteger b = f(org1,nextIndex);
		org2.add(index);
		BigInteger c = f(org2, index);
		
		
		System.out.println(a + " " + b + "  " + c);
		
		BigInteger max = BigInteger.ZERO;
		if(a.compareTo(b)>0 && a.compareTo(c)>0 )
			max = a;
		else if(b.compareTo(a)>0 && b.compareTo(c)>0 )
			max = b;
		else if(c.compareTo(a)>0 && c.compareTo(b)>0 )
			max =  c;
		System.out.println("max " + max);
		return max;
	}
	
	static List<Integer> addOne(List<Integer>  list ){
		int sum =1 ;
		for(int i=list.size()-1;i>=0;--i){
			if(list.get(i)+sum>=10){
				if(i-1<0){
					list.add(2);
				}else{
					list.set(i-1, list.get(i-1)+1);
				}
				list.set(i, 2);
				sum=0;
			}else {
				list.set(i, list.get(i)+sum);
				sum=0;
			}
		}
		return list;
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
	
	
	

}
