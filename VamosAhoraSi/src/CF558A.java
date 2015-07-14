import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class CF558A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N= Integer.parseInt(ln);
			int[][] info = new int[N][];
			int total = 0;
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				info[i]=new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
				total+=info[i][1];
			}
			Arrays.sort(info, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0]-o2[0];
				}
			});
			
			int min = 0;
			int max = 0;
			int indexL = 0;
			int indexR = info.length-1;
			
			
			for(int i=0;i<info.length;++i){
				if(info[i][0]>0)
					max++;
				else if(info[i][0]<0)
					min++;
				
				if(info[i][0] < 0 &&  info[i][0]>=info[indexL][0]){
					if(info[i][0]== info[indexL][0]){
						if(info[i][1]>info[indexL][1])
							indexL = i;
					}else{
						indexL = i;
					}
				}
				
				if(info[i][0]>0 && info[i][0]<=info[indexR][0]){
					if(info[i][0]== info[indexR][0]){
						if(info[i][1]>info[indexR][1])
							indexR = i;
					}else{
						indexR = i;
					}
				}
				
			}
			
			LinkedList<int[]> algo = new LinkedList<int[]>();
			for(int[] x : info)
				algo.add(x);
			
			if(min > max ){
				int count = 0;
				int i = indexL;
				int dir = 0;
				while(i<algo.size() && i>=0){
					count+=algo.get(i)[1];
					algo.remove(i);
					if(dir == 0){
						dir = 1;
					}else{
						dir = 0;
						i--;
					}
				}
				
				System.out.println(count);
			}else if(max > min){
				int count = 0;
				int i = indexR;
				int dir = 0;
				while(i<algo.size() && i>=0){
					count+=algo.get(i)[1];
					algo.remove(i);
					if(dir == 0){
						dir = 1;
						i--;
					}else{
						dir = 0;
					}
				}
				System.out.println(count);
				
			}else
				System.out.println(total);

			
		}

	}

}
