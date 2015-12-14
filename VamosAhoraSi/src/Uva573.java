import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Uva573 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea);
			int H = Integer.parseInt(st.nextToken())*100, U =Integer.parseInt(st.nextToken())*100,D = Integer.parseInt(st.nextToken())*100,F=Integer.parseInt(st.nextToken());
			if(H==0)break;
			int fin=0,dias = 0;
			F = U*F;
			while(fin<=H&&fin>=0)
			{
				fin+=U;
				U = U-F;
				if(U<0)U=0;
				if(fin<=H)fin-=D;
				dias++;
			}
			if(fin > H )
				sb.append("success on day "+dias+"\n");
			else
				sb.append("failure on day "+dias+"\n");

		}
		System.out.print(new String(sb));
	}

}
