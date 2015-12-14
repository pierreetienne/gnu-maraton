import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CF489C {
	static int m, s;
	static String[][] memo1 ,memo2;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			m = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			int[] valsMax = getMax();
			if(valsMax!= null){
				String maxNumber = getNumbersMax(valsMax);
				if(maxNumber!= null){
					System.out.println(getMin(valsMax) + " "+maxNumber );
				}else{
					System.out.println("-1 -1");
				}
			}else
				System.out.println("-1 -1");
	
		}
	}

	static String getMin(int[] valMax){
		int[] cpy = valMax.clone();
		BigInteger min = new BigInteger(getMinString(valMax.clone()));
		BigInteger ant = null;
		while(valMax[0]>0){
			for(int i=9;i>1;--i){
				if(valMax[i]>0){
					valMax[i]--;
					valMax[0]--;
					valMax[1]++;
					valMax[i-1]++;
					break;
				}
			}
			BigInteger b = new BigInteger(getMinString(valMax.clone()));
			
			if(b.compareTo(min)<0){
				min = b;
			}else if(b.compareTo(min)==0)
				break;
			if(ant== null)
				ant = b;
			else if(ant.compareTo(b)==0)
				break;
			else
				ant = b;
		}
		valMax  = cpy;
		while(valMax[0]>0){
			for(int i=2;i<valMax.length;++i){
				if(valMax[i]>0){
					valMax[i]--;
					valMax[0]--;
					valMax[1]++;
					valMax[i-1]++;
					break;
				}
			}
			BigInteger b = new BigInteger(getMinString(valMax.clone()));
			
			if(b.compareTo(min)<0){
				min = b;
			}else if(b.compareTo(min)==0)
				break;
			if(ant== null)
				ant = b;
			else if(ant.compareTo(b)==0)
				break;
			else
				ant = b;
		}
		
		return min != null ? min.toString():null;
	}

	static String getMinString(int[] vals){
		String res = "";
		for(int i=1;i<vals.length;++i){
			if(vals[i]>0){
				vals[i]--;
				res = res + (i+"");
				break;
			}
		}
		for(int i=0;i<vals.length;++i){
			for(int j=0;j<vals[i];++j){
				res = res + (""+i);
			}
		}
		return res;
	}
	
	static int[] getMax(){
		int[] vals = new int[10];
		vals[9]=(int) Math.floor(s/9.);
		int totalNumbers = totalNumbers(vals);
		int sum = vals[9]*9;
		if(totalNumbers < m){
			vals[s-sum]++;
			totalNumbers=totalNumbers(vals);
			sum += s-sum;
		}
		if(totalNumbers < m){
			vals[0]+=(m-totalNumbers);
			totalNumbers=totalNumbers(vals);
		}
		if(totalNumbers == m && sum == s)
			return vals;
		return null;
	}
	
	static int totalNumbers(int[] vals){
		int cont = 0;
		for(int i=0;i<vals.length;++i){
			cont+=vals[i];
		}
		return cont;
	}
	
	static String getNumbersMax(int[] vals){
		String num = "";
		for(int i=vals.length-1;i>=0;--i){
			for(int j=0;j<vals[i];++j){
				num = num+(i+"");
			}
		}
		return num.length()>1 && num.charAt(0)=='0'? null : num;
	}
}
