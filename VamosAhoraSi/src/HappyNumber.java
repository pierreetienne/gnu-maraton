
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HappyNumber {

	public static void main(String[] args)throws Exception{
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		boolean happyNumber[] = new boolean[100000000];
		happyNumber[0]=happyNumber[1]=true;
		for(int i=4;i<happyNumber.length;++i){
			int suma = 0 ,cont = 17;
			while(suma!=1 && suma!= i && suma!=4){
				String num = ((suma==0)?i:suma)+"";
				suma=0;
				for(int j=0;j<num.length();++j){
					suma+=Integer.parseInt(num.charAt(j)+"")*Integer.parseInt(num.charAt(j)+"");
				}
				num = suma+"";
			}
			if(suma==1){
				happyNumber[i]=true;
//				System.out.println(i);
			}
		}
		//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//		String linea = null;
		//		while((linea=bf.readLine())!=null){
		//			int n = Integer.parseInt(linea);
		//			
		//		}
	}
}
