import java.io.BufferedReader;
import java.io.InputStreamReader;

//Accepted
public class Uva10473 {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=in.readLine())!=null;){
			linea = linea.trim();
			if(linea.contains("0x")||linea.contains("0X"))
				sb.append(Long.valueOf(linea.substring(2), 16)+"\n");
			else{
				long n = Long.parseLong(linea);
				if(n<0)break;
				String num = Long.toHexString(Long.parseLong(linea));
				sb.append("0x");
				for(int i=0;i<num.length();++i){
					if(Character.isLetter(num.charAt(i)))
						sb.append(Character.toUpperCase(num.charAt(i)));
					else sb.append(num.charAt(i));
				}
				sb.append("\n");
			}
		}
		System.out.print(new String(sb));
	}

}
