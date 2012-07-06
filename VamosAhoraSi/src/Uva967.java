import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva967 {

	static boolean[] primos;
	
	public static void main(String[] args)throws Exception  {
		primos = new boolean[1000008];
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i){
				primos[j]=true;
			}
		}
		boolean[] m = new boolean [1000001];
		for(int i=1;i<m.length;++i){
			if(!primos[i] && !m[i]){
				int[] p = darListaNumeros(i);
				if(p!=null){
					for(int j=0;j<p.length;++j){
						m[p[j]]=true;
					}
				}
			}
		}
		int[] total = new int[1000001];
		for(int i=1;i<m.length;++i){
			if(m[i])
				total[i]+=total[i-1]+1;
			else
				total[i]=total[i-1];
		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea; (linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken());
			if(N==-1)break;
			int M = Integer.parseInt(st.nextToken());
			int cont = total[M]-total[N-1];
			if(cont==0)sb.append("No Circular Primes.\n");
			else if(cont==1)sb.append("1 Circular Prime.\n");
			else sb.append(cont+" Circular Primes.\n");
		}
		System.out.print(new String(sb));
	}
	
	static int[] darListaNumeros(int a ){
		String num = a+"";
		int[] numeros = new int[num.length()];
		for(int i=0;i<numeros.length;++i){
			numeros[i]= Integer.parseInt(num);
			if(primos[numeros[i]])
				return null;
			if(num.length()>1)
				num = num.substring(1)+num.charAt(0);
		}
		return numeros;
	}
}
