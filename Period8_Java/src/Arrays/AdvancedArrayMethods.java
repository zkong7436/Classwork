package Arrays;

public class AdvancedArrayMethods {

	static int[] arrays;
	
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e","f","g","h"};
		shuffle(array);
		//swap(array,0,array.length-1);
		
 
	}
	
	public static int longestSharedSequences(int[] array1, int[] array2){
		int max = 0;
		int count = 0;
		
		for(int seqStart = 0; seqStart < array1.length; seqStart++){
			int seqEnd = seqStart;
			int[] seq = getSquence(seqStart, seqEnd, array1);
			if(checkSequence(seq, array2)){
				count++;
				if(count>max){
					max = count;
				}
			}
		}
		count = 0;
	}
	
	
	//example:
	//arr = {0,3,5,3,4}
	//seq = {3,4}
	//returns true if sequence is found inside array2
	private static boolean checkSequence(int[] seq, int[] arr) {
		A: for(int i=0; i<arr.length; i++){
			//j checks every element in seq
			B: for(int j=0; j<seq.length; j++){
				if(j+i < arr.length && seq[j]!=arr[j+i]){
					//breaks out of innermost for loop unless particular for loop is specified
					break;
				}else if(j==seq.length-1){
					return true;
				}
			}
		}
		return false;
	}

	//returns a sub-array containing the elements
	//in array1 from seqStart to seqEnd
	private static int[] getSquence(int seqStart, int seqEnd, int[] array1){
		
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
