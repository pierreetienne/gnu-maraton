import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF479A {
	
	static int[] values;
	
	static int f(int val,boolean x, int index ){
		if(index>=values.length)return val;
		if(x)
			return Math.max(f( val * values[index] , true , index+1), f( val * values[index] , false , index+1))  ;
		else 
			return Math.max( f( val + values[index] , true , index+1),f( val + values[index] , false , index+1)) ;
			
	}
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			values = new int[3];
			values[0]=Integer.parseInt(ln);
			values[1]=Integer.parseInt(in.readLine());
			values[2]=Integer.parseInt(in.readLine());
			//System.out.println(Math.max(f(0, false,0),f(1,true,0)));
			int max = Math.max(values[0]+values[1]+values[2], values[0]*(values[1]+values[2]));
			max = Math.max(max, values[0]*values[1]*values[2]);
			max = Math.max(max, (values[0]+values[1])*values[2]);
			System.out.println(max);
		}
	}

}
