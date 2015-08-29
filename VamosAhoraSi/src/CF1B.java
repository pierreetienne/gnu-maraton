import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CF1B {

	
	static char[] letters = new char[26];
	public static void main(String[] args) throws Exception {
		for(int i=0;i<letters.length;++i){
			letters[i]=(char) ('A'+i);
		}

		for(int i=1;i<100;++i){
			
			String num = numToColumn(i);
			int va = 0;
			if((va=columnToNum(num))!=i)
			{
				System.out.println(i + " paila " + num + "  v  a " + va );
			}
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			for(int i=0;i<n;++i){
				String line = in.readLine();
				String chars = "";
				String chars2 = "";
				String num1="";
				String num2="";
				boolean num = false;
				for(int j=0;j<line.length();++j){
					if(Character.isLetter(line.charAt(j)) &&!num){
						chars+=line.charAt(j);
					}else if(Character.isLetter(line.charAt(j))&&num){
						chars2+=line.charAt(j);
					}else if(Character.isDigit(line.charAt(j))){
						if(chars2.isEmpty()){
							num1+=line.charAt(j);
						}else{
							num2+=line.charAt(j);
						}
						num=true;
					}
				}

				if(chars2.isEmpty()){
					System.out.println("R"+num1+"C"+columnToNum(chars));
				}else{
					System.out.println(numToColumn(Integer.parseInt(num2))+num1);
				}

			}
		}
	}

	static int columnToNum(String column){
		int value = 1;
		column = column.toUpperCase();
		if(column.length()>1){
			for(int i=0;i<column.length();++i){
				int v = (column.charAt(i)-'A')+26;
//				System.out.println("V " + v + "  co " + column.charAt(i));
				
				if(i+1==column.length())
					value+=column.charAt(i)-'A'+1;
				else
					value*=v;
			}
		}else
			value =( column.charAt(0)-'A')+1;
		return value;
	}

	static String numToColumn(int num ){
		String s = "";
		if(num < letters.length)
			s = letters[num-1]+"";
		else{
			while(num>0){
				if(num%letters.length==0){
					s=letters[letters.length-1]+s;
					num = (num/letters.length)-1;
				}else{
					s = letters[(num%letters.length)-1]+s;
					num/=letters.length;
				}
			}
		}
		return s;
	}
}
