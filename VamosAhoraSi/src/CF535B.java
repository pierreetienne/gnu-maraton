import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF535B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			long x = Long.parseLong(ln);
			long index=0;
			if(x==4){
				index=1;
			}else if(x==7){
				index=2;
			}else{
				String s = (x+"").replaceAll("4", "0").replaceAll("7", "1");
				long n = 0;
				for(long i=0;i<s.length()-1;++i){
					n+= 1<<(i+1);
				}
				index= n+Long.parseLong(s, 2)+1;
			}
			System.out.println(index);
		}

	}

}
