import java.io.InputStreamReader;

import java.io.BufferedReader;


public class CF548A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int val = Integer.parseInt(in.readLine());
			if(val<=ln.length()&&ln.length()%val==0){
				int div = ln.length()/val;
				boolean ok = false;
				while(ln.length()>0&&!ok){
					StringBuilder sb = new StringBuilder(ln.substring(0,div));
					if(!sb.reverse().toString().equals(new String(ln.substring(0,div))))
						ok = true;
					ln = ln.substring(div);
				}
				if(ok)
					System.out.println("NO");
				else 
					System.out.println("YES");
			}else
				System.out.println("NO");
		}
	}

}
