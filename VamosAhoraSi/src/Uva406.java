import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Uva406 {

	public static void main(String[] args) throws Exception{
		boolean[] primos = new boolean[1001];
		primos[0]=true ;primos[1] =false;
		for(int i=2;i*i<primos.length;++i){
			for(int j=i*i;j<primos.length;j+=i)
				primos[j]=true;
		}
		ArrayList<Integer> prim = new ArrayList<Integer>();
		for(int i=0;i<primos.length;++i)if(!primos[i])prim.add(i);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			int cantPrimos=prim.size()-1;
			for(int i=2;i<prim.size();++i)if(prim.get(i) >= N){cantPrimos = i;break;}
			sb.append(N+" "+M+":");
			System.out.println(cantPrimos);
			if(M >= cantPrimos || M*2 >= cantPrimos){
				for(int i=0;i<cantPrimos;++i)if(prim.get(i)<=N)sb.append(" " + prim.get(i) );
			}			
			else if(cantPrimos%2==0)
			{
				M*=2;
				int index = (cantPrimos-M)/2;
				for(int i=0;i<M&&index<prim.size();++i)sb.append(" "+prim.get(index++));
			}
			else
			{
				M = (M*2)-1;
				int index = ((cantPrimos-M)/2);
				for(int i=0;i<M&&index<prim.size();++i)sb.append(" "+prim.get(index++));
			}
			sb.append("\n\n");
		}
		System.out.print(new String(sb.substring(0,sb.length()-1)));
	}

}
