import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class CF330A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			char[][] m = new char[r][c];
			Set<Integer> rows = new TreeSet<Integer>();
			Set<Integer> cols = new TreeSet<Integer>();
			for(int i=0;i<r;++i){
				st = new StringTokenizer(in.readLine());
				m[i]=st.nextToken().toCharArray();
				for(int j=0;j<m[i].length;++j){
					if(m[i][j]=='S'){
						rows.add(i);
						cols.add(j);
					}
				}
			}
			
			int cont = 0;
			for(int i=0;i<r;++i){
				if(!rows.contains(i)){
					for(int j=0;j<c;++j){
						if(m[i][j]=='.'){
							m[i][j]=',';
							cont++;
						}
					}
				}
			}
			
			for(int i=0;i<c;++i){
				if(!cols.contains(i)){
					for(int j=0;j<r;++j){
						if(m[j][i]=='.'){
							m[j][i]=',';
							cont++;
						}
					}
				}
			}
			System.out.println(cont);
		}
		

	}

}
