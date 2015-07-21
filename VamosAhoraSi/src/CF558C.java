import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class CF558C {
//NO SE
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] val = new int[N];
			int[] countToOne = new int[N];
			StringTokenizer st = new StringTokenizer(in.readLine());
			Set<Integer> d = new TreeSet<Integer>();
			int max = 0;
			int min = Integer.MAX_VALUE;
			for(int i=0;i<N;++i){
				val[i]=Integer.parseInt(st.nextToken());
				Set<Integer> common = new TreeSet<Integer>();
				int value = val[i];
				min = Math.min(min, value);
				max = Math.max(max, value);
				int count = 0;
				while(value!=1){
					if(d.contains(value))
						common.add(value);
					d.add(value);
					value = (int) Math.floor(value/2);
					count++;
				}
				common.add(1);
				countToOne[i]=count;
				if(i!=0)
					d = common;
			}
			int maxCommon = 1;
			for(Integer x: d)
				maxCommon = Math.max(maxCommon, x);
			
			if(maxCommon==1){
				int count = 0;
				for(int i=0;i<N;++i){
					count+= countToOne[i];
				}
				System.out.println(count);
			}else{
				System.out.println(d);
				System.out.println("Max " + max);
				System.out.println("Min "+ min);
				
				int current = maxCommon;
			
				List<Integer> allIn = new ArrayList<Integer>();
				allIn.add(current);
				while(current < max){
					current*=2;
					allIn.add(current);
				}
				System.out.println("allIn " + allIn);
				int mid = allIn.get(allIn.size()/2);
				
				
				int count = 0;
				for(int i=0;i<N;++i){
					if(val[i]>mid){
						count+=(val[i]/mid)/2;
					}else if(val[i]<mid){
						count+=(mid/val[i])/2;
					}
				}
				
				System.out.println(count);
				
				System.out.println("current :: " + current);
				System.out.println("mid " + mid);
			}
			
		}
	}

}
