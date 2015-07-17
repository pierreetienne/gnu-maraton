import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF558B {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] values = new int[N];
			int[] numbers = new int[1000001];
			int max = 0;
			int[] startIndex = new int[1000001];
			int[] endIndex = new int[1000001];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				values[i]=Integer.parseInt(st.nextToken());
				numbers[values[i]]++;
				if(numbers[values[i]]==1)
					startIndex[values[i]]=i;
				endIndex[values[i]]=i;
				max = Math.max(max, numbers[values[i]]);
			}
			int rIndex = Integer.MAX_VALUE;
			int lIndex = 0;
			for(int i=0;i<N;++i){
				if(numbers[values[i]]==max){
					if(rIndex- lIndex > endIndex[values[i]] - startIndex[values[i]]){
						rIndex = endIndex[values[i]];
						lIndex = startIndex[values[i]];
					}
				}
			}
			System.out.println((lIndex+1) + " " + (rIndex+1));
		}

	}

}
