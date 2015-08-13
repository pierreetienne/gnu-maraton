import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF568A {
	
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int T = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
			boolean[] time = new boolean[T];
			for(int i=0;i<S;++i)
				time[i]=true;
			int cont = 1;
			for(int i=0;!time[T-1];++i){
//				System.out.println(Arrays.toString(time));
				if(i%Q==0 && time[i]){
					for(int j=S, p=0;p<Q-1&&j<T;++p,j++){
						S= j+1;
						time[j]=true;
//						System.out.println("j " + j);
					}
					
				}else if(!time[i]){
					i=0;
					cont++;
				}
			}
			System.out.println(cont);
		}
	}

}
