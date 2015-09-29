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
			for(int i=0;i<sizeB&&!ok;++i){
				int val = Arrays.binarySearch(aK,bM[i]);
				int index = 0;
				if(val < 0 ){
					index = (val*-1)-1;
				}else{
					index = val-1;
				}
				System.out.println("en : "  + Arrays.toString(aK) +  " busco " + (bM[i]) + " -> " + val + " index : " + index + " k: " + k + " Math.abs(i-sizeB): "+Math.abs(i-sizeB));

				if(index>=k && Math.abs(i-sizeB)>=m)
					ok = true;
			}
			System.out.println(ok?"YES":"NO");

		}
	}

}
