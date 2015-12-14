import java.util.ArrayList;
import java.util.Scanner;

public class Uva10364 {
	static int M;
	static ArrayList<Integer> sol;
	static byte mem[][][];
	static boolean f(int A,int j,int i) {
		if(i==4)return A==(1<<M)-1;
		if(j==sol.size())return false;
		if(mem[A][j][i]!=0)return mem[A][j][i]==1;
		boolean ws=f(A,j+1,i);
		if(!ws&&(A&sol.get(j))==0)
			ws=f(A|sol.get(j),j+1,i+1);
		mem[A][j][i]=ws?(byte)1:(byte)2;
		return ws;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (N-- > 0) {
			M = sc.nextInt();
			int info[] = new int[M];
			int s=0;
			for(int i=0;i<M;++i)
				s+=(info[i] = sc.nextInt());
			if(s%4==0) {
				sol=new ArrayList<>();
				for(int i=0;i<1<<M;i++) {
					int sum=0;
					for(int j=0;j<M;j++)
						if((i&(1<<j))!=0)
							sum+=info[j];
					if(sum==s/4)sol.add(i);
				}
				System.out.println(sol.size());
				mem=new byte[1<<M][sol.size()][4];
				System.out.println(f(0,0,0));
			}
			else System.out.println("no");
		}
		System.out.print(new String(sb));
	}
}
