import java.io.InputStreamReader;

import java.io.BufferedReader;


public class CF554A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int val = 26+26*ln.length()-ln.length();
			System.out.println(val);
		}

	}

}
