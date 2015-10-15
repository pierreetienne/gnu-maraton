import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class CF219A {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int k = Integer.parseInt(ln);
			String w = in.readLine();
			int[] c = new int[26];
			Set<Integer> key = new TreeSet<Integer>();
			for(int i=0;i<w.length();++i){
				c[w.charAt(i)-'a']++;
				key.add(w.charAt(i)-'a');
			}
			boolean ok = true;
			for(int i=0;i<c.length&&ok;++i){
				if(c[i]>0){
					if(c[i]>= k && c[i]%k==0){
						continue;
					}
					else
						ok = false;
				}
			}
			if(ok){
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<k;++i){
					for(int j:key){
						for(int p=0;p<=(c[j]%k);++p)
							sb.append((char)(j+'a'));
					}
				}
				System.out.println(new String(sb));
			}else{
				System.out.println(-1);
			}
		}

	}

}
