import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF557A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			int min1 = Integer.parseInt(st.nextToken());
			int max1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int min2 = Integer.parseInt(st.nextToken());
			int max2 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int min3 = Integer.parseInt(st.nextToken());
			int max3 = Integer.parseInt(st.nextToken());
			int cant =min1+min2+min3;
			if(cant == N){
				System.out.println(min1+ " " + min2 +" " + min3);
			}else{
				int por = N - cant;
				if(por >= (max1-min1)){
					por-= (max1-min1);
					min1 = max1;
				}else if(por >0){
					min1 += por; 
					por -= por; 
				}
				if(por >= (max2-min2)){
					por-= (max2-min2);
					min2 = max2;
				}else if(por >0){
					min2 += por; 
					por -= por; 
				}
				if(por >= (max3-min3)){
					por-= (max3-min3);
					min3 = max3;
				}else if(por >0){
					min3 += por; 
					por -= por; 
				}
				System.out.println(min1+ " " + min2 +" " + min3);
			}

		}

	}

}
