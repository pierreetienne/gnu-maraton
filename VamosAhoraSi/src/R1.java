public class R1 {

	public static void main(String[] args)throws Exception  {

		System.out.println(stepOnCrack("left", 2));
		System.out.println("------------------------");
		System.out.println(stepOnCrack("right", 3));
		System.out.println("------------------------");
		System.out.println(stepOnCrack("left", 10));
	}

	static String stepOnCrack(String first, int n) {
		String to="0";
		for(int i=0;i<6;++i){
			int size = to.length();
			for(int j=0;j<size;++j){
				to +=(to.charAt(j)=='0')?"1":"0";
			}
		}
		System.out.println(to.substring(0, n+1));
		return to.charAt(n-1)=='0'?first:(first.equals("left")?"right":"left");
	}



}
