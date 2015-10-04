import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CF534A {

	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			
			int[] m = new int[N];
			int max = N;
			int min = 1;
			for(int i=0;i<N;++i){
				if(i%2==0){
					m[i]=min;
					min++;
				}else{
					m[i]=max;
					max --;
				}
			}

			StringBuilder sb = new StringBuilder();
			if(N>3){
				while(!validate(m)){
					
					for(int i=0;i<N-1;++i){
						if(Math.abs(m[i]-m[i+1])==1){
							int index = -1;
							for(int j=0;j<N&&index==-1;++j){
								if(Math.abs(m[i]-m[j])>1)
									index =j;
							}
							if(index!=-1){
								int aux = m[i];
								m[i]=m[index];
								m[index]=aux;
							}
						}
					}
				}
				for(int i=0;i<m.length;++i){
					if(i==0)
						sb.append(m[i]);
					else
						sb.append(" "+m[i]);
				}
			}else if(N==3){
				N=2;
				sb.append("1 3");
			}else if(N==2||N==1){
				N=1;
				sb.append("1");
			}

			System.out.println(N);
			System.out.println(new String(sb));

		}

	}


	static boolean validate(int[] m ){
		for(int i=0;i<m.length-1;++i){
			if(Math.abs(m[i]-m[i+1])==1)
				return false;
		}
		return true;
	}

}
