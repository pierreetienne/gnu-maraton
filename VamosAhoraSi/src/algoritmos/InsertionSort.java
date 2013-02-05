package algoritmos;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args ) throws Exception {
		System.out.println(Arrays.toString(insertionSort(new int[]{-1 ,5,1,9,8,9,0,7})));
	}
	
	/**
	 * @complejidad O(n^2)
	 * @param arr Arreglo a ordenar
	 * @return arr Arreglo ordenado
	 */
	public static int[] insertionSort(int[] arr){
		for(int j=2;j<arr.length;++j){
			int key=arr[j];
			int i=j-1;
			while(i>0 && arr[i]>key){
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		return arr;
	}
}
