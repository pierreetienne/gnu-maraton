
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10533 {
	public static void main(String[] args) throws Exception{
		boolean[] primos = new boolean[1000009];
		int[] m = new int[1000009];
		for(int i=2;i<primos.length;++i){
			if(!primos[i]){
				for(int j=i+i;j<primos.length;j+=i){	if(!primos[j])primos[j]=true;}
				String num = i +"";
				int suma = 0;
				for(int j=0;j<num.length();++j)
					suma += Integer.parseInt(num.charAt(j)+"");
				if(!primos[suma])
					m[i]= m[i-1]+1;
				else
					m[i]=m[i-1];
			}else m[i]=m[i-1];
		}
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
			sb.append(m[B]-m[A-1]);
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
