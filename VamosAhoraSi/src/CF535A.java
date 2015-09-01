import java.io.InputStreamReader;

import java.io.BufferedReader;


public class CF535A {

	public static void main(String[] args)throws Exception {
		String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			String m = "";
			if(n <=19)
				m = numbers[n];
			else if(n<30){
				 m = "twenty";
			}else if(n<40){
				 m = "thirty";
			}else if(n<50){
				 m = "forty";
			}else if(n<60){
				 m = "fifty";
			}else if(n<70){
				 m = "sixty";
			}else if(n<80){
				 m = "seventy";
			}else if(n<90){
				 m = "eighty";
			}else if(n<100){
				 m = "ninety";
			}
			if(n>20){
				m +=((ln.charAt(1)-'0'>0)?"-"+numbers[ln.charAt(1)-'0']:"");
			}
			System.out.println(m);
		}
	}

}
