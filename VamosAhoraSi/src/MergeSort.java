

public class MergeSort {

	public static void main(String[] a)
	{
		System.out.println(new MergeSort().howManyComparisons(new int[]{1, 2, 3, 4}));
	}

	public int howManyComparisons(int[] numbers){
		mergeSort(numbers, new int[numbers.length], 0, numbers.length-1);
		return numSwaps;
	}	
	
	public int numSwaps=0;
	
	public void mergeSort(int[] arr, int[] arrTmp, int pi, int pf) 
	{
		if (pf<=pi) return;
		int m=(pi+pf)/2+1,i,j,k; mergeSort(arr,arrTmp,pi,m-1); mergeSort(arr,arrTmp,m,pf);
		for (i=pi,j=m,k=pi; i<=m-1&&j<=pf; k++) {
			arrTmp[k]=arr[i]<=arr[j]?arr[i++]:arr[j++];
			numSwaps++;
		}
		for (; i<=m-1; k++,i++) arrTmp[k]=arr[i];
		for (k=pi; k<j; k++) arr[k]=arrTmp[k];
	}
}
