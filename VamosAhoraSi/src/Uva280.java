import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Uva280 {

	static HashSet<Integer>[] lAdy;
	
	static boolean[] visitados;
	
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		visitados = new boolean[101];
		int N = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder(); 
		while(N!= 0){
			lAdy = new HashSet[N];
			for(int i=0;i<lAdy.length;++i)	lAdy[i]= new HashSet<Integer>();
			while(true){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int num = Integer.parseInt(st.nextToken());
				if(num==0)break;
				int pos = Integer.parseInt(st.nextToken())-1;
				while(pos!=-1){
					lAdy[num-1].add(pos);
					pos = Integer.parseInt(st.nextToken())-1;
				}
				
			}
			
			String ln = in.readLine();
			StringTokenizer st = new StringTokenizer(ln);
			int cantidad = Integer.parseInt(st.nextToken());
			for(int i=0;i<cantidad;++i){
				int vertex = Integer.parseInt(st.nextToken())-1;
				Set<Integer> s = nodoNoAlcanzables(vertex);
				sb.append(s.size());
				for(Integer x : s)
					sb.append(" "+x);
				sb.append("\n");
			}
			N = Integer.parseInt(in.readLine());
		}
		System.out.print( new String(sb ));
	}

	static Set<Integer> nodoNoAlcanzables(int vertex){
		TreeSet<Integer> s = new TreeSet<Integer>();
		Stack<Integer> p1 = new Stack<Integer>();
		Arrays.fill(visitados, false);
		p1.add(vertex);
		while(!p1.isEmpty()){
			int aux = p1.pop();
			visitados[aux]=true;
			for(Integer x: lAdy[aux]){
				if(!visitados[x]){
					p1.add(x);
					visitados[x]=true;
				}
			}
		}
		for(int i=0;i<lAdy.length;++i)
			if(!visitados[i])s.add(i+1);
		
		for(Integer x : lAdy[vertex]){
			if(x!=vertex)
				s.add(vertex+1);
		}
		
		return s;
	}
}
