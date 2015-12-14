

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Accepted
public class Uva392 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		StringBuilder sb = new StringBuilder();
		while((linea = in.readLine())!=null){
			StringTokenizer st = new StringTokenizer(linea);
			boolean primero = true;
			for(int i=8;i>=0;--i){
				int n = Integer.parseInt(st.nextToken());
				if(i>=2)
				{
					if(n > 0 ){
						if(primero){
							sb.append(((n>1)?n:"")+"x^"+i);
							primero=false;
						}else{
							sb.append(" + "+((n>1)?n:"")+"x^"+i);
						}
					}else if( n < 0 ){
						if(primero){
							sb.append(((n<-1)?n:"-")+"x^"+i);
							primero=false;
						}else{
							sb.append(" - "+((n<-1)?(n*-1):"")+"x^"+i);
						}
					}
				}
				else if(i==1){
					if(n > 0 ){
						if(primero ){
							sb.append(((n>1)?n:"")+"x");
							primero=false;
						}else{
							sb.append(" + "+((n>1)?n:"")+"x");
						}
					}else if( n < 0){
						if(primero ){
							sb.append(((n<-1)?n:"-")+"x");
							primero=false;
						}else{
							sb.append(" - "+((n<-1)?(n*-1):"")+"x");
						}
					}
				}
				else if(i==0)
				{
					if(n > 0 ){
						if(primero ){
							sb.append(((n>=1)?n:""));
							primero=false;
						}else{
							sb.append(" + "+((n>=1)?n:""));
						}
					}else if( n< 0){
						if(primero ){
							sb.append(((n>=1||n<1)?n:""));
							primero=false;
						}else{
							sb.append(" - "+((n>=1||n<1)?(n*-1):""));
						}
					}else if(n==0){
						if(primero){
							sb.append("0");
							primero=true;
						}
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}
}
