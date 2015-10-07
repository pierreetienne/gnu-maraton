import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CF320A {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			boolean ok = true;
			for(int i=0;i<ln.length()&&ok;++i){
				if(i==0 &&  ln.charAt(i) !='1'){
					ok=false;
				}else if(i>0){ 
					if(ln.charAt(i-1)=='1' && ln.charAt(i)=='1'){
						continue;
					}else if(ln.charAt(i-1)=='1' && ln.charAt(i)=='4'){
						continue;
					}else if(ln.charAt(i-1)=='4' && ln.charAt(i)=='4'){
						if( i+1<ln.length()){
							if(  ln.charAt(i+1)=='1')
								continue;
							else
								ok = false;
						}else
							continue;
					}else if(i-2>=0 &&ln.charAt(i-2)=='4'  &&ln.charAt(i-1)=='4' && ln.charAt(i)=='1'){
						continue;
					}else  if(i-2>=0 &&ln.charAt(i-2)=='1'  &&ln.charAt(i-1)=='4' && ln.charAt(i)=='1'){
						continue;
					}
					else{
						ok = false;
					}
				}
			}
			System.out.println(ok?"YES":"NO");
		}


	}

}
