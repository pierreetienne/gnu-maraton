import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

//No
public class Uva11084 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		TreeMap<String,Integer> vals = new TreeMap<String, Integer>();
		while(N-->0){
			StringTokenizer st = new StringTokenizer(in.readLine());
			String sour =st.nextToken(); 
			char[] arr = sour.toCharArray();
			int v = Integer.parseInt(st.nextToken());
			int cont = 0;
			Arrays.sort(arr);
			sour = new String(arr);
			long s = Long.parseLong(sour);
			if(vals.containsKey(s+"-"+v))
				sb.append(vals.get(s+"-"+v)).append("\n");
			else{
				do{
					long val = Long.parseLong(new String(arr));
					if(val%v==0)cont++;
				}while((arr=next_permutation(arr))!= null);
				vals.put(s+"-"+v, cont);
				sb.append(cont).append("\n");
			}
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
