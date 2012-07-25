
public class Uva10303 {

	static int f(int n ){
		if(n == 1||n==2)return n;
		return 0;
	}
	public static void main(String[] args) {
		for(int i=1;i<10;++i)
			System.out.println(f(i) + " i: " + i);
	}

}
