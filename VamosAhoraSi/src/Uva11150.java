import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva11150 {
	public static void main(String[] args) throws Exception{
		int[] m = new int[201];
		m[1]=1;
		int index = 1, aumento = 1;
		for(int i=2;i<m.length;++i){
			m[i]=i+aumento;
			if(index%2==0)aumento++;
			index++;
		}
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea=bf.readLine())!=null;)
			sb.append(m[Integer.parseInt(linea)]+"\n");
		System.out.print(new String(sb));
	}
}
