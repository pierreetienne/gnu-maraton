import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Accepted
public class Uva12515 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea ;(linea= bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			char[][] m = new char[a][];
			for(int i=0;i<a;++i)m[i]=bf.readLine().toCharArray();
			for(int i=0;i<b;++i){
				char[] v = bf.readLine().toCharArray();
				int pos = -1;
				int min = Integer.MIN_VALUE;
				for(int j=0;j<m.length;++j){
					int cant = ((m[j].length-1)- (v.length-1));
					while(cant>=0){
						int matches = 0;
						for(int p=cant,q=0;q<v.length;++p,++q){
							if(m[j][p]==v[q])
								matches++;
						}
						cant--;
						if(matches>min){
							min = matches;
							pos = j;
						}
					}
					
				}
				sb.append((pos+1)+"\n");
			}
		}
		System.out.print(new String(sb));
	}

}
