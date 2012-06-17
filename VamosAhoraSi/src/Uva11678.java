

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

//Acepted
public class Uva11678 {

	
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while(A!=0 && B != 0){
			Set<Integer> alice = new TreeSet<Integer>();
			Set<Integer> p = new TreeSet<Integer>();
			st = new StringTokenizer(in.readLine());
			while(st.hasMoreTokens()){
				alice.add(Integer.parseInt(st.nextToken()));
			}
			st = new StringTokenizer(in.readLine());
			while(st.hasMoreTokens()){
				p.add(Integer.parseInt(st.nextToken()));
			}
			int contA = 0, contB = 0 ;
			for(Integer i:alice){
				if(!p.contains(i))
					contA++;
			}
			
			for(Integer i:p){
				if(!alice.contains(i))
					contB++;
			}
			sb.append(Math.min(contA,contB)+"\n");
			st= new StringTokenizer(in.readLine());
			A = Integer.parseInt(st.nextToken());B = Integer.parseInt(st.nextToken());
		}
		System.out.print(new String(sb));
	}

}
