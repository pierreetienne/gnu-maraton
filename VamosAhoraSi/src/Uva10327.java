import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Uva10327 {

	static int numSwaps;
	static void mergeSort(int[] arr, int[] arrTmp, int pi, int pf) {
		if (pf<=pi) return;
		int m=(pi+pf)/2+1,i,j,k; mergeSort(arr,arrTmp,pi,m-1); mergeSort(arr,arrTmp,m,pf);
		for (i=pi,j=m,k=pi; i<=m-1&&j<=pf; k++) {if (arr[i]<=arr[j]) arrTmp[k]=arr[i++]; else {numSwaps+=j-k; arrTmp[k]=arr[j++];}};
		for (; i<=m-1; k++,i++) arrTmp[k]=arr[i];
		for (k=pi; k<j; k++) arr[k]=arrTmp[k];
	}	

	public static void main(String[] args)throws Exception  {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		for(;in.hasNext();){
			int[] m = new int[in.nextInt()];
			for(int i=0;i<m.length;++i)
				m[i] = in.nextInt();
			numSwaps=0;
			mergeSort(m, new int[m.length], 0, m.length-1);
			sb.append("Minimum exchange operations : "+numSwaps+"\n");
		}
		System.out.print(new String(sb));

	}

}
