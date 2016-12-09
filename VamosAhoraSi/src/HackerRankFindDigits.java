import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerRankFindDigits {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			while(N-->0){
				String num = in.readLine();
				long full = Long.parseLong(num);
				int[] nums = new int[10];
				for(int i=0;i<num.length();++i){
					nums[num.charAt(i)-'0']++;
				}
				int sum = 0;
				for(int i=1;i<nums.length;++i){
					sum+=(nums[i]>0&&full%i==0)?nums[i]:0;
				}
				System.out.println(sum);
			}
		}
	}

}
