import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CF230B {

	static boolean[] primos;
	static TreeSet<Long> tPrimos;

	public static void main(String[] args) throws Exception {
		//sqrt(MAX(xi))  MAX(xi) = 10^12
		long[] p = getPrimos(1100000);
		tPrimos = new TreeSet<Long>();
		for(int i=0;i<p.length;++i){
			tPrimos.add(p[i]*p[i]);
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (String ln; (ln = in.readLine()) != null;) {
			int n = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; ++i) {
				long x = Long.parseLong(st.nextToken());
				sb.append(((tPrimos.contains(x)) ? "YES" : "NO") + "\n");
			}
			System.out.print(new String(sb));
		}
	}

	static long[] getPrimos(int cota) {
		boolean[] arr = new boolean[cota + 1];
		long[] res = new long[cota];
		arr[0] = arr[1] = true;
		int K = 0;
		for (int i = 0; i < arr.length; i++)
			if (!arr[i]) {
				res[K++] = i;
				for (int j = 2 * i; j < arr.length; j += i)
					arr[j] = true;
			}
		return Arrays.copyOfRange(res, 0, K);
	}
}
