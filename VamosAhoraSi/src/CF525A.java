import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF525A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			char[] line = in.readLine().toCharArray();
			int[] keys = new int[28];
			int min = 0;
			for(int i=0;i<line.length;++i){
				if(Character.isUpperCase(line[i])){
					if(keys[Character.toLowerCase(line[i])-'a']>0){
						keys[Character.toLowerCase(line[i])-'a']--;
					}else{
						min++;
					}
				}else{
					keys[line[i]-'a']++;
				}
			}
			System.out.println(min);
		}

	}

}
