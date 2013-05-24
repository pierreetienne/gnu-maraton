import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva571 {

	static int cA, cB , N;

	static boolean[][] visitados;
	
	static int[][] memo;
	
	
	
	static int f( int a, int b ){
		if(memo[a][b]!=-2)return memo[a][b];
		if(a==N || b == N)return  0;
		else{
		    int r1 = Integer.MAX_VALUE;
		    if(!visitados[0][b]){
		    	visitados[0][b]=true;
		    	r1 = f(0,b);
		    }
		    
		    int r2= Integer.MAX_VALUE;
		    if(!visitados[a][0]){
		    	visitados[a][0]=true;
		    	r2=f(a,0);
		    }
		    
		    int r3 = Integer.MAX_VALUE;
		    if(!visitados[cA][b]){
		    	visitados[cA][b]=true;
		    	r3=f(cA,b);
		    }
		    
		    int r4 = Integer.MAX_VALUE;
		    if(!visitados[a][cB]){
		    	visitados[a][cB]=true;
		    	r4=f(a,cB);
		    }
		    
		    int r5 = Integer.MAX_VALUE;
		    int nA = 0 , nB = 0;
		    System.out.println("actual: " + a + " : " + b);
		    if((cA-a)>=b)
		    	nA = a+b;
		    else
		    {
		    	nA=cA;
		    	nB=b-(cA-a);
		    }
		    System.out.println("siguente: " + nA +" : " + nB);
		    if(!visitados[nA][nB]){
		    	visitados[nA][nB]=true;
		    	r5=f(nA,nB);
		    }
		    
		    int zA = 0, zB = 0;
		    System.out.println("*actual : " + a +" : " + b);
		    if((cB-b)>=a)
		    	zB = b+a;
		    else
		    {
		    	zB = cB;
		    	zA = a-(cB-b);
		    }
		    
		    System.out.println("*siguente : " + zA +" : " + zB);
		    int r6 = Integer.MAX_VALUE;
		    if(!visitados[zA][zB]){
		    	visitados[zA][zB]=true;
		    	r6=f(zA,zB);
		    }
		    return memo[a][b]= Math.min(r1,Math.min(r2,Math.min(r3, Math.min(r4, Math.min(r5, r6)))))+1;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			cA = Integer.parseInt(st.nextToken()); cB = Integer.parseInt(st.nextToken()); N = Integer.parseInt(st.nextToken());
			visitados = new boolean[cA+1][cB+1];
			memo = new int[cA+1][cB+1];
			for(int i=0;i<cA+1;++i)
				Arrays.fill(memo[i],-2);
			System.out.println(f(0,0));
		}
	}

}
