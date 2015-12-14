
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BinPacking {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea = "";
		while((linea = bf.readLine())!=null){
			String x[] = linea.split(" ");
			int[] vals = new int[x.length];
			//--->BGC
			for(int i=0;i<x.length;++i){
				vals[i]=Integer.parseInt(x[i]);
			}
			String orden = "BCG";
			//Para BCG
			int v = (vals[3]+vals[6])+(vals[2]+vals[8])+(vals[1]+vals[4]);
			
			//Para BGC
			int v1 = (vals[3]+vals[6])+(vals[1]+vals[7])+(vals[2]+vals[5]);
			if(v1 < v){
				orden="BGC";
				v = v1;
			}
			//Para CBG
			v1 = (vals[5]+vals[8])+(vals[0]+vals[6])+(vals[1]+vals[4]);
			if(v1 < v){
				orden="CBG";
				v = v1;
			}
			
			//Para CGB
			v1 = (vals[5]+vals[8])+ (vals[1]+vals[7])+(vals[0]+vals[3]);
			if(v1 < v){
				orden="CGB";
				v = v1;
			}
			
			//Para GBC
			v1 = (vals[4]+vals[7])+(vals[0]+vals[6])+(vals[2]+vals[5]);
			if(v1 < v){
				orden="GBC";
				v = v1;
			}
			//Para GCB
			v1 = (vals[4]+vals[7])+(vals[2]+vals[8])+(vals[0]+vals[3]);
			if(v1 < v){
				orden="GCB";
				v = v1;
			}
			System.out.println(orden+" " +v);
			
		}
	}

}
