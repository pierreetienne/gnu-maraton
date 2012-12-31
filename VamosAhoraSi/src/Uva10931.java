import java.io.BufferedReader;
import java.io.InputStreamReader;

//Accepted
public class Uva10931 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			int val = Integer.parseInt(linea);
			if(val==0)break;
			String n = Integer.toBinaryString(val);
			int cont = 0;
			for(int i=0;i<n.length();++i)cont+=n.charAt(i)-'0';
			sb.append("The parity of "+n+" is "+cont+" (mod 2).\n");
		}
		System.out.print(new String(sb));
	}

}
