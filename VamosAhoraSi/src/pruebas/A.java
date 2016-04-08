package pruebas;

public class A {

	static int hailstoneLength(int l) {
	    int size = 0;
	    while(l>1){
	        if(l%2!=0)
	            l = (3*l)+ 1;
	        else
	            l = l/2;
	        size++;
	    }
	    return size;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(hailstoneLength(8));
	}
}
