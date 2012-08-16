import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva414 {

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N != 0 ){
			String[] m = new String[N];
			int res = -1;
			int min = Integer.MAX_VALUE;
			int[] dif = new int[N];
			for(int i=0;i<N;++i){
				m[i]= bf.readLine().trim().replaceAll("B"," ");
				dif[i] = (m[i].indexOf(" X"))-(m[i].indexOf("X "));
				if(min>dif[i])
					min = dif[i];
			}
			if(N == 1 )	res = 0;
			if(res != 0 ){
				res = 0;
				for(int i=0;i<N;++i)
					res += dif[i]-min;
			}
			sb.append(res+"\n");
			N = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}

}
