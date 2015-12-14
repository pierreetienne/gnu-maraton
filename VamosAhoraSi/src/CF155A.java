import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF155A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[] values = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			int min = -1;
			int max = -1;
			int cont = 0;
			for(int i=0;i<n;++i){
				values[i]=Integer.parseInt(st.nextToken());
				if(i==0){
					min = values[0];
					max = values[0];
				}else{
					if(values[i-1]<values[i]&& values[i]>max){
						cont++;
						max = values[i];
					}else if(values[i-1]>values[i]&& values[i]<min){
						cont++;
						min = values[i];
					}
				}
			}
			System.out.println(cont);
		}
	}

}
