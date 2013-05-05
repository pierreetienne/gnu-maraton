import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Uva10252 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln = in.readLine())!=null;){
			String ln2 = in.readLine();
			int[] m = new int[30];
			int[] m2 = new int[30];
			for(int i=0;i<ln.length();++i){
				m[ln.charAt(i)-'a']++;
				if(i<ln2.length())
					m2[ln2.charAt(i)-'a']++;
			}
			for(int i=ln.length();i<ln2.length();++i){
				m2[ln2.charAt(i)-'a']++;
			}
//			System.out.println(Arrays.toString(m));
//			System.out.println(Arrays.toString(m2));
			String res = "";
			for(int i=0;i<m.length;++i){
				int min = m[i]<m2[i]?m[i]:m2[i];
				if(min >0 ){
					for(int j=0;j<min;++j)
						res+=(char)(i+'a');
				}
			}
			char[] x = res.toCharArray();
			Arrays.sort(x);
			System.out.println(new String(x));
		}
	}

}
