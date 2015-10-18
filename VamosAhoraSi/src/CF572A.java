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
			int sizeB = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int k = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			long[] aK = new long[sizeA];
			long[] bM = new long[sizeB];
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<sizeA;++i){
				aK[i]=Long.parseLong(st.nextToken());
			}
			st = new StringTokenizer(in.readLine());
			for(int i=0;i<sizeB;++i){
				bM[i] = Long.parseLong(st.nextToken());
			}
			Arrays.sort(aK);
			Arrays.sort(bM);
			boolean ok = false;
			long val = bM[bM.length-m];
			for(int i=aK.length-1;i>=0&&!ok;--i){
				if(aK[i]<val&& (i+1)>=k)
					ok = true;
			}
		
			System.out.println(ok?"YES":"NO");

		}
	}

}
