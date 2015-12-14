import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Uva10107 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> num = new ArrayList<Integer>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea ;(linea = bf.readLine())!= null;){
			num.add(Integer.parseInt(linea.trim()));
			Collections.sort(num);
			if(num.size()==1)
				sb.append(num.get(0)+"\n");
			else if(num.size()%2 ==0 ){
				int div = num.size()/2;
				sb.append((int)((num.get(div)+num.get(div-1)) )/2 +"\n");
			}else{
				sb.append(num.get(num.size()/2)+"\n");
			}
		}
		System.out.print(new String(sb));
	}

}
