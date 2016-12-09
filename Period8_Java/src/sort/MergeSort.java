package sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args){
		int[] arrayToSort={133,0,-5,31,12,12,2,1};
		System.out.println("- - - MERGE SORT - - -");
		System.out.println(Arrays.toString(mergeSort(arrayToSort)));
		
	}
	
	public static int[] mergeSort(int[] array){
		if(array.length ==1) return array;
		else{
			int[] first = new int[array.length/2];
			int[] second = new int[array.length - first.length];
			for(int i=0; i<first.length;i++){
				first[i]=array[i];
			}
			for(int j=0;j<second.length;j++){
				second[j]=array[j+first.length];
			}
			return merge(mergeSort(first),mergeSort(second));
		}
	}
	public static int[] merge(int[] a, int[] b){
		int[] array= new int[a.length + b.length];
		int i =0;
		int j =0;
		int z =0;
		while(i<a.length && j<b.length){//i<a.length && j<b.length
			if(a[i]<=b[j])
			{
				array[z]=a[i];
				i++;
			}
			else{
				array[z]=b[j];
				j++;
			}
			z++;
		}
		while(i<a.length){
			array[z]=a[i];
			i++;
			z++;
		}
		while(j<b.length){
			array[z]=b[j];
			j++;
			z++;
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
}
