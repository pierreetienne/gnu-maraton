
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PrimaryArithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = bf.readLine();
		while(!linea.equals("0 0")){
			String [] aux = linea.split(" ");
			String grande = (aux[0].length()>= aux[1].length())?aux[0]:aux[1];
			String peque = (!aux[1].equals(grande) )?aux[1]:aux[0];
			int[] vg = new int[grande.length()];
			for(int i=0;i<grande.length();++i)
				vg[i]= Integer.parseInt(grande.charAt(i)+"");
			int[] vp = new int[peque.length()];
			for(int i=0;i<peque.length();++i)
				vp[i]= Integer.parseInt(peque.charAt(i)+"");
			
			int carrys = 0 ;int auxj=-1;
			for(int i=vp.length-1, j=vg.length-1;i>=0;--i,--j){
				if(vp[i]+vg[j]>9){
					carrys++;
					if(j-1 >= 0){
						vg[j-1]+=1; 
					}
				}
				auxj=j;
			}
			if(auxj!=-1){
				for(auxj=auxj-1;auxj>=0;--auxj){
					if(vg[auxj]>9){
						carrys++;
						if(auxj-1>=0){
							vg[auxj-1]+=1;
						}
					}
				}
			}
			if(carrys==0)
				System.out.println("No carry operation.");
			else
				System.out.println(carrys+" carry operation"+((carrys==1)?".":"s."));
			linea = bf.readLine();
		}
		
	
	}

}
