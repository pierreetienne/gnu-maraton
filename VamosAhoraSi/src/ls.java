import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ls {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea= bf.readLine())!= null;){
			int N = Integer.parseInt(bf.readLine());
			int lastIndex = -1, pos=-1;
			for(int i=0;i<N;++i){
				String p = bf.readLine().trim();
				String aux  = p;
				boolean encontrePatron = true;
				for(int j=0;j<linea.length()&&encontrePatron;++j)
				{
					if(j==0 && linea.charAt(j)!='*'){
						if(p.indexOf(linea.charAt(j))!=0){
							encontrePatron=false;
						}
					}
					else if(j==linea.length()-1 && linea.charAt(j)!='*')
					{
						if(p.charAt(p.length()-1)!=linea.charAt(j)){
							encontrePatron=false;
						}
					}
					else if(linea.charAt(j)!='*')
					{
						int index  = p.indexOf(linea.charAt(j));
						if(lastIndex == -1){
							lastIndex=index-1;
							pos = j;
						}
						else if(pos+1 == j && lastIndex!= index)
						{
							encontrePatron=false;
						}else{
							pos=j;
						}
						
						if(index!=-1 && index+1 < p.length())
						{
							p = p.substring(index+1);
						}
						else{
							encontrePatron=false;
						}
					}else{
						lastIndex=-1;
						pos = -1;
					}
				}
				if(encontrePatron)
					sb.append(aux+"\n");
			}
		}
		System.out.print(new String(sb));
	}
}
