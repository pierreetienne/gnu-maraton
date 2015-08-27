import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CF1B {

	public static void main(String[] args) throws Exception {
		//		int cont = 0;
		//		List<String> l = new ArrayList<String>();
		//		for(int i='A';i<='Z';++i){
		//			for(int j='A';j<='Z';++j){
		//				System.out.println((char)(i) +""+(char)(j));
		//				l.add((char)(i) +""+(char)(j));
		//				cont++;
		//			}
		//		}
		int otro =0;
		for(int i=1;i<=17603;++i){
			String num = numToColumn(i);
//			System.out.println("i " + i + "  num  " + num);
			if(i>=26&& i<=675)
				otro++;
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

				}

			}
		}
	}

	static int columnToNum(String column){
		int value = 0;
		column = column.toUpperCase();
		if(column.length()>1){
			for(int i=0;i<column.length();++i){
				int v = (column.charAt(i)-'A')+1;
				if(i+1==column.length())
					value+=v;
				else
					value+=v*26;
			}
		}else
			value =( column.charAt(0)-'A')+1;
		return value;
	}

	static String numToColumn(int num ){
		char[] n = null;
		int val = 1;
		int cont = 0;
		while(val*26 <=num ){
			cont++;
			val *=26;
		}
		n = new char[Math.max(cont,1)];
		for(int i=0;i<n.length;++i)
			n[i]='A';

		n = sum(Math.abs(val-num), n);
		System.out.println(Math.abs(val-num)+"  "+num +" B>> " +  Arrays.toString(n));
		return new String(n);
	}

	static char[] sum(int diff , char[] n){
		int llevo = 0;
		for(int j=n.length-1;j>=0;--j){
			if(j==n.length-1){
				int value = n[j]-'A';
				n[j]=(char) (( (value+diff)%26)+'A');
				llevo= Math.abs(value+diff)/26;
			}
//			else if(llevo!=0){
//				int value = n[j]-'A';
//				n[j]=(char) (( (value+llevo)%26)+'A');
//				llevo= ((value+llevo)>=26)?1:0;
//			}
		}
		return n;
	}


	static char[] rest(int diff , char[] n){
		int llevo = 0;
		for(int j=n.length-1;j>=0;--j){
			if(j==n.length-1){
				int value = n[j]-'A';
				int xx = (value-diff);
				if(xx < 0){
					xx = 26+xx;
					llevo = 1;
				}
				n[j]=(char) ((xx %26)+'A');
				//		llevo= (xx>=26)?1:0;
			}else if(llevo!=0){
				int value = n[j]-'A'; 
				int xx = (value-llevo);
				if(xx < 0){
					xx = 26+xx;
					llevo = 1;
				}
				n[j]=(char) (( xx%26)+'A');
			}
		}
		return n;
	}


}
