import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF144A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] values = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			int indexMin = 0, indexMax = 0;
			for(int i=0;i<N;++i){
				values[i]=Integer.parseInt(st.nextToken());
				if(values[indexMin]>=values[i])
					indexMin = i;
				if(values[indexMax]< values[i])
					indexMax = i;
			}
			int cont = (indexMin>indexMax)?(N-indexMin)+(indexMax)-1:(N-indexMin)+(indexMax-1)-1;
//			int min = values[indexMin];
//			int max = values[indexMax];
//			while(values[values.length-1]!=min){
//				int val = values[indexMin];
//				values[indexMin] = values[indexMin+1];
//				values[indexMin+1]=val;
//				if(indexMin+1==indexMax)
//					indexMax--;
//				indexMin++;
//				cont++;
//			}
//			while(values[0]!=max){
//				int val = values[indexMax];
//				values[indexMax]= values[indexMax-1];
//				values[indexMax-1]=val;
//				indexMax--;
//				cont++;
//			}
			System.out.println(cont);
			
		}
	}

}
