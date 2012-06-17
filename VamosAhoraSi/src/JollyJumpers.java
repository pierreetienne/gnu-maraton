
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class JollyJumpers {
	public static void main(String[] args) throws Exception{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		while((linea=bf.readLine())!=null){
			String[] aux = linea.split(" ");
			int[][] values = new int [ Integer.parseInt(aux[0])][2];
			for(int i=0;i<values.length;++i){
				values[i][0]=Integer.parseInt(aux[i+1]);
			}
			boolean encontre = false;
			for(int i=1;i<values.length&&!encontre;++i){
				int resta = Math.abs(values[i-1][0]-values[i][0]);
				if(resta > values.length-1)
					encontre=true;
				else if(values[resta][1]!=0){
					encontre=true;
				}
				else{
					values[resta][1]=1;
				}
			}
			if(!encontre){
				int cont = 0;
				for(int i=0;i<values.length;++i){
					if(values[i][1]!=0)
						cont++;
				}
				if(cont!=(values.length-1))
					encontre=true;
			}
			if(!encontre)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		
		}
	}

}
