import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Uva10245 {
	static double[][] m;
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		while(N != 0){
			m  = new double[N][];
			for(int i=0;i<N;++i){
				StringTokenizer st = new StringTokenizer(bf.readLine());
				m[i]= new double[]{Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken())};
			}
			Arrays.sort(m, new Comparator<double[]>() {
				public int compare(double[] o1, double[] o2) {
					double val = (o1[0]-o2[0]);
					return val>0?1:(val<0)?-1:0 ;
				}
			});
			DecimalFormatSymbols s = new DecimalFormatSymbols();
            s.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("0.0000",s);
            
			double r = closePoints(0,m.length-1);
			double val = 10000.0000;
			if(r <= val)
				//System.out.printf("%.4f\n", r);
				System.out.println(df.format(r));
			else
				System.out.println("INFINITY");
			N = Integer.parseInt(bf.readLine().trim());
		}
	}

	static double closePoints(int inicio,int fin){
		double sol = Double.MAX_VALUE;
		if(inicio>=fin)return sol;
		if(inicio+1==fin)return distancia(inicio, fin); 
		sol = Math.min(closePoints(inicio,(int)Math.floor((inicio+fin)/2)),closePoints((int)Math.floor((inicio+fin)/2)+1,fin));
		int desde =(int)Math.floor((inicio+fin)/2);
		int hasta =(int)Math.floor((inicio+fin)/2)+1;
		for(int i=desde-2;i<=desde;++i)
			if(i>=0)
				for(int j=hasta;j<=hasta+2;++j)
					if(j < m.length)sol = Math.min(sol, distancia(i,j));
		return sol;
	}

	static double distancia(int i, int j){
		return Math.sqrt((m[j][0]-m[i][0])*(m[j][0]-m[i][0]) + (m[j][1]-m[i][1])*(m[j][1]-m[i][1]) );
	}
}
