import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Accepted
public class Uva147 {
	
	static int[] monedas = {5,10,20,50,100,200,500,1000,2000,5000,10000};
	
	static long[][] memo ;
	
	static int N;
	
	static long f(int t , int v ){
		if(v==0)return 1;
		if(v<0)return 0;
		if(t>=monedas.length)return 0;
		if(memo[t][v]!=-1)return memo[t][v];
		return memo[t][v] = f(t+1,v)+f(t,v-monedas[t]);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		memo=new long[12][300001];
		for(int i=0;i<memo.length;++i)Arrays.fill(memo[i], -1);
		for(int i=0;i<30000;++i)f(0,i);
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea=bf.readLine())!=null;){
			linea = linea.trim();
			N = (int) (Double.parseDouble(linea)*100+1e-10);
//			N = (int) (Double.parseDouble(linea)*20+0.5);
			if(N==0)break;
			String val = f(0,N)+"";
			for(int i=linea.length();i<6;++i)sb.append(" ");
			sb.append(linea);
			for(int i=val.length();i<17;++i)sb.append(" ");
			sb.append(val);
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
