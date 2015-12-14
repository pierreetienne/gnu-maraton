

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//Accepted
public class Uva291 {
	
	static boolean[] m = new boolean[5];
	static Set<String> lista ;
	static boolean mAdy[][];
	static void f(String c, int actual,int anterior){
		if(c.length()==9 && valido(c)){
			String s = "";
			for(int i=0;i<c.length();++i){
				s+=Integer.parseInt(c.charAt(i)+"")+1;
			}
			lista.add(s);
		}else if(c.length()<9){
			for(int i=0;i<mAdy.length;++i){
				if(mAdy[actual][i]&& i != actual )
					f(c+""+actual, i,actual);
			}
		}
	}
	
	static boolean valido(String x){
		Arrays.fill(m,false);
			boolean t[][] = new boolean[5][5];
			for(int i=1;i<x.length();++i){
				if(t[Integer.parseInt(x.charAt(i-1)+"")][Integer.parseInt(x.charAt(i)+"")])
					return false;
				t[Integer.parseInt(x.charAt(i-1)+"")][Integer.parseInt(x.charAt(i)+"")]=true;
			}
			if(x.length()==9){
				for(int i=0;i<t.length;i++){
					for(int j=0;j<t.length;++j){
						if(t[i][j]!= mAdy[i][j] && t[j][i]!=mAdy[i][j])
							return false;
					}
				}
			}
		return true;
	}
	
	public static void main(String[] args) {
		mAdy = new boolean[5][5];
		mAdy[0][1]=mAdy[1][0]=true;
		mAdy[0][2]=mAdy[2][0]=true;
		mAdy[0][4]=mAdy[4][0]=true;
		mAdy[1][2]=mAdy[2][1]=true;
		mAdy[1][4]=mAdy[4][1]=true;
		mAdy[2][4]=mAdy[4][2]=true;
		mAdy[2][3]=mAdy[3][2]=true;
		mAdy[3][4]=mAdy[4][3]=true;
 	    lista = new HashSet<String>();
		
 	    for(int i=0;i<mAdy.length;++i){
 	    	if(mAdy[0][i])
 	    		f("0", i,0);
 	    }
 	    
 	    ArrayList<String> a = new ArrayList<String>();
 	    for(String x :lista){
 	    	a.add(x);
 	    }
 	    Collections.sort(a);
 	    for(String x :a)
	    	System.out.println(x);
	    
 
	}

}
