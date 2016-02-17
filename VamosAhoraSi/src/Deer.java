public class Deer {

	{
		System.out.println("a");
	}
	static{
		System.out.println("b");
	}
	
	public Deer() {
		System.out.print("Deer");
	}

	public Deer(int age) {
		System.out.print("DeerAge");
	}

	private boolean hasHorns() {
		return false;
	}

	public static void main(String[] args) {

		Integer x = 230;
		Integer y = 230;
		System.out.println(x == y);
		
		Boolean a = new Boolean(true);
		Boolean b = new Boolean(true);
		System.out.println(a == b);
		Deer deer = new Reindeer(5);
		//System.out.println("," + deer.hasHorns());

	}

}

class Reindeer extends Deer {

	public Reindeer(int age) {
		super();
		System.out.print("Reindeer");
	}

	public boolean hasHorns() {
		return true;
	}

}

/**
 * 
 * public class Deer {
 * 
 * 2: public Deer() { System.out.print("Deer"); }
 * 
 * 3: public Deer(int age) { System.out.print("DeerAge"); }
 * 
 * 4: private boolean hasHorns() { return false; }
 * 
 * 5: public static void main(String[] args) {
 * 
 * 6: Deer deer = new Reindeer(5);
 * 
 * 7: System.out.println(","+deer.hasHorns());
 * 
 * 8: }
 * 
 * 9: }
 * 
 * 10: class Reindeer extends Deer {
 * 
 * 11: public Reindeer(int age) { System.out.print("Reindeer"); }
 * 
 * 12: public boolean hasHorns() { return true; }
 * 
 * 13: }
 */
