import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CF520B {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st=new StringTokenizer(ln);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(f(n,m)-1);
		}

	}
	
	static int f(int n, int m ){
		Queue<Integer> p = new LinkedList<Integer>();
		Queue<Integer> p1 = new LinkedList<Integer>();
		p.add(n);
		p1.add(1);
		while(!p.isEmpty()){
			int a = p.poll();
			int b = p1.poll();
			if(a == m )
				return b;
			if(a<m){
				p.add(a*2);
				p1.add(b+1);
			}
			p.add(a-1);
			p1.add(b+1);
		}
		return -1;
	}

}
