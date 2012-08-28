import java.util.ArrayList;
import java.util.Scanner;


public class Uva105 {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] inicial = null;
		ArrayList<Integer> s = new ArrayList<Integer>();
		while(sc.hasNext()){
			if(inicial==null)
				inicial = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt() };
			else 
			{
				int[] a = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt() };
				int[] res=null;// union(inicial, a);
				if(res == null){
					s.add(inicial[0]);
					s.add(inicial[1]);
					s.add(inicial[2]);
					inicial= a;
				}
				else
				{
					inicial = res;
				}
				
			}
		}
	}
	
//	static int[] union (int[] a, int[] b){
//		if(a[0]<= b[0] && b[0]<= a[2]){
//			
//		}
//	}

}
