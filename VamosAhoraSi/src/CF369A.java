import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF369A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int dias = Integer.parseInt(st.nextToken());
			int tazones = Integer.parseInt(st.nextToken());
			int platos = Integer.parseInt(st.nextToken());
			int cont = 0;
			st = new StringTokenizer(in.readLine());
			int[] m  = new int[dias];
			int[] suma = new int[3];
			for(int i=0;i<dias;++i){
				m[i] = Integer.parseInt(st.nextToken());
				if(m[i]==2){
					if(platos>0){
						platos--;
					}else if(tazones>0){
						tazones--;
					}else
						cont++;
				}else if(m[i]==1){
					if(tazones>0){
						tazones--;
					}else
						cont++;
				}
				suma[m[i]]++;
			}
			System.out.println(cont);
		}

	}

}
