import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF255A {

	public static void main(String[] args) throws Exception {
		String[] name = {"chest","biceps","back" };
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int[] sums = new int[name.length];
			int n = Integer.parseInt(ln);
			int index = 0;
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				sums[index]+= Integer.parseInt(st.nextToken());
				index=(index+1)%name.length;
			}
			int indexMax = 0;
			for(int i=1;i<sums.length;++i){
				if(sums[i]>sums[indexMax])
					indexMax = i;
			}
			System.out.println(name[indexMax]);
		}
	}

}
