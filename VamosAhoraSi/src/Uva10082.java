
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10082 {
	

	public static void main(String[] args) throws Exception {
		String[] vals = new String[] {"`1234567890-=","QWERTYUIOP[]\\","ASDFGHJKL;'","ZXCVBNM,./"};
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a;
		StringBuilder sb = new StringBuilder();
		while((a= bf.readLine())!=null){
			for(int i=0;i<a.length();++i){
				int index = -1,aux = -1;
				for(int j=0;j<vals.length && index==-1;++j){
					index=vals[j].indexOf(a.charAt(i));
					if(index!=-1)
						aux=j;
				}
				if(index>0)
					sb.append(vals[aux].charAt(index-1));
				else if(index==0)
					sb.append(vals[aux].charAt(index));
				else
					sb.append(a.charAt(i));
			}
			sb.append("\n");
		}
		System.out.println(sb.substring(0, sb.length()-1));
	}

}
