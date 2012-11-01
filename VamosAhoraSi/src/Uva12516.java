import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Uva12516 {


	static class No{
		int num;
		char posi;
		public String toString(){
			return "Num: "+ num +" Posi : " +posi; 
		}
	}
	
	static final Comparator<No> comparator =  new Comparator<No>() {
		public int compare(No o1, No o2) {
			return o1.num-o2.num;
		}
	};
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int F = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
			if(F==0 && C == 0) break;
			int N = Integer.parseInt(bf.readLine().trim());
			HashMap<Character, ArrayList<No>> data = new HashMap<Character, ArrayList<No>>();
			for(int i=0;i<N;++i){
				st = new StringTokenizer(bf.readLine());
				String x = st.nextToken();
				if(data.get(x.charAt(0))==null)
					data.put(x.charAt(0),new ArrayList<No>());
				int posy = Integer.parseInt(x.substring(1))-1;
				String aux = x;
				x = st.nextToken();
				No p = new No();
				p.num = posy;
				p.posi = x.charAt(0);
				data.get(aux.charAt(0)).add(p);				
			}
			N = Integer.parseInt(bf.readLine().trim());
			
			for(int i=0;i<N;++i){
				String x = bf.readLine().trim();
				int posy = Integer.parseInt(x.substring(1))-1;
				if(data.get(x.charAt(0))==null)
					data.put(x.charAt(0),new ArrayList<No>());
				No p = new No();
				p.num = posy;
				data.get(x.charAt(0)).add(p);
			}
			
			boolean funciona = true;
			
			for(Character c : data.keySet()){
				Collections.sort(data.get(c),comparator);
				ArrayList<No> info = data.get(c);
				for(int i=0;i<info.size();++i){
					No d = info.get(i);
					if(d.posi=='-')
					{
						for(int j=i+1;j<info.size();++j){
							No e = info.get(j);
							if(e.posi=='\0')
								e.posi='$';
							else funciona = false;
						}
						for(int j=i-1;j>=0;--j)
						{
							No e = info.get(j);
							if(e.posi=='\0')
								e.posi='$';
							else 
								funciona = false;
						}
					}
					else if(d.posi=='+')
					{
						for(int j=i+1;j<info.size();++j){
							No e = info.get(j);
							if(e.posi=='\0')
								e.posi='%';
							else break;
						}
						for(int j=i-1;j>=0;--j)
						{
							No e = info.get(j);
							if(e.posi=='\0')
								e.posi='%';
							else break;
						}
					}
					
					
				}
				for(int i=0;i<info.size();++i){
					No d = info.get(i);
					if(d.posi=='\0'){ System.out.println("d: " + d);funciona=false;}
				}
				
				System.out.println(c +" - " + data.get(c));
			}
			
		
			
			sb.append((funciona)?"YES\n":"NO\n");
		}
		System.out.print(new String(sb));
	}
}
