
public class RobotHerbDiv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new RobotHerbDiv2().getdist(1, new int[]{1,2,3}));
		System.out.println(new RobotHerbDiv2().getdist(100, new int[]{1}));
		System.out.println(new RobotHerbDiv2().getdist(5, new int[]{1,1,2}));
		System.out.println(new RobotHerbDiv2().getdist(100, new int[]{400000}));

	}
	
	
	public int getdist(int T, int[] a){
		if(a.length ==0)return 0;
		int distancia = 0 ;
		int dir = 0;
		int x=0, y=0;
		while(T-->0){
			for(int i=0;i<a.length;++i){
				switch (dir) {
				case 0:y+=a[i];
					break;
				case 1:x+=a[i];
					break;
				case 2:y-=a[i];
					break;
				case 3:x-=a[i];
					break;
				default:
					break;
				}
//				System.out.println("("+x+","+y+")");
				dir = (dir+a[i])%4;
//				System.out.println(dir);
			}
		}
		distancia = Math.abs(x)+Math.abs(y);
		return distancia;
	}

}
