import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva12516 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0 && C == 0) break;
			int N = Integer.parseInt(bf.readLine().trim());
			int[][] m = new int[F][C+1];
			int[][] cpy = new int[F][C+1];
			for(int i=0;i<m.length;++i){Arrays.fill(m[i],-1); Arrays.fill(cpy[i], -1);}
			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				String x = st.nextToken();
				int posx =  Character.toUpperCase(x.charAt(0))-'A';
				int posy = Integer.parseInt(x.substring(1))-1;
				x = st.nextToken();
				if(x.trim().equals("-"))
					cpy[posx][posy]=m[posx][posy]=-2;
				else
					cpy[posx][posy+1]=m[posx][posy+1]=-2;
			}
			N = Integer.parseInt(bf.readLine().trim());
			boolean funciona = true;
			for(int i=0;i<N;++i){
				String x = bf.readLine().trim();
				int posx =  Character.toUpperCase(x.charAt(0))-'A';
				int posy = Integer.parseInt(x.substring(1))-1;
				if(m[posx][posy]==-1 && m[posx][posy+1]==-1)
					m[posx][posy]=m[posx][posy+1]=posy;
				else if(m[posx][posy+1]==-1&&m[posx][posy]==-2 )
					m[posx][posy+1]=-2;
				else if(m[posx][posy]==-1&&m[posx][posy+1]==-2 )
					m[posx][posy]=-2;
				else if(m[posx][posy]>=0&& m[posx][posy+1]==-2)
					m[posx][posy-1]=m[posx][posy]=-2;
				else if(m[posx][posy+1]>=0&&m[posx][posy]==-2)
					m[posx][posy+1]=m[posx][posy+2]=-2;
				else if(m[posx][posy]==-2 &&m[posx][posy+1]==-2 )
					funciona = false;
			}
			
			sb.append((funciona)?"YES\n":"NO\n");
		}
		System.out.print(new String(sb));
	}
}
