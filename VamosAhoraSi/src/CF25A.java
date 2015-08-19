import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF25A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int contPar = 0; 
			int indexPar = -1;
			int indexImpar = -1;
			for(int i=0;i<N;++i){
				int v = Integer.parseInt(st.nextToken());
				if(v%2==0){
					contPar++;
					if(indexPar==-1)
						indexPar=i+1;
				}else{
					if(indexImpar == -1)
						indexImpar = i+1;
				}
			}
			if(contPar==1)
				System.out.println(indexPar);
			else 
				System.out.println(indexImpar);
			
		}

	}

}
