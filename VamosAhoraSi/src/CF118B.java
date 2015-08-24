import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CF118B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int size = (n*2)+1;
			char[][] m = new char[size][size];
			for(int i=0;i<size;++i)
				for(int j=0;j<=n;++j)
					m[i][j]='x';
			//			for(int i=0;i<size;++i){
			//				int num = i;
			//				if(i>size/2){
			//					System.out.println((n/2)-(size-i));
			//					num=(size-i-1);
			//				}
			//				m[i][n]=(num+"").charAt(0);
			//				m[n][i]=(num+"").charAt(0);
			//			}

			int cont = 1;
			for(int i=0, q= 0;i<=size/2;++i){
				int aux = 0;
				for(int j=n-q, p = 0;p<cont;++p,j++){
					if(j<=n){
						aux =j-(n-q);
					}else{
						aux--;
					}
					m[m.length-1-i][j]=m[i][j]=(aux+"").charAt(0);
				}
				cont+=2;
				q++;
			}

			StringBuilder sb = new StringBuilder();
			for(int i =0;i<m.length;++i){
				for(int j=0;j<m.length;++j){
					
					boolean x = (j+1>n&& j+1<m.length&&(m[i][j+1]+"").trim().length()==0);
					if(j>n&& (m[i][j]+"").trim().length()==0)
						break;
					if(m[i][j]=='x')
						sb.append("  ");
					else
						sb.append(m[i][j]+((!x&&j+1<m.length)?" ":""));
				}
				sb.append("\n");
			}

			System.out.print(new String(sb));


		}

	}

}
