import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF546B {

	public static void main(String[] args) throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int m[] = new int[N];
			boolean[] nums = new boolean[10001];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				m[i]=Integer.parseInt(st.nextToken());
				nums[m[i]]=true;
			}
			Arrays.sort(m);
			int cont = 0;
			for(int i=0;i<N-1;++i){
				if(i>=0&&m[i]==m[i+1]){
					int num = -1;
					for(int j=m[i];j<nums.length&& num==-1;++j){
						if(!nums[j]){
							num = j;
							break;
						}
					}
					cont+= Math.abs(num - m[i]);
					m[i]=num;
					nums[num]=true;
					Arrays.sort(m);
					i=-1;
				}
			}
			Arrays.sort(m);
			System.out.println(cont);
		}
	}
}

