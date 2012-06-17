

import java.io.InputStreamReader;
import java.util.Scanner;

public class Uva382 {

	public static void main(String[] args )throws Exception{
		int[] m = new int[70001];
		for(int i=1;i<m.length;++i){
			for(int j=i;j<m.length;j+=i){
				m[j]+=(j%i==0&& j!=i)?i:0;
			}
		}
		Scanner in = new Scanner(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()){
			sb.append("PERFECTION OUTPUT\n");
			long n = in.nextLong();
			while(n!=0){
				int tama = (n+"").length();
				switch (tama) {
				case 1:sb.append("    ");
				break;
				case 2:sb.append("   ");
				break;
				case 3:sb.append("  ");
				break;
				case 4:sb.append(" ");
				break;
				}
				sb.append(n+"  " + ((n == m[(int) n])?"PERFECT":(n<m[(int) n])?"ABUNDANT":"DEFICIENT")+"\n");
				n = in.nextLong();
			}
			sb.append("END OF OUTPUT\n");
		}
		System.out.print(new String(sb));
	}


}
