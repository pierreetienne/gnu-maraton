import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;


public class Uva195 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		while(N-->0){
			TreeSet<String> set = new TreeSet<String>();
			char[]ee =  in.readLine().toCharArray();
			for(int i=1;i<ee.length;++i){
				int val = Character.toLowerCase(ee[i]);
				int valX = Character.toLowerCase(ee[i-1]);
				if(val<valX){
					char x = ee[i];
					ee[i]=ee[i-1];
					ee[i-1]=x;
				}else if(val==valX && Character.isUpperCase(ee[i])){
					char x = ee[i];
					ee[i]=ee[i-1];
					ee[i-1]=x;
				}
			}
			do{
				set.add(new String(ee));
			}while((ee=next_permutation(ee))!=null);
			for(String x : set)
				sb.append(x+"\n");
		}
		System.out.print(new String(sb));
	}

	static char[] next_permutation(char[] arr){
		int I = -1; char min = '\0';
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean ws = false; min = Character.MAX_VALUE;
			for(int j = arr.length - 1; j > i && !ws; j--){
				min = arr[j] > arr[i]?(char)Math.min(arr[j], min):min;
				if(ws = arr[i] < arr[j]) I = i;
			}
			if(ws)break;
		}
		if(I == -1)return null;
		char[] res = new char[arr.length];char[] temp = new char[arr.length - I];
		for (int j = I; j < arr.length; j++) temp[j - I] = arr[j];
		Arrays.sort(temp); boolean ws = false;
		for (int j = 0, i = 0; j < res.length; j++)
			if(j <= I)res[j] = j < I?arr[j]:min;
			else if(!ws && temp[i]==min){i++; res[j]=temp[i++]; ws=true;}
			else res[j] = temp[i++];
		return res;
	}


}
