import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parenti {

	static String c;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			c=ln;
			System.out.println(f(0,c.length()-1));
		}
	}
	
	
	static boolean f(int i, int j){
		System.out.println("i: " + i + " j: " + j);
		if(i+j==-1)
			return true;
		if((j-i)%2==0)
			return false;
		boolean suma = false;
		for(int k=i+1;k<j;++k){
			if(c.charAt(i+1)== c .charAt(k-1))
			 suma |= f(i+1,k-1);
			if(c.charAt(k+1)== c .charAt(j))
				suma |= f(k+1, j);
		}
		return suma;
	}
	
}
