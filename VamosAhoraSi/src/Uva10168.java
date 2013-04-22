import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Uva10168 {

	public static void main(String[] args)throws Exception {
		boolean[] criba = new boolean[10000];
		criba[0]=criba[1]=true;
		for(int i=2;i*i<criba.length;i++){
			for(int j=i*2;j<criba.length;j+=i){
				criba[j]=true;
			}
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(int i=0;i<criba.length;++i){
			if(!criba[i]){
				for(int j=0;j<criba.length; ++ j){
					if(!criba[j]){
						for(int p=0;p<criba.length; ++ p){
							if(!criba[p]){
								for(int q=0;q<criba.length;++q){
									if(!criba[q]){
										map.put(i+j+p+q, i+" "+j+" "+p+" "+q);
										System.out.println(i + " " + map.size());
									}
								}
							}
						}
					}
				}
			}
			
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	}

}
