import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Uva598 {

	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(bf.readLine());
		bf.readLine();
		while(M-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String x = st.nextToken();
			ArrayList<String> p = new ArrayList<String>();
			if(x.trim().equals("*"))
			{
				for(String linea;(linea = bf.readLine())!=null&& !linea.trim().equals("");){
					p.add(linea);
				}
				for(int i=0;i<p.size();++i){
					sb.append(sb.append(p.get(i))+" ,");
					for(int j=i+1;j<p.size();++j){
						sb.append(p.get(j)+" ,");
					}
					sb.append("\n");
				}
			}
			else if(!st.hasMoreTokens())
			{
				int n = Integer.parseInt(x);
				for(String linea;(linea = bf.readLine())!=null&& !linea.trim().equals("");){
					p.add(linea);
				}
			}
			else
			{
				int a = Integer.parseInt(x);
				int b = Integer.parseInt(st.nextToken());
				for(String linea;(linea = bf.readLine())!=null&& !linea.trim().equals("");){
					p.add(linea);
				}
			}
		}
		System.out.print(new String(sb));
	}

}
