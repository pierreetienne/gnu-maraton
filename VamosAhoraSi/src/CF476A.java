import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF476A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if(n<m)System.out.println("-1");
			else{
				int dos = (int) Math.floor(n/2.);
				int uno = 0;
				if((dos*2.)!= n)
					uno++;
				boolean paila = false;
				while((uno+dos)%m!=0&&!paila){
					if(dos>0){
						dos--;
						uno+=2;
					}else
						paila=true;
				}
				System.out.println(uno+dos);
			}
		}
	}
}
