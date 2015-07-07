import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF160A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] coins = new int[N];
			int total = 0;
			for(int i=0;i<N;++i){
				coins[i] = Integer.parseInt(st.nextToken());
				total +=  coins[i];
			}
			Arrays.sort(coins);
			int value = 0;
			int cant = 0;
			int index = coins.length-1;
			while(index>=0 && value<= (total-value)){
				value+=coins[index];
				cant++;
				index--;
			}
			System.out.println(cant);
		}
	}

}
