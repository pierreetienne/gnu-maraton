
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Blocks {
	public static void main(String[] args)throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		while(!line.equals("quite")){
			
			line = bf.readLine();
		}
	}

}
