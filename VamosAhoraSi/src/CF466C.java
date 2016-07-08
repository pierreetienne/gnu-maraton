import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CF466C {

	static long arr[];
	public static void main(String[] args)throws Exception  {
//		List<Integer> list = Arrays.asList(1,5,7,9,21,45,56,78,88,90);
//		System.out.println(list.size());
//		System.out.println("->" + Collections.binarySearch(list, 3));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!= null;){
			int N = Integer.parseInt(ln);
			StringTokenizer st = new StringTokenizer(in.readLine());
			arr = new long[N];
			long sum = 0;
			for(int i=0;i<N;++i){
				long val =Long.parseLong(st.nextToken());
				sum+=val;
				arr[i]=val;
			}
			if(sum%3 == 0){
				long parts = sum/3;
				List<Integer> sumLeft = new ArrayList<Integer>();
				List<Integer> sumRight = new ArrayList<Integer>();
				long last = 0;
				for(int i=0;i<N;++i){
					last += arr[i];
					if(last== parts){
						sumLeft.add(i);
					}
				}
				last = 0;
				for(int i=N-1;i>=0;--i){
					last += arr[i];
					if(last== parts){
						sumRight.add(i);
					}
				}
				Collections.sort(sumRight);
				long cont = 0;
				for(int i=0;i<sumLeft.size();++i){
					int index = Collections.binarySearch(sumRight,sumLeft.get(i)+1 );
					if(index<0)
						index = (index*-1)-1;
					else
						index++;
//					System.out.println("Busco " + (sumLeft.get(i)+1) + " encuentro en " + index + " sumRight " + sumRight + " sumLeft " +sumLeft);
					cont += sumRight.size()-(index);
					
				}
				System.out.println(cont);
			}else{
				System.out.println(0);
			}
		
		}
	}
	
	static long suma(int desde , int hasta){
		long val =0;
		if(desde==0)val = arr[hasta];
		else if(desde == hasta)val = arr[desde]-arr[desde-1];
		else val = arr[hasta]-arr[desde-1];
//		System.out.println(Arrays.toString(arr) +" desde " + desde + " hasta "+ hasta + " val " +val);
		return val;
	}
}
