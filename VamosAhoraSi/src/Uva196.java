import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Uva196 {

	static String[][] matriz;
	
	static HashMap<String,Integer> mapa ;
	
	public static void main(String[] args) throws Exception{
		mapa = new HashMap<String, Integer>();
		Queue<String> cola = new LinkedList<String>();
		int pos = 0;
		for(int i='A';i<='Z';++i){
			mapa.put((char)i+"", pos++);
			cola.add(((char)i)+"");
		}
		
		while(!cola.isEmpty()){
			String actual = cola.poll();
			for(int i='A';i<='Z';++i){
				if(actual.length()+1 <= 3){
					mapa.put(actual+(char)i, pos++);
					cola.add(actual+(char)i);
				}
			}
		}
		
		matriz = new String[1001][mapa.size()];
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			for(int i=0;i<matriz.length;++i)Arrays.fill(matriz[i], "0");
			int columns = in.nextInt(), rows = in.nextInt();
			for(int i=0;i<rows;++i){
				for(int j=0;j<columns;++j){
					matriz[i][j]= in.next();
				}
			}
			for(int i=0;i<rows;++i){
				for(int j=0;j<columns;++j){
					if(!esNumero(matriz[i][j])){
						matriz[i][j] = solucionarPosicion(i, j)+"";
						sb.append(matriz[i][j]+((j+1==columns)?"":" "));
					}
					else
						sb.append(matriz[i][j]+((j+1==columns)?"":" "));
				}
				sb.append("\n");
			}
			
			if(N-1>=0){
				
			}
		}
		System.out.print(new String(sb));
	}
	
	static int solucionarPosicion(int i, int j){
		int suma = 0;
		Stack<String> p = new Stack<String>();
		String x = matriz[i][j];
		if(x.charAt(0)=='=')x = x.substring(1);
		StringTokenizer st = new StringTokenizer(x, "+");
		while(st.hasMoreTokens()){
			p.add(st.nextToken());
		}
		
		while(!p.isEmpty()){
			String c = p.pop();
			int[] pos = posicion(c);
			if(!esNumero(matriz[pos[0]][pos[1]])){
				suma+=solucionarPosicion(pos[0], pos[1]);
			}else
				suma+=Integer.parseInt(matriz[pos[0]][pos[1]]);
		}
		return suma;
	}
	static boolean esNumero(String n){
		n = n.trim();
		for(int i=0;i<n.length();++i)
			if(!Character.isDigit(n.charAt(i))&& n.charAt(i)!= '-')return false;
		return true;
	}
	static int[] posicion(String n){
		String x = "";
		String num = "";
		for(int i=0;i<n.length();++i){
			if(Character.isLetter(n.charAt(i)))x+=n.charAt(i)+"";
			if(Character.isDigit(n.charAt(i)))num+=n.charAt(i)+"";
		}
		return new int[]{Integer.parseInt(num)-1,mapa.get(x.trim())};
	}
}