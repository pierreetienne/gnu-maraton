import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF572A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int sizeA = Integer.parseInt(st.nextToken());
			int sizrB = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int k = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			long[] aK = new long[sizeA];
			long[] bM = new long[sizrB];
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<sizeA;++i){
				aK[i]=Long.parseLong(st.nextToken());
			}
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<sizrB;++i){
				bM[i] = Long.parseLong(st.nextToken());
			}
			Arrays.sort(aK);
			Arrays.sort(bM);
			boolean ok = false;
			for(int i=0;i<sizrB&&!ok;++i){
				int index = Math.abs(Arrays.binarySearch(aK,bM[i] ));
				if(index<sizeA && bM[i]==aK[index])
					index++;
				
				if(index>=k && Math.abs(i-sizrB)>=m)
					ok = true;
					
			}
			System.out.println(ok?"YES":"NO");
			
		}
	}

}
