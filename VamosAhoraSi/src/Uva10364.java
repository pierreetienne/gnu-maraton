import java.util.Scanner;

public class Uva10364 {

	static int[] nums;

	static double r;

	static boolean f(int index, double val) {
		if (val == r)
			return true;
		if (val > r)
			return false;
		if(index < nums.length){
			if (nums[index] != -1) {
				boolean x = f(index + 1, val + nums[index]);
				if (x) {
					nums[index] = -1;
					return true;
				}
				boolean y = f(index + 1, val);
				return x||y ;
			}
			else {
				return f(index+1 , val);
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		// BufferedReader bf = new BufferedReader(new
		// InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while (N-- > 0) {
			// String linea = bf.readLine();
			// StringTokenizer st = new StringTokenizer(linea);
			int M = sc.nextInt();// Integer.parseInt(st.nextToken());
			nums = new int[M];
			long suma = 0;
			for (int i = 0; i < M; ++i)
				suma += nums[i] = sc.nextInt();// Integer.parseInt(st.nextToken());

			r = (double) ((double) suma) / (double) 4;
			if( f(0, 0) &&f(0, 0) &&f(0, 0) &&f(0, 0) ) 
				sb.append("yes\n");
			else
				sb.append("no\n");

		}
		System.out.print(new String(sb));
	}

}
