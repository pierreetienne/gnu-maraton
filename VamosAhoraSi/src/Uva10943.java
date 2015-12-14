import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10943 {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[][] m = new int[101][101];
		for(int i=0;i<m.length;++i){
			m[1][i]=1;
			if(i>1)
				m[i][1]=m[i-1][1]+1;
		}
		for(int i=2;i<m.length;++i){
			for(int j=2;j<m.length;++j)
				m[i][j]= (m[i-1][j]%1000000+m[i][j-1]%1000000)%1000000;
		}
		StringBuilder sb= new StringBuilder();
		for(String ln;(ln = in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int a = Integer.parseInt(st.nextToken()),b = Integer.parseInt(st.nextToken());
			if(a==0&&b==0)break;
			sb.append(m[b][a]).append("\n");
		}
		System.out.print(new String(sb));
	}

}
