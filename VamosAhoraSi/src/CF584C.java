import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF584C {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			String w1 = in.readLine();
			String w2 = in.readLine();
			int[] l1 = new int[26];
			int[] l2 = new int[26];
			for(int i=0;i<n;++i){
				l1[w1.charAt(i)-'a']++;
				l2[w2.charAt(i)-'a']++;
			}
			int[] l3 = new int[26];
			int cant = 0;
			for(int i=0;i<26;++i){
				l3[i]=Math.min(l1[i],l2[i]);
				cant+=l3[i];
			}

			System.out.println("diff1 " + diff(l1, l3, n));
			System.out.println("diff2 " + diff(l2, l3, n));
			System.out.println(new String(toString(l3)) + " -- > " + cant);
			int currentDiference = diff(l1, l3, n);
			if(t<currentDiference){
				System.out.println("-1");
			}else{

			}

		}


	}

	static int diff(int[] v1, int[] v2, int n){
		int diff = 0;
		for(int i=0;i<v1.length;++i){
			if(v1[i]>0 && v2[i]>0)
				diff+=Math.min(v1[i],v2[i]);
		}
		return n-diff;
	}

	static StringBuilder toString(int[] v){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<v.length;++i){
			for(int j=0;j<v[i];++j)
				sb.append((char)(i+'a'));
		}
		return sb;
	}

}
