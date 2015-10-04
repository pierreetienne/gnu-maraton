import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class CF549 {

	public static void main(String[] args)throws Exception  {
		int[] dx = {-1, 0,0,-1,-1,0,0,-1,0,1,0,1,0,1,0,1};
		int[] dy = {-1,-1,0,0,0,0,1,1,-1,-1,0,0,0,0,1,1};
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		map.put('f', 0);
		map.put('a', 1);
		map.put('c',2);
		map.put('e',3);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			char[][] letras = new char[n][];
			for(int i=0;i<n;++i){
				letras[i]=in.readLine().toCharArray();
			}
			int cont = 0;
			for(int i=0;i<n;++i){
				for(int j=0;j<m;++j){
					if(letras[i][j]=='f'){
						for(int q=0;q<dx.length;q+=4){
							boolean[] x = new boolean[4];
							for(int p=q;p<q+4;p++){
								int ai = dx[p]+i;
								int aj = dy[p]+j;
								if(ai>=0 && ai<n && aj>=0 && aj<m){
									if(map.get(letras[ai][aj])!=null){
										x[map.get(letras[ai][aj])]=true;
									}
								}
							}
							if(x[0]&& x[1]&&x[2]&&x[3]){
								cont++;
							}
						}
					}
				}
			}
			System.out.println(cont);

		}

	}

}
