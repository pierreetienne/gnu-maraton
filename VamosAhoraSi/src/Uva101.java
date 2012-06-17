


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Accepted
public class Uva101 {

	static int[][] m ;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		StringBuilder sb = new StringBuilder();
		while((linea = bf.readLine())!= null){
			int n = Integer.parseInt(linea.trim());
			m = new int[n][n];
			for(int i=0;i<n;++i){
				for(int j=0;j<n;++j)
					m[i][j]=(j==0)?i:-1;
			}
			String comando = bf.readLine();
			while (!comando.equals("quit")) {
//				System.out.println("*** " + comando);
				StringTokenizer st = new StringTokenizer(comando);
				if(st.nextToken().trim().equals("move")){
					int a = Integer.parseInt(st.nextToken().trim());
					if(st.nextToken().trim().equals("onto"))
					{
						int b = Integer.parseInt(st.nextToken().trim());
						int[] posA = posBloque(a);
						int[] posB = posBloque(b);
						if(posA[0]!= posB[0]){
							desempilarBloques(posA[0], posA[1]);
							desempilarBloques(posB[0], posB[1]);
							m[posB[0]][posB[1]+1]=a;
							m[posA[0]][posA[1]]=-1;
						}
					}
					else // over
					{
						int b = Integer.parseInt(st.nextToken().trim());
						int[] posA = posBloque(a);
						int[] posB = posBloque(b);
						if(posA[0]!= posB[0]){
							desempilarBloques(posA[0], posA[1]);
							encolar(a, posB[0], posB[1]);
							m[posA[0]][posA[1]]=-1;
						}
					}
				}
				else  // pile 
				{
					int a = Integer.parseInt(st.nextToken().trim());
					if(st.nextToken().trim().equals("onto"))
					{
						int b = Integer.parseInt(st.nextToken().trim());
						int[] posA = posBloque(a);
						int[] posB = posBloque(b);
						if(posA[0]!= posB[0])
						{
							desempilarBloques(posB[0],posB[1]);
							encolarTodosLosSiguientes(posA, posB);
						}
					}
					else // over
					{
						int b = Integer.parseInt(st.nextToken().trim());
						int[] posA = posBloque(a);
						int[] posB = posBloque(b);
						if(posA[0]!= posB[0])
						{
							encolarTodosLosSiguientes(posA, posB);
						}
					}
				}
//				System.out.println(imprimir());
				comando = bf.readLine();
			}
			
			for(int i=0;i<m.length;++i){
				sb.append(i+":");
				for(int j=0;j<m[i].length;++j){
					if(m[i][j]!= -1)
						sb.append(" "+m[i][j]);
				}
				sb.append("\n");
			}
			System.out.print(new String(sb));
			break;
		}
	}


	static void encolarTodosLosSiguientes(int[] posA, int[] posB) {
		for(int i=posA[1];i<m.length && m[posA[0]][i]!=-1;++i){
			encolar(m[posA[0]][i], posB[0], posB[1]);
			m[posA[0]][i]=-1;
		}
	}


	static void encolar(int bloque, int posx, int posy) 
	{
		for(;posy<m[posx].length&& m[posx][posy]!=-1;posy++);
		m[posx][posy]=bloque;
	}


	static int[] posBloque(int n ){
		for(int i=0;i<m.length;++i){
			for(int j=0;j<m[i].length;++j)
				if(m[i][j]== n)
					return new int[]{i, j};
		}
		return new int[]{};
	}

	static void desempilarBloques (int posx , int posy){
		for(int i = posy+1;i<m[posx].length;++i){
			if(m[posx][i]==-1)return ;
			m[m[posx][i]][0] = m[posx][i];
			m[posx][i]=-1;
		}
	}

	static String imprimir(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m.length;++i){
			sb.append(i+":");
			for(int j=0;j<m[i].length;++j){
				if(m[i][j]!= -1)
					sb.append(" "+m[i][j]);
			}
			sb.append("\n");
		}
		return new String(sb);
	}

}