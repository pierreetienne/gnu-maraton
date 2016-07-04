import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CF352A {

	public static void main(String[] args)throws Exception  {
		//		System.out.println(55555550%90);
		//		System.out.println("5505055555500///" + (5000055555555l%90));
		//		for(int i=50000000;i<1200000000;++i){
		//			String y = Integer.toBinaryString(i);
		//			String num = y.replaceAll("1","5");
		//			BigInteger superNumero = new BigInteger(num);
		//			
		//			if(superNumero.mod(BigInteger.valueOf(90)).equals(BigInteger.valueOf(0))){
		//				int cant5 = 0;
		//				String s = superNumero.toString();
		//				for(int p=0;p<s.length();++p){
		//					if(s.charAt(p)=='5')
		//						cant5++;
		//				}
		//				
		//				System.out.println("i:"+i+" y:"+ y  + " - " + superNumero + " es " + (superNumero.mod(BigInteger.valueOf(90)))+ " cant5 : " + cant5 + " cant0s: " + (superNumero.toString().length()-cant5));
		//				Thread.sleep(200);
		//			}
		//		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N = Integer.parseInt(ln);
			int[] cant = new int[2];
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i=0;i<N;++i){
				cant[Integer.parseInt(st.nextToken())/5]++;
			}
			if(cant[0]>0 && cant[1]>=9){
				BigInteger a = new BigInteger("0");
				String s = "";
				while(cant[1]%9!=0){
					cant[1]--;
				}

				for(int i=0;i<cant[1];++i){
					s+="5";
				}
				for(int i=0;i<cant[0];++i){
					s+="0";
				}
				String inicial = s;
				char[] aux = s.toCharArray();
				BigInteger num = new BigInteger(s);
				int index = s.length()-1;
				while(!num.mod(BigInteger.valueOf(90)).equals(BigInteger.ZERO)){
					if(index-1>=0){
						if(index==0)
							index = s.length()-1;
						char x = aux[index];
						aux[index]= aux[index-1];
						aux[index-1]=x;
						index--;
					}
					String o = new String(aux);
					if(o.equals(inicial))break;
					num = new BigInteger(o);
				}
				System.out.println(num);
			}else{
				if(cant[0]>0){
					System.out.println(0);
				}else{
					System.out.println(-1);
				}
			}
		}
	}
}
