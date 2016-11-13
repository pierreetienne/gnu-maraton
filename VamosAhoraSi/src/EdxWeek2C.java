import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;
import java.util.StringTokenizer;

public class EdxWeek2C {
	
	public static void main(String[] args)throws Exception  {
		System.setIn(new FileInputStream("queuemin.in"));
//		System.setIn(new FileInputStream("out.out"));
		System.setOut(new PrintStream("queuemin.out"));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N=Integer.parseInt(ln);
			Stack<Integer> sOld=new Stack<>();
			Stack<Integer> sOldMin = new Stack<>();
			Stack<Integer> sNew=new Stack<>();
			Stack<Integer> sNewMin = new Stack<>();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<N;++i){
				ln=in.readLine();
				StringTokenizer st=new StringTokenizer(ln);
				String token=st.nextToken();
				if(token.equals("+")){
					int val=Integer.parseInt(st.nextToken());
					if(sNew.isEmpty()){
						sNew.add(val);
						sNewMin.add(val);
					}else{
						sNew.add(val);
						sNewMin.add(Math.min(sNewMin.peek(), val));
					}
					
				}else if(token.equals("-")){
					if(sOld.isEmpty()){
						while (!sNew.isEmpty()) {
							int value=sNew.pop();
							sNewMin.pop();
							if(sOld.isEmpty()){
								sOld.push(value);
								sOldMin.push(value);
							}else{
								sOld.push(value);
								int min = Math.min(sOldMin.peek(), value);
								sOldMin.push(min);
							}
						}
					}
					sOld.pop();
					sOldMin.pop();
				}else{
				
					int min= Math.min(
							   sOldMin.size()==0?
							     Integer.MAX_VALUE:sOldMin.peek(),
							   sNewMin.size()==0?
							     Integer.MAX_VALUE:sNewMin.peek()
							        );
					sb.append(min).append("\n");
				}
			}
			System.out.print(new String(sb));
		}
	}

}
