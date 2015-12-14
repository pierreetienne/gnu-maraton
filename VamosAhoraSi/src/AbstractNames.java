
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AbstractNames {

	public static void main(String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		while((linea = bf.readLine())!= null){
			int n = Integer.parseInt(linea);
			while(n-->0){
				String p1 = bf.readLine();
				String p2 = bf.readLine();
				
				if(p1.length()==p2.length()){
					boolean encontre = true;
					for(int i=0;i<p1.length()&&encontre;++i){
						if(p1.charAt(i)!= p2.charAt(i) && isVocal(p1.charAt(i)) && isVocal(p2.charAt(i))){
							//va bien 
						}else if(p1.charAt(i)!= p2.charAt(i))
							encontre=false;
					}
					if(encontre)
						System.out.println("Yes");
					else
						System.out.println("No");
					
				}else{
					System.out.println("No");
				}
			}
		}
	}
	
	public static boolean isVocal(char a){
		return (a=='a'||a=='e'||a=='i'||a=='o'||a=='u');
	}

}
