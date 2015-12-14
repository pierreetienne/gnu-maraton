import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva541 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(N!=0){
			int[][] m = new int[N][N];
			boolean pailas = false;
			int posI = -1;
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int sum = 0;
				for(int j=0;j<N;++j){
					m[i][j]=Integer.parseInt(st.nextToken());
					sum +=m[i][j];
				}
				if(sum%2!=0 && posI==-1)
					posI=i;
				else if(sum%2!=0  && posI!=-1) pailas=true;
			}
			
			
			if(!pailas){
				int posJ =-1;
				for(int i=0;i<N;++i){
					int sum = 0;
					for(int j=0;j<N;++j){
						sum+=m[j][i];
					}
					if(sum%2!=0 && posJ == -1)
						posJ = i;
					else if(sum%2!=0 && posJ != -1)
					{
						pailas=true;break;
					}
				}
				if(pailas){
					sb.append("Corrupt\n");
				}
				else if(posI != -1 && posJ!= -1)
					sb.append("Change bit ("+(posI+1)+","+(posJ+1)+")\n");
				else
					sb.append("OK\n");
			}
			else
				sb.append("Corrupt\n");
			N = Integer.parseInt(bf.readLine());
		}
		System.out.print(new String(sb));
	}
}
