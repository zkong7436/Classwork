package Arrays;

public class AdvancedArrayMethods {

	static int[] arrays;
	
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e","f","g","h"};
		swap(array,0,array.length-1);
		
//		int[] array;
//		array = new int[100];
//		int[] someArray = new int[50];
//		someArray = array;
//		System.out.println(someArray.length);
//		someArray[30]=1;
//		System.out.println(array[30]);
		
		/*arrays = new int[100];
		int[] someArray = new int[50];
		methodA(someArray);*/
	}

	private static void swap(String[] a, int i, int j) {
		String placeholder = a[i];
		a[i] = a[j];
		a[j] = placeholder;
		for(int e=0; e<a.length; e++){
			System.out.println(a[e]);
		}
	}

	private static void methodA(int[] a) {
		int[] newArray = new int[a.length];
		
	}

	public static void copyArray(int[] original, int[] target){
		//they are pass by values
		if(original.length == target.length){
			for(int i=0; i<original.length;i++){
				target[i] = original[i];
			}
		}else{
			//print an "error" message
			System.out.println("ERROR: tried to copy arrays of two different lengths");
		}
	}
}
