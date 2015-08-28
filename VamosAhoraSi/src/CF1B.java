import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;


public class CF1B {

	
	static Map<Integer, Character> letters ;
	
	public static void main(String[] args) throws Exception {
		for(int i=0;i<=5000;++i){
			String num = numToColumn(i);
		}

		System.out.println("fin");
		
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
		Stack<Character> n = new Stack<Character>();
		n.push('A');
		/**
		 * suma
		 */
		int dif = Math.abs(num);

		int llevo =0;
		for(int j=0;j<n.size();++j){
			int d = 'Z'-n.get(j).charValue();
			if(llevo==0 ){
				if(d >= dif){
					n.set(j,(char)(n.get(j)+dif));
					dif=0;
				}else{
					int diferencia = dif-d-1;
					while(diferencia+'A'>'Z'){
						diferencia-= d+1;
						llevo++;
						System.out.println("asdasdasd");
					}
					n.set(j,(char)(('A'+diferencia)));
					llevo++;
					n.push('A');
				}
			}else{
			}
		}
		System.out.println(num+ " *** " +print( n));
		//		System.out.println( num+ " Arrays: " + n +" mas " + dif );
		return new String();
	}
	
	
	static String print(Stack<Character> s ){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		while(!s.isEmpty()){
			sb.append(s.pop()+",");
		}
		sb.append("}");
		return new String(sb);
	}
}
