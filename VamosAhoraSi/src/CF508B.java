import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CF508B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int index = -1;
			int min = Integer.MAX_VALUE;
			for(int i=ln.length()-1;i>=0;--i){
				int value = ln.charAt(i)-'0';
				if(value%2==0 && min>=value){
					min = value;
					index=i;
				}
			}
			if(index!=-1){
				if((ln.charAt(ln.length()-1)-'0')%2==0){
					System.out.println(ln);
				}else{
					char m[] = ln.toCharArray();
					int lastValue = ln.charAt(ln.length()-1)-'0';
					if(lastValue>min){
						int auxIndex = -1;
						for(int i=0;i<m.length&&auxIndex==-1;++i){
							int value = m[i]-'0';
							if(value%2==0 && value<lastValue)
								auxIndex=i;
						}
						char aux = m[auxIndex];
						m[auxIndex] = m[ln.length()-1];
						m[ln.length()-1]=aux;
						System.out.println((new String(m)));
					}else{
						int auxIndex = -1;
						for(int i=ln.length()-1;i>=0&&auxIndex==-1;--i){
							int value = ln.charAt(i)-'0';
							if(value%2==0)
								auxIndex=i;
						}
						char aux = m[auxIndex];
						m[auxIndex] = m[ln.length()-1];
						m[ln.length()-1]=aux;
						System.out.println((new String(m)));
					}
				}
			}else{
				System.out.println(-1);
			}
		}
	}
}