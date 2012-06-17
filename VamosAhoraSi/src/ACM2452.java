

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

//Wrong

public class ACM2452
{
	static int[] v;
	
	static int f(double n ){
		int partes = 0;
		for(int i=0;i<v.length;++i)
			partes += (int)((v[i]/n));
		return partes;
	}
	
	public static void main(String[] args)throws Exception  
	{
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		while(C-->0){
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
			v = new int[N];
			double max = 0, min = 0;
			for(int i=0;i<N;++i){
				v[i]= (int) (Double.parseDouble(in.readLine())*100);
				if(max < v[i]) max = v[i];
			}
			max+=1;
			double epsilon = 1e-4, m=0;
			while(Math.abs(max-min)>epsilon){
				m = (double) (min + max)/2.0;
				if(f(m)<K)max = m;
				else min = m;
			}
			
			sb.append(nf.format(min/100)+"\n");
			if(C>0)sb.append("\n");
		}
		System.out.print(new String(sb));
	}
}
