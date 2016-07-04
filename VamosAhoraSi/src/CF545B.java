import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CF545B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			String a = ln;
			String b = in.readLine();
			int count = 0;
			int sumA = 0;
			int sumB = 0;
			char[] fin = new char[a.length()];
			List<Integer> pos = new ArrayList<Integer>();
			for(int i=0;i<a.length();++i){
				if(a.charAt(i)!=b.charAt(i)){
					count++;
					if(sumA<=sumB){
						fin[i]=(a.charAt(i)=='0')?'1':'0';
						sumA++;
					}else{
						fin[i]=(b.charAt(i)=='0')?'1':'0';
						sumB++;
					}
				}else{
					fin[i]=a.charAt(i);
					pos.add(i);
				}
			}
			if(sumA!=sumB)
				System.out.println("impossible");
			else if(sumA < count){
				if(count-(sumA+sumB) <= pos.size()){
					for(int i=0;i<(count-(sumA+sumB));++i){
						fin[pos.get(i)]=fin[pos.get(i)]=='0'?'1':'0'; 
					}
					System.out.println(new String(fin));
				}else{
					System.out.println("impossible");
				}
			}else if(sumA == count){
				System.out.println(new String(fin));
			}
		}
	}
}
