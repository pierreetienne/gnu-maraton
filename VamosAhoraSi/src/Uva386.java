import java.util.ArrayList;


public class Uva386 {

	
	static int existeRaizCubica(int val ){
		for(int i=0;i<=200;++i){
			int vals = i*i*i;
			if(vals>val )
				return -1;
			else if(vals == val)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		ArrayList<String>[] data = new ArrayList[201];
		for(int i=0;i<data.length;++i)
			data[i] = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<201;i++){
			int valI = i*i*i;
			for(int j=i+1;j<201;++j){
				int valJ  = j*j*j;
				for(int p=j+1;p<201;++p){
					int valP=p*p*p;
					int op = existeRaizCubica(valI+valJ+valP);
					if(op<= 200 && op!= -1)
						data[op].add("("+i+","+j+","+p+")");
				}
			}
		}
		for(int i=1;i<data.length;++i){
				for(int j=0;j<data[i].size();++j){
					sb.append("Cube = "+i+", Triple = "+data[i].get(j)+"\n");
				}
		}
		System.out.print(new String(sb));
	}

}
