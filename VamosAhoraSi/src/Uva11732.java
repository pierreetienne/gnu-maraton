import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Uva11732 {

	
	static HashMap<Character, Integer> mapas = new HashMap<Character, Integer>();
	
	static int[][] trie ;
	
	static int[][] veces;
	
	static int[][] comparaciones;
			
	public static void main(String[] args) throws Exception{
//		for(int i=0;i<1000;++i){
//			char le = 'a';
//			for(int j=0;j<1000;++j){
//				System.out.print(le+"");
//				if(le=='z')
//					le='A';
//				else if(le=='Z')
//					le='0';
//				else if(le=='9')
//					le='a';
//				le++;
//			}
//			System.out.println();
//		}
		
		int u = 0;
		for(int i='0';i<='9';++i)mapas.put((char) i, u++);
		for(int i='a';i<='z';++i)mapas.put((char) i, u++);
		for(int i='A';i<='Z';++i)mapas.put((char) i, u++);
		trie = new int[200500][mapas.size()];
		veces = new int[200500][mapas.size()];
		comparaciones = new int[200500][mapas.size()];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		int casos = 1;
		while(N!= 0){
			int index = 1;
			String[] palabras = new String[N];
			for(int i=0;i<palabras.length;++i){
				palabras[i] = bf.readLine();
				int auxPos=0;
				for(int j=0;j<palabras[i].length();++j){
					int posicionLetra = mapas.get(palabras[i].charAt(j));
					veces[auxPos][posicionLetra]++;
					if(trie[auxPos][posicionLetra]==0){
						for(int p=0;p<mapas.size();++p){
							if(p!=posicionLetra && trie[auxPos][p]!=0)
								comparaciones[auxPos][p]++;
						}
						if(index >= trie.length)
							return ;
						auxPos = trie[auxPos][posicionLetra]=index++;
						
					}
					else{
						for(int p=0;p<mapas.size();++p){
							if(p!=posicionLetra && trie[auxPos][p]!=0)
								comparaciones[auxPos][p]++;
						}
						comparaciones[auxPos][posicionLetra]=2*((veces[auxPos][posicionLetra]>2)?veces[auxPos][posicionLetra]:veces[auxPos][posicionLetra]-1);
						auxPos = trie[auxPos][posicionLetra];
					}
				}
			}
			long cont = sumar();
			
//			for(int i=0;i<19;++i){
//				for(int j=0;j<mapas.size();++j){
//					System.out.print(veces[i][j]+" ");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("--------------");
//			for(int i=0;i<19;++i){
//				for(int j=0;j<mapas.size();++j){
//					System.out.print(comparaciones[i][j]+" ");
//				}
//				System.out.println();
//			}
			for(int[]x: trie)Arrays.fill(x,0);
			for(int[]x: veces)Arrays.fill(x, 0);
			for(int[]x: comparaciones)Arrays.fill(x, 0);
			sb.append("Case "+(casos++)+": "+(cont)+"\n");
			N = Integer.parseInt(bf.readLine().trim());
		}
		System.out.print(new String(sb));
	}
	static long sumar(){
		long suma = 0;
		Queue<Integer> cola = new LinkedList<Integer>();
		for(int i=0;i<mapas.size();++i){
			if(trie[0][i]!=0){
				cola.add(trie[0][i]);
				suma+=comparaciones[0][i];
			}
		}
		while(!cola.isEmpty()){
			int pos = cola.poll();
			for(int i=0;i<mapas.size();++i)
			{
				if(trie[pos][i]!=0){
					cola.add(trie[pos][i]);
					suma+=comparaciones[pos][i];
				}
			}
		}
		return suma;
	}
}
