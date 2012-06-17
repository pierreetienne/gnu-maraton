

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

//Accepted
public class Uva579 {

	public static void main(String[] args)throws Exception  {
		double[] anguloHora = new double[721];
		double dx = (double )360/(double)720;
		for(int i=1;i<anguloHora.length;++i){
			anguloHora[i]=anguloHora[i-1]+dx;
		}
		anguloHora[720]=0;

		double[] anguloMinuto = new double[61];
		dx = (double)360/(double)60;
		for(int i=1;i<anguloMinuto.length;++i)
			anguloMinuto[i]=anguloMinuto[i-1]+dx;

		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setMaximumFractionDigits(3);
		nf.setMinimumFractionDigits(3);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea; (linea = bf.readLine())!= null;){
			StringTokenizer st = new StringTokenizer(linea,":");
			int H = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			if(H==0 && M == 0)break;
			double horaAngle = anguloHora[((H*60)+M)%anguloHora.length+(((H*60)+M)/anguloHora.length)];
			double minutoAngle = anguloMinuto[M];
			sb.append(nf.format(Math.min(Math.abs(Math.abs(horaAngle+360)-minutoAngle) , Math.min(Math.abs(horaAngle-minutoAngle) , Math.abs(horaAngle-Math.abs(360+minutoAngle)))))+"\n");
		}
		System.out.print(new String(sb));
	}
}
