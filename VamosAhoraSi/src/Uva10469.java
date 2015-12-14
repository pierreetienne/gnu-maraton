import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10469 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String binA = Integer.toString(a,2);
			String binB = Integer.toString(b,2);
			
			if(binA.length()< binB.length()){
				int diff= binB.length()-binA.length();
				for(int i=0;i<diff;++i)
					binA = "0"+binA;
			}else
			{
				int diff= binA.length()-binB.length();
				for(int i=0;i<diff;++i)
					binB = "0"+binB;
			}
			
			String res = "";
			for(int i=binB.length()-1;i>=0;--i){
				if((binA.charAt(i)=='1' && binB.charAt(i)=='0')||(binA.charAt(i)=='0' && binB.charAt(i)=='1'))
					res = '1'+res;
				else 
					res = '0'+res;
			}
			sb.append(Integer.parseInt(res, 2)+"\n");
		}
		System.out.print(new String(sb));
	}
}
