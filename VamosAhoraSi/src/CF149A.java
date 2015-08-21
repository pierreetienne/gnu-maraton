import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF149A {

	public static void main(String[] args)throws Exception  {
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int [] months = new int[12];
			for(int i=0;i<12;++i){
				months[i]=Integer.parseInt(st.nextToken());
			}
			if(N==0)
				System.out.println(0);
			else{
				Arrays.sort(months);
				int sum = 0;
				int cont = 0;
				boolean ok = false;
				for(int i=months.length-1;i>=0&&!ok;--i){
					sum+=months[i];
					if(sum>=N){
						ok =true;
					}
					cont++;
				}
				if(ok)
					System.out.println(cont);
				else 
					System.out.println(-1);
			}
		}
	}

}
