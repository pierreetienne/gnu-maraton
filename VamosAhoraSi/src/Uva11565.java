import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva11565 {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		while(N-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			int[] r = r(A, B, C);
			if(r==null)sb.append("No solution.\n");
			else sb.append(r[0]+" "+ r[1]+ " "+ r[2]+"\n");
		}
		System.out.print(new String(sb));
	}
	
	
	static int[] r ( int A, int B , int C){
		for(int i=0;i<=10000;++i){
			if(i > A  || i > B || i > C )
				break;
			for(int j=0;j<=10000;++j){
				if(i > A  || i > B || i > C )
					break;
				if(i+j > A)break;
				if(i*j > B)break;
				if((i*i)+(j*j)>C)break;
				for(int p=0;p<=10000;++p){
					if(i+j+p == A && i*j*p==B && (i*i)+(j*j)+(p*p)==C )
						return new int[]{i,j,p};
					else if(p > A  || p > B || p > C )
						break;
					else if(i+j+p > A)break;
					else if(i*j*p > B)break;
					else if((i*i)+(j*j)+(p*p)>C)break;
				}
			}
		}
		return null;
	}

}
