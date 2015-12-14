import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF510A {

	public static void main(String[] args)throws Exception  {
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			char[][] data = new char[n][m];
			boolean rigth = true;
			for(int i=0;i<n;++i){
				boolean mark = false;
				for(int j=0;j<m;++j){
					data[i][j]='.';
					if(i%2==0)
						data[i][j]='#';
					else if(!mark &&rigth && j==m-1){
						data[i][j]='#';
						rigth = false;
						mark= true;
					}else if(!mark &&!rigth && j==0){
						data[i][j]='#';
						rigth = true;
						mark =true;
					}
				}
				System.out.println( new String(data[i]));
			}
		}
	}

}
