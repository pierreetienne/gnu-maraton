import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF489C {

	static int m, s;
	static String[][] memo1 ,memo2;
	public static void main(String[] args)throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(ln);
			memo1 = new String[101][901];
			memo2 = new String[101][901];
			m = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			System.out.println(f(0,0) + " " + fmax(0, 0));
		}
	}

	static String f(int l , int sum){
		if(l==m && sum==s)
			return "";
		else if(l>m || sum>s){
			return null;
		}else{
			if(memo1[l][sum]!=null)
				return memo1[l][sum];
			String res = null;
			for(int i=(l==0)?1:0;i<10;++i){
				res = f(l+1,sum+i);
				if(res != null){
					res = i+""+res;
					break;
				}
			}
			return memo1[l][sum]=res;
		}
	}
	
	static String fmax(int l , int sum){
		if(l==m && sum==s)
			return "";
		else if(l>m || sum>s){
			return null;
		}else{
			if(memo2[l][sum]!=null)
				return memo2[l][sum];
			String res = null;
			for(int i=9;i>=((l==0)?1:0);--i){
				res = fmax(l+1,sum+i);
				if(res != null){
					res = i+""+res;
					break;
				}
			}
			return memo2[l][sum]=res;
		}
	}
	
}
/*
100 521
10 74
9999999920
 */
