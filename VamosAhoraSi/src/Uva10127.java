import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10127 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			long num = Integer.parseInt(linea), N = 1, unos=1;
			boolean k=true;
			while(k){
				if(N<num){
					N=(N*10)+1;
					unos++;
				}
				k =(N%num!=0);
				N=N%num;
			}
			sb.append(unos+"\n");
		}
		System.out.print(new String(sb));
	}

}
