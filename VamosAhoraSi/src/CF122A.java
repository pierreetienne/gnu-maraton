import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CF122A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> luck = new ArrayList<Integer>();
		for(int i=0;i<8;++i){
			String b = Integer.toBinaryString(i);
			String num = "";
			for(int j=0;j<b.length();++j){
				num = (b.charAt(j)=='0'?"4":"7")+num;
			}
			luck.add(Integer.parseInt(num));
		}
		
		for(String ln;(ln = in.readLine())!=null;){
			int value = Integer.parseInt(ln);
			boolean found = false;
			for(int i=0;i<luck.size()&&!found;++i){
				if(luck.get(i).intValue()== value|| value %luck.get(i).intValue() == 0)
					found = true;
			}
			if(found)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
	}

}
