import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF541B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] vec = new int[N];
			int[] ord = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			int indexI =-1;
			int indexF = -1;
			for(int i=0;i<N;++i){
				ord[i]=vec[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(ord);
			for(int i=0;i<N;++i){
				if(ord[i]!=vec[i]){
					if(indexI==-1)
						indexI=i;
					else 
						indexF = i;
				}
			}
			for(int i=indexI, j=indexF ;i>=0 && j>=0&& i < j ;++i,--j){
				int aux = vec[i];
				vec[i]=vec[j];
				vec[j]=aux;
			}
			
			boolean order = true;
			for(int i=0;i<N&&order;++i){
				if(vec[i]!=ord[i])
					order =false;
			}
			if(order){
				if(indexI==-1 && indexF==-1)
					indexF=indexI=0;
				System.out.println("yes");
				System.out.println((indexI+1)+" "+ (indexF+1));
			}else
				System.out.println("no");
			
		}

	}

}
