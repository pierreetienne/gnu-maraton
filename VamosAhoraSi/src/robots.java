

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;


/**
 * Dinamica de cuantas formas puedo llegar desde la posicion 0 0 de una matriz hasta la posicion N , N 
 * DFS
 * @author PierreEtienne
 *
 */
public class robots 
{
	static char[][] m ;

	static BigInteger[][] memo;

	static final int[] dx = new int[]{0,0,1,-1};
	static final int[] dy = new int[]{1,-1,0,0};


	static BigInteger f(int a , int b ){
		if(a >= 0 && a < m.length && b >= 0 && b < m.length && m[a][b]=='.'){
			if(memo[a][b]!= null)return memo[a][b];
			if(a == m.length-1 && b==m.length-1)return memo[a][b] =BigInteger.ONE;
			return memo[a][b] = (f(a,b+1).add(f(a+1, b))); 
		}
		return BigInteger.ZERO;
	}

	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N != 0 ){
			m = new char[N][N];
			memo= new BigInteger[N][N];
			for(int i=0;i<N;++i)
				m[i]=bf.readLine().trim().toCharArray();

			BigInteger val = (f(0,0).mod(new BigInteger(Integer.MAX_VALUE+"")));
			if(val.compareTo(BigInteger.ZERO)>0)
				sb.append(val+"\n");
			else
			{
				boolean visitado[][] = new boolean[N][N];
				Stack<Integer> pila1 = new Stack<Integer>();
				Stack<Integer> pila2  = new Stack<Integer>();
				pila1.push(0);
				pila2.push(0);
				boolean encontre = false;
				while(!pila1.isEmpty() && !encontre){
					int x = pila1.pop();
					int y = pila2.pop();
					if(x == N-1  && y == N-1 &&  m[x ][y ] =='.'){
						encontre=true;
						break;
					}

					for(int i=0;i<dx.length;++i){
						if(x + dx[i] < N && y + dy[i]  < N && x+ dx[i] >= 0 && y + dy[i] >=0 && !visitado[x + dx[i]][y + dy[i]] && m[x + dx[i]][y + dy[i]] =='.' ){
							pila1.add(x+dx[i]);
							pila2.add(y+dy[i]);
						}
					}
					visitado[x][y]=true;
				}
				if(encontre)
					sb.append("THE GAME IS A LIE\n");
				else
					sb.append("INCONCEIVABLE\n");

			}
			N = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}

}
