import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class CF381A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[] m = new int[n];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<n;++i){
				m[i]= Integer.parseInt(st.nextToken());
			}
			int suma= 0;
			int sumb = 0;
			int index = 0;
			int maxIndex = n-1;
			boolean x = true;
			while(index<=maxIndex){
				if(m[index]> m[maxIndex]){
					if(x)
						suma+=m[index];
					else 
						sumb+=m[index];
					index++;
					x=!x;
				}else{
					if(x)
						suma+=m[maxIndex];
					else 
						sumb+=m[maxIndex];
					maxIndex--;
					x=!x;
				}
			}
			
			System.out.println(suma +" "+sumb);
		}

	}

}
