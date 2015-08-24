import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF567A {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			long[] num = new long[N];
			long[][] res = new long[N][2];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				num[i]=Integer.parseInt(st.nextToken());
				res[i][0]=Integer.MAX_VALUE;
				res[i][1]=0;
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<N;++i){
				if(i==0){
					res[i][0]= (long)Math.sqrt((num[i+1]-num[i])*(num[i+1]-num[i]));
					res[i][1]= (long)Math.sqrt((num[num.length-1]-num[i])*(num[num.length-1]-num[i]));
				}else if(i==N-1){
					res[i][0]= (long)Math.sqrt((num[i-1]-num[i])*(num[i-1]-num[i]));
					res[i][1]= (long)Math.sqrt((num[0]-num[i])*(num[0]-num[i]));
				}else{
					long disA = (long)Math.sqrt((num[i]-num[0])*(num[i]-num[0]));
					long disAA = (long)Math.sqrt((num[i]-num[i+1])*(num[i]-num[i+1]));
					long disAAA = (long)Math.sqrt((num[i]-num[i-1])*(num[i]-num[i-1]));
					long disB = (long)Math.sqrt((num[num.length-1]-num[i])*(num[num.length-1]-num[i]));
					res[i][0]= Math.min(disAA, disAAA);
					res[i][1]= Math.max(disA, disB);
				}
				sb.append(res[i][0]+" " + res[i][1]+"\n");
			}
			System.out.print(new String(sb));
		}
	}
}
