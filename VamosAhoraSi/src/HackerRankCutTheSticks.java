import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HackerRankCutTheSticks {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int[] m = new int[N];
		StringTokenizer st = new StringTokenizer(in.readLine());
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N;++i){
			m[i]=Integer.parseInt(st.nextToken());
			min = Math.min(min, m[i]);
		}
		StringBuilder sb = new StringBuilder();
		boolean ws = false;
		while(!ws){
			ws=true;
			int cont = 0;
			int newMin = Integer.MAX_VALUE;
			for(int i=0;i<N;++i){
				if(m[i]>0){
					m[i]-=min;
					cont++;
				}
				if(m[i]>0){
					newMin=Math.min(m[i],newMin);
				}
				if(m[i]>0)
					ws=false;
			}
			if(newMin<Integer.MAX_VALUE)
				min = newMin;
			sb.append(cont).append("\n");
		}
		System.out.print(new String(sb));
	}

}
