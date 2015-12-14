import java.io.InputStreamReader;

import java.io.BufferedReader;


public class Uva12289 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			String p = in.readLine();
			if(p.length()==3){
				int a = dif(p, "two");
				int b = dif(p, "one");
				if(a< b )
					sb.append("2\n");
				else
					sb.append("1\n");
			}
			else
				sb.append("3\n");
		}
		System.out.print(new String(sb));
	}
	static int dif (String p, String c){
		int dif = 0;
		for(int i=0;i<c.length();++i)
			if(c.charAt(i)!=p.charAt(i))
				dif++;
		return dif;
	}

}
