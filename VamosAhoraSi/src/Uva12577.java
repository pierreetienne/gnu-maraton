import java.io.InputStreamReader;

import java.io.BufferedReader;

//Accept
public class Uva12577 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		for(String linea;(linea = bf.readLine())!=null;){
			if(linea.indexOf("*")!= -1)break;
			if(linea.indexOf("Hajj")!=-1)
				sb.append("Case "+(caso++)+": Hajj-e-Akbar\n");
			else
				sb.append("Case "+(caso++)+": Hajj-e-Asghar\n");
		}
		System.out.print(new String(sb));
	}

}
