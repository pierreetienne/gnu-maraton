import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva10130 {

	static int[][] obj;
	
	static int[] people;
	
	
	static int f(int p , int w , int o){
		if(p>people.length-1 || w == people[p] || w < 0 )
			return 0;
//		if(w-obj[0][1]>=0)
//			return Math.max(f(p,w-obj[o][1],o),Math.max(f(p,w,o+1),Math.max(a, b))
		return f(p+1,people[p],0);
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			obj = new int[Integer.parseInt(in.readLine())][2];
			for(int i=0;i<obj.length;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				obj[i][0]=Integer.parseInt(st.nextToken());
				obj[i][1]=Integer.parseInt(st.nextToken());
			}
			people = new int[Integer.parseInt(in.readLine())];
			for(int i=0;i<people.length;++i){
				people[i]= Integer.parseInt(in.readLine());
			}
			
		}
	}

}
