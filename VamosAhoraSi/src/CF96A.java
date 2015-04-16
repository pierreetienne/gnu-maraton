import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF96A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			char ant ='+';
			int cont = 0;
			boolean dan = false;
			for(int i=0;i<ln.length()&&!dan;++i){
				if(ln.charAt(i)==ant){
					cont++;
				}else{
					ant = ln.charAt(i);
					cont=1;
				}
				if(cont >= 7)
					dan=true;
			}
			System.out.println(dan?"YES":"NO");
		}
	}

}
