import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class CF490A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			List<Integer>[] list = new ArrayList[3];
			for(int i=0;i<list.length;++i)
				list[i] = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				int num = Integer.parseInt(st.nextToken())-1;
				list[num].add(i+1);
			}
			
			boolean can = false;
			int total = 0;
			StringBuilder sb = new StringBuilder();
			while(!can){
				if(list[0].size()>0 && list[1].size()>0 && list[2].size()>0){
					sb.append(list[0].get(0)+ " "+list[1].get(0)+ " "+list[2].get(0)+"\n");
					list[0].remove(0);
					list[1].remove(0);
					list[2].remove(0);
					total++;
				}
				else
					can=true;
			}
			System.out.println(total);
			System.out.print(new String(sb));
		}
	}

}
