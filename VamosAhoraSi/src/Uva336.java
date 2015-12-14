import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Uva336 {

	public static void main(String[] args)throws Exception {
		ArrayList<Integer> nodos = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); 
		int N = in.nextInt(), caso = 1;
		while(N != 0){
			int[] n = new int[30];
			boolean [][] m = new boolean[31][31];
			int pos = 0;
			for(int i=0;i<N;++i){
				int a = in.nextInt();
				int x = -1;
				for(int j=0;j<n.length&&x==-1;++j){
					if(n[j]==a)
						x = j;
				}
				
				if(x==-1)n[x=pos++]=a;
				int b = in.nextInt();
				int y = -1;
				for(int j=0;j<n.length&&y==-1;++j){
					if(n[j]==b)
						y=j;
				}
				if(y==-1)n[y=pos++]=b;
				m[x][y]=true;
				m[y][x]=true;
			}
			int a = in.nextInt();
			int b = in.nextInt();
			while(!(a==0 && b ==0)){
				int original = a;
				for(int i=0;i<n.length;++i)
					if(n[i]== a ){
						a = i;
						break;
					}
				int cont = 0;
				Queue<Integer>c1 = new LinkedList<Integer>();
				c1.add(a);
				int[] nivel = new int[pos];
				Arrays.fill(nivel, -1);
				nivel[a]=0;
				while(!c1.isEmpty()){
					int X = c1.poll();
					for(int i=0;i<m.length;++i){
						if(m[X][i] && nivel[i]==-1){
							c1.add(i);
							nivel[i]= nivel[X]+1;
							if(nivel[i]>b)
								cont++;
						}
					}
				}
				for(int x : nivel)
					if(x==-1)cont++;
				sb.append("Case "+caso+++": "+cont+" nodes not reachable from node "+original+" with TTL = "+b+".\n");
				a = in.nextInt();
				b = in.nextInt();
			}
			nodos.clear();
			N = in.nextInt();
		}
		System.out.print(new String(sb));

	}

}
