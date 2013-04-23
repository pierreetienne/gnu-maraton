import java.io.BufferedReader;
import java.io.InputStreamReader;

//no submit
public class Uva11530 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int[] l = new int[('z'-'a')+1];
		l['a'-'a']=l['d'-'a']=l['g'-'a']=l['j'-'a']=l['m'-'a']=l['p'-'a']=l['t'-'a']=l['w'-'a']=1;
		l['b'-'a']=l['e'-'a']=l['h'-'a']=l['k'-'a']=l['n'-'a']=l['q'-'a']=l['u'-'a']=l['x'-'a']=2;
		l['c'-'a']=l['f'-'a']=l['i'-'a']=l['l'-'a']=l['o'-'a']=l['r'-'a']=l['v'-'a']=l['y'-'a']=3;
		l['s'-'a']=l['z'-'a']=4;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		int caso = 1;
		while(N-->0){
			String n = in.readLine();
			long cont=0;
			for(int  i=0;i<n.length();++i){
				if(n.charAt(i)==' ')
					cont++;
				else{
					cont+=l[n.charAt(i)-'a'];
				}
			}
			sb.append("Case #"+caso+++": "+cont+"\n");
		}
		System.out.print(new String(sb));
	}

}
