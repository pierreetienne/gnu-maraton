import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Uva10226 {

	public static void main(String[] args)throws Exception  {
		
		for(int i=0;i<2000000;i++)
			System.out.println("xx" +i);
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		in.nextLine();
		while(N-->0){
			String linea = in.nextLine();
			HashMap<String, Double> cont = new HashMap<String, Double>();
			double c = 0.;
			while(linea != null && linea.length()>0){
				if(cont.get(linea)==null)
					cont.put(linea, 1.);
				else 
					cont.put(linea, cont.get(linea)+1);
				c++;
				if(in.hasNextLine())
					linea = in.nextLine();
				else break;
			}
			String[] m = new String[cont.keySet().size()];
			int pos = 0;
			for(String  x : cont.keySet()){
				m[pos++]=x;
			}
			Arrays.sort(m);
			for(String x: m)
				System.out.printf(x+" %.4f\n",  (double)((cont.get(x)*100.)/c));
			if(N>0)
				System.out.println();
		}
	}

}
