import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EdxWeek1H {

	public static void main(String[] args)throws Exception  {
		System.setIn(new FileInputStream("win.in"));
		System.setOut(new PrintStream("win.out"));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N=Integer.parseInt(ln);
			int[] times=new int[N];
			StringTokenizer st=new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				times[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(times);
			int fullTime=300*60;
			int cont=0;
			for(int i=0;i<N;++i){
				fullTime-=times[i];
				if(fullTime>0)
					cont++;
			}
			System.out.println(cont);
		}
	}

}
