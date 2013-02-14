import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Uva714 {

	static int[] val ;
	
	static int[] sum ;
	
	static int tam;
	public static void main(String[] args)throws Exception  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		while(C-->0){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int K = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			val = new int[K];
			sum = new int[K];
			int min = 0, max = 0;
			st = new StringTokenizer(bf.readLine());
			for(int i=0;i<K;++i){
				max += (sum[i]=val[i]=Integer.parseInt(st.nextToken()));
				if(i>0)	sum[i]=sum[i-1]+sum[i];
				min = (min<val[i])?val[i]:min;
			}
			System.out.println("A " + Arrays.toString(sum));
			boolean funciona = true;
			int med = 0;
			while( max > min|| !funciona){
				med = (max + min)/2;
				funciona = true;
				int cont = 0,suma = 0;
				for(int i=0;i<K&&funciona;++i){
					suma += val[i];
					if(suma>med){
						suma =val[i];
						cont++;
					}
					if(cont>M-1)funciona=false;
				}
				if(funciona)max = med;
				else min = med+1;
			}
			tam = med;
			System.out.println(med + " funciona " + funciona);
			
			funciona = true;
			
		}
		System.out.print(new String(sb));
	}
	
	
	
	static boolean  f(int desde , int hasta , int part){
		if(part==0){
			if(sum[desde]+sum[hasta]<=tam)return true;
			return false;
		}
		else{
			if(sum[desde]+sum[hasta]<=tam){
				
			}
			return false;
			
		}
	}
	
	
	
}
/**
 * int div = max / M;
			int suma =0;
			for(int i=0;i<K;++i){
				if(suma > div) {
					if(i+1==K)
						sb.append(val[i]);
					else
					sb.append(val[i] +" / ");
					suma=0;
				}
				else
				{
					suma+=val[i];
					if(i+1==K)
						sb.append(val[i]);
					else
						sb.append(val[i]+" ");
				}
				suma += val[i];
			}
			
			sb.append("\n");
**/
