import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF459A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			if(x1 == x2 && y1 != y2){
				int d = dist(x1, y1, x2, y2);
				int newX = x1+d>1000?x1-d:x1+d;
				System.out.println(newX+" " + y1 +" " + newX+ " "+y2);
			}else if(y1==y2 && x1!=x2){
				int d = dist(x1, y1, x2, y2);
				int newY = y1+d>1000?y1-d:y1+d;
				System.out.println(x1+" " + (newY)+ " "+ x2 + " "+ (newY));
			}else{
				int d = dist(x1, y2, x1, y1);
				if(d==dist(x2, y1, x2, y2)&& d == dist(x1, y1, x2, y1) && d == dist(x1, y2, x2, y2))
					System.out.println(x1 +" " + y2+ " "+x2+ " " + y1);
				else
				System.out.println("-1");
			}
		}
	}
	
	static int dist(int x1, int y1 , int x2, int y2){
		return (int) Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}

}
