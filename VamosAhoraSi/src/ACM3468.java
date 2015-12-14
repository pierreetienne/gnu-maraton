

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ACM3468 {

	static byte[] m;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		while(N!=0){
			m=new byte[N];
			boolean hayUnos = false;
			String linea = in.readLine();
			for(int i=0,j=0;i<linea.length();i+=2){
				m[j++]=Byte.parseByte(linea.charAt(i)+"");
				if(m[j-1]==1)
					hayUnos=true;
			}
			if(hayUnos)
			{
				while(m[0]!=1)
				{
					byte aux = m[0];
					for(int i=1;i<m.length;++i)
						m[i-1]=m[i];
					m[m.length-1]=aux;
				}

				List<Integer> h = new ArrayList<Integer>();
				int cont = 0;
				for(int i=0;i<N;++i){
					if(m[i]==1){
						if(cont >0 )
							h.add(cont);
						cont=0;
					}else{
						cont++;
					}
				}
				int res = 0 ;
				if(cont >0 )
					h.add(cont);

				for(int i=0;i<h.size();++i){
					res+= (h.get(i)/2);
				}
				System.out.println(res);
			}
			else{
				System.out.println( (int)Math.ceil((double) N/2));
			}
			
			N = Integer.parseInt(in.readLine());
		}
	}

}
