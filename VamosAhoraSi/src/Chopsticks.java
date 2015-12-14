

public class Chopsticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Chopsticks().getmax(new int[]{5,5}));
		System.out.println(new Chopsticks().getmax(new int[]{1,2,3,2,1,2,3,2,1}));
		System.out.println(new Chopsticks().getmax(new int[]{1}));
		System.out.println(new Chopsticks().getmax(new int[]{1,2,3,4,5,6,7,8,9}));
		System.out.println(new Chopsticks().getmax(new int[]{35,35,35,50,16,30,10,10,35,50,16,16,16,30,50,30,16,35,50,30,10,50,50,16,16,
				10,35,50,50,50,16,35,35,30,35,10,50,10,50,50,16,30,35,10,10,30,10,10,16,35}));

	}
	
	public int getmax(int[] length){
		int[] m = new int [101];
		for(int i=0;i<length.length;++i)
			m[length[i]]++;
		int cont = 0;
		for(int i=0;i<m.length;++i){
			cont+=m[i]/2;
		}
		return cont;
	}

}
