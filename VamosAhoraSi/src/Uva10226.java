import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

//runtime
public class Uva10226 {
	static TreeMap<String, Integer> cont = new TreeMap<String, Integer>();
	public static void main(String[] args)throws Exception  {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		in.nextLine();
		while(N-->0){
			String linea = in.nextLine();
			double c = 0.;
			while(linea != null && linea.length()>0){
				if(cont.get(linea)==null)
					cont.put(linea, 1);
				else 
					cont.put(linea, cont.get(linea)+1);
				c++;
				if(in.hasNextLine())
					linea = in.nextLine();
				else break;
			}
			for(String  x : cont.keySet()){
				System.out.printf(Locale.US,x+" %.4f\n",  (double)((cont.get(x)*100.)/c));
			}
			if(N>0)
				System.out.println();
			cont.clear();
		}
	}

}
