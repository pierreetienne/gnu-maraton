import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Accepted
public class Uva12517 {

	
	static int[] values = new int[11];
	
	public static void main(String[] args) throws Exception{
		values[0]=0;
		for(int i=1;i<values.length;++i){
			values[i]=values[i-1]+i;
		}
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea=bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0)break;
			sb.append((f(b)-f(a-1))+"\n");
		}
		System.out.print(new String(sb));
	}
	
	static long f(long i){
		if(i<=0)return 0;
		if(i<10)return values[(int) i];
		String n  = i+"";
		long dn = (n.charAt(0)-'0');
		long val = (long) (45*(n.length()-1)*Math.pow(10, n.length()-2) * (dn));
		long val2 = (long)( Math.pow(10, n.length()-1)  * ((dn*(dn-1))/2));
		long val3 = f(Integer.parseInt(n.substring(1)));
		long val4 = (dn)*(Integer.parseInt(n.substring(1))+1);
		return val+val2+val3+val4;
	}

}
