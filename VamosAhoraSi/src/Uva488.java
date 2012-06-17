

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Accepted
public class Uva488 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String linea = bf.readLine();
			int C = Integer.parseInt(linea);
		while(C-->0){
			bf.readLine();
			int A = Integer.parseInt(bf.readLine()), F = Integer.parseInt(bf.readLine());
			String wave = "";
			for(int i=0;i<A ; ++i)
				wave+=c((i+1))+"\n";
			
			for(int i=A-2;i>=0 ; --i)
				wave+=c((i+1))+"\n";
			
			for(int i=0;i<F;++i)
				sb.append(wave+"\n");
		}
		System.out.print(sb.substring(0,sb.length()-1));
	}
	
	static String c(int i ){
		String s = "";
		for(int j=0;j<i;j++){
			s+=i+"";
		}
		return s;
	}

}
