
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ZerosandOnes {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;int casos =1;
		while((linea=bf.readLine())!=null){
			char[] lineab = linea.toCharArray();
			int n = Integer.parseInt(bf.readLine());
			StringBuilder st = new StringBuilder("Case "+(casos++)+":\n");
			while(n-->0){
				String[] aux = bf.readLine().split(" ");
				
				if(Integer.parseInt(aux[0])>Integer.parseInt(aux[1])){
					int desde = Integer.parseInt(aux[1]), hasta = Integer.parseInt(aux[0]);
					boolean encontre = false;
					char ini='-';
					for(int i=desde;i<=hasta&&!encontre;++i){
						if(ini=='-')
							ini=lineab[i];
						if(lineab[i]!=ini){
							encontre=true;
						}
						
					}
					
					if(!encontre)
						st.append("Yes");
					else
						st.append("No");
					
//					String sub = linea.substring(desde,hasta+1);
//					
//					if(sub.indexOf("1")!=-1 && sub.indexOf("0")!=-1)
//						st.append("No");
//					else
//						st.append("Yes");
				}else{
					int desde = Integer.parseInt(aux[0]), hasta = Integer.parseInt(aux[1]);
					boolean encontre = false;
					char ini='-';
					for(int i=desde;i<=hasta&&!encontre;++i){
						if(ini=='-')
							ini=lineab[i];
						if(lineab[i]!=ini){
							encontre=true;
						}
						
					}
					
					if(!encontre)
						st.append("Yes");
					else
						st.append("No");
//					String sub = linea.substring(desde,hasta+1);
//					if(sub.indexOf("1")!=-1 && sub.indexOf("0")!=-1)
//						st.append("No");
//					else
//						st.append("Yes");
				}
				
				if(n-1>=0)
					st.append("\n");
			}
			System.out.println(st.toString());
		}
		
	}

}
