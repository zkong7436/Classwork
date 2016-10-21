package Arrays;

public class AdvancedArrayMethods {

	static int[] arrays;
	
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e","f","g","h"};
		shuffle(array);
		//swap(array,0,array.length-1);
		

	}

private static void shuffle(String[] a) {
		for(int i=0; i<a.length;i++){
			int random = (int)(Math.random()*6);
			swap(a, i, random);
		}
	}

//	int[] array;
//	array = new int[100];
//	int[] someArray = new int[50];
//	someArray = array;
//	System.out.println(someArray.length);
//	someArray[30]=1;
//	System.out.println(array[30]);
	
	/*arrays = new int[100];
	int[] someArray = new int[50];
	methodA(someArray);*/
	
	private static void swap(Object[] a, int i, int j) {
		Object placeholder = a[i];
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
