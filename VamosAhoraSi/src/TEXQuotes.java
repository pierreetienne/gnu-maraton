
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TEXQuotes {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		boolean ini = true;
		while((line = bf.readLine())!=null){
			for(int i=0;i<line.length();++i){
				if(line.charAt(i)=='"'){
					if(ini){
						ini=!ini;
						System.out.print("``");
					}else{
						ini=!ini;
						System.out.print("''");
					}
				}else
					System.out.print(line.charAt(i));
			}
			System.out.println();
		}
	}

}
