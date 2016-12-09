import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prueba2 {

	public static void main(String[] args)throws Exception {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        while(N-->0){
            StringTokenizer st = new StringTokenizer(in.readLine());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
            int inside = 0;
            for(int i=0;i<63;++i){
            	long p = 1l << i;
            	if(p>a && p<=b)
            		inside++;
            }
            long res = a;
            if(inside==0){
            	for(long i=a,j=0;i<=b&&j<100;j++,i++)
            		res&=i;
            }
            System.out.println(inside==0?res&b:0);
        }
		
	}

}
