import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF119A {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			boolean turn = true;
			while(n>0){
				if(turn){
					n -=(gcd(a, n));
					turn=false;
				}else{
					n -=(gcd(b, n));
					turn=true;
				}
			}
			System.out.println(turn?1:0);
		}
	}
	
	static int gcd (int a, int b){
		if(a==0)return b;
		if(b==0)return a;
		if(a>b)return gcd(a-b, b);
		else return gcd(a,b-a);
	}

}
