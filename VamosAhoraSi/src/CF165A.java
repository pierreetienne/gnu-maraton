import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF165A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln);
			int[][] points = new int[n][2];
			for(int i=0;i<n;++i){
				StringTokenizer st = new StringTokenizer(in.readLine());
				int a = Integer.parseInt(st.nextToken())+1000;
				int b = Integer.parseInt(st.nextToken())+1000;
				points[i][0]=a;
				points[i][1]=b;
			}
			boolean[][] cont = new boolean[n][4];
			int res = 0;
			for(int i=0;i<n;++i){
				int[] c = points[i];
				for(int j=0;j<n;++j){
					if(i!=j){
						int[] o = points[j];
						if(o[0]>c[0] && o[1]==c[1])
							cont[i][0]=true;
						else if(o[0]<c[0]&&o[1]==c[1])
							cont[i][1]=true;
						else if(o[0]==c[0]&&o[1]<c[1])
							cont[i][2]=true;
						else if(o[0]==c[0]&&o[1]>c[1])
							cont[i][3]=true;

						else if(c[0]>o[0]&&c[1]==o[1])
							cont[j][0]=true;
						else if(c[0]<o[0]&&c[1]==o[1])
							cont[j][1]=true;
						else if(c[0]==o[0]&&c[1]<o[1])
							cont[j][2]=true;
						else if(c[0]==o[0]&&c[1]>o[1])
							cont[j][3]=true;
					}
				}
				if(cont[i][0]&& cont[i][1]&& cont[i][2]&& cont[i][3])
					res++;
			}
			System.out.println(res);
		}
	}

}
