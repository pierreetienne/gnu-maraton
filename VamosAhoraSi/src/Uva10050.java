import java.io.BufferedReader;
import java.io.InputStreamReader;

//accepted
public class Uva10050 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			int dias = Integer.parseInt(bf.readLine().trim());
			int h = Integer.parseInt(bf.readLine().trim());
			int[] res = new int[dias+1];
			for(int i=0 ;i<h;++i){
				int hartal = Integer.parseInt(bf.readLine().trim());
				int j=hartal;
				while(j<=dias){
					if(j%7!=0 && j%7!=6)
						res[j]++;
					j+=hartal;
				}
			}
			res[1]=res[0]=0;
			
			int cont = 0;
			for(int i=0;i<res.length;++i){
				if(res[i]>0)
					cont++;
			}
			sb.append(cont+"\n");
		}
		System.out.print(new String(sb));
	}
}
