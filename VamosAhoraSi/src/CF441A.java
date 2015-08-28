import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class CF441A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			List<Integer> li = new ArrayList<Integer>();
			for(int i=0;i<n;++i){
				st = new StringTokenizer(in.readLine());
				int x = Integer.parseInt(st.nextToken());
				for(int j=0;j<x;++j){
					int value = Integer.parseInt(st.nextToken());
					if(v>value ){
						if(li.size() == 0)
							li.add(i+1);
						else if(li.get(li.size()-1).intValue()!=(i+1))
							li.add(i+1);
					}
				}
			}
			System.out.println(li.size());
			for(int i=0;i<li.size();++i){
				if(i==0)
					System.out.print(li.get(i));
				else
					System.out.print(" "+li.get(i));
			}
			System.out.println();
		}

	}

}
