import java.io.BufferedReader;
import java.io.InputStreamReader;

//Accepted
public class Uva10530 {

	
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder();
		long min = 0, max = Integer.MAX_VALUE;
		boolean dishonest = false;
		for(String linea;(linea = in.readLine())!= null;){
			int N = Integer.parseInt(linea);
			if(N == 0)break;
			String l = in.readLine();
			if(l.equalsIgnoreCase("too high")){
				if(max > N-1)
					max= N-1;
				if(max-min<0)dishonest=true;
			}else if(l.equalsIgnoreCase("too low")){
				if(min < N+1)
				min=N+1;
				if(max-min<0)dishonest=true;
			}else if(l.equalsIgnoreCase("right on")){
				if(max-min<0)dishonest=true;
				if(dishonest|| max < N || min > N)sb.append("Stan is dishonest\n");
				else sb.append("Stan may be honest\n");
				 min = 0; max = Integer.MAX_VALUE;
				 dishonest =false;
			}
		}
		System.out.print(new String(sb));
	}
}
