

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uva621 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		char ant = ' ';
		while(C>0){
			String n = bf.readLine();
			char actual = ' ';
			if(n.equals("1")||n.equals("4")||n.equals("78"))
				actual='+';
			else if(n.length() > 2 && n.charAt(n.length()-2)=='3' && n.charAt(n.length()-1)=='5')
				actual='-';
			else if(n.length()>2 && n.charAt(0)=='9' && n.charAt(n.length()-1)=='4')
				actual='*';
			else if(n.length()>3 && n.charAt(0)=='1' && n.charAt(1)=='9' && n.charAt(2)=='0')
				actual='?';
			
			if(actual!=' ')
				sb.append(actual+"\n");
			else 
				sb.append(ant+"\n");
			
			ant = actual;
			
			--C;
		}
		System.out.print(new String(sb));
	}

}
