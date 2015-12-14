import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Uva484 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		Scanner in = new Scanner(System.in);
		Queue<Integer> c = new LinkedList<Integer>();
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		while(in.hasNext()){
			int n = in.nextInt();
			if(m.get(n)== null){
				c.add(n);
				m.put(n, 1);
			}else
				m.put(n, m.get(n)+1);
		}
		while(!c.isEmpty()){
			int n = c.poll();
			System.out.println(n+ " "+m.get(n));
		}
	}

}
