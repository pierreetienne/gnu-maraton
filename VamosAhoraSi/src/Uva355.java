import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//Accept
public class Uva355 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int baseIni = Integer.parseInt(st.nextToken());
			int baseFin = Integer.parseInt(st.nextToken());
			String num = st.nextToken().trim();
			try{
				BigInteger val = new BigInteger(num, baseIni);
				StringBuilder n = new StringBuilder( val.toString( baseFin));
				for(int i=0;i<n.length();++i)
					if(Character.isLetter(n.charAt(i)) )
						n.setCharAt(i, Character.toUpperCase(n.charAt(i)));
				sb.append(num+" base " +baseIni+" = "+n.toString()+ " base "+ baseFin +"\n");
			}catch(Exception e){
				sb.append(num + " is an illegal base " + baseIni + " number\n");
			}
		}
		System.out.print(new String(sb));
	}

}
