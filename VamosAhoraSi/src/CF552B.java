import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF552B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			long cont = 0;
			long value= 0;
			if(ln.length()==1){
				cont = Integer.parseInt(ln);
			}
			else{
				if(ln.length()>1){
					String last= "";
					for(int i=0;i<ln.length()-1;++i){
						last+="9";
						value+=ln.length()-(1+i);
					}
					value += f(last)+getSum(ln)+ln.length();

				}
				value--;
				cont=value;
			}
			System.out.println(cont );
		}

	}


	public static long f(String ln){
		if(ln.length()<2) 
			return 9;
		long value=getSum(ln);
		return value+f(ln.substring(0,ln.length()-1));
	}

	public static long getSum (String ln){
		long value=0;
		for(int i=0;i<ln.length();++i){
			long p = (long) Math.pow(10, ln.length()-(i+1));
			p = p*ln.length();
			if(i==0)
				value+=((ln.charAt(i)-'0')-1)*p; 
			else
				value+=((ln.charAt(i)-'0'))*p;
		}
		return value;
	}


}
