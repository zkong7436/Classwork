package Arrays;

/*
 * primitive type[]
 * 	"already" in the system, start as zero
 * 	cannot mix types
 * 
 * Object[]
 * 	unless initialized, start as null
 * 	different types of objects in an array of common superclass
 */

public class ArraysPractice {

	static boolean[] boos3;
	
	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		//printInt(fiftyNumbers);
		//randomize(fiftyNumbers);
		//printInt(fiftyNumbers);
		rollDice(fiftyNumbers, 2);
		printInt(fiftyNumbers);
		//count each die roll and provide a percentage
		countResult(fiftyNumbers, 2);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime - currentTime)+" ms.");
	}

	private static void countResult(int[] n, int nOfDice) {
		int[] results = new int[nOfDice*6];
		for(int s: n){
			results[s-1]++;
		}
		for(int t=0; t<results.length; t++){
			System.out.println("% for "+(t+1)+": "+results[t]);
		}
	}

	private static void rollDice(int[] n, int nOfDice) {
		for(int i=0; i<n.length; i++){
			n[i] = 0;
			int dice = nOfDice;
			while (dice>0){
				n[i]+=(1+(int)(6*Math.random()));
				dice-=1;
			}
		}
		
	}

	private static void randomize(int[] n) {
		for(int i=0; i<n.length;i++){
			n[i]=(int)(Math.random()*70);
		}
		
	}

	private static void printInt(int[] n) {
		for(int i=0; i<n.length; i++){
			System.out.println(n[i]);
		}
		
	}

	private static void populate(int[] n) {
		for(int i=0; i<n.length; i++){
			n[i]=i+1;
		}
	}

	private void demonstratePassByValue(){
		//how do you time a process
		
		int x = 10;
		increase(x);
		System.out.println(x);
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		someStrings[999] = getSpecialString();
		print(someStrings);
		
		//initializeArray();
	}
	
	private static String getSpecialString() {
		String s = "THIS IS A SPECIAL STRING.";
		return s;
	}

	private static void increase(int i) {
		i++;
		
	}

	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL";
		//this does not change the item itself
	}

	private static void standardPopulate(String[] s) {
		/*int i = 0;
		for(String x: s){
			i++;
			x = "String #"+(i+1);
		}*/
		
		for(int i = 0; i < s.length; i++){
			s[i] = "String #"+(i+1);
		}
		
	}

	private static void print(String[] s){
		for(int i=0; i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	
	public static void initializeArray(){
		//if you want to put different primitive types into an array
				//you must use their wrapper class
			
				//these are two different ways to instantiate an array
				boolean[] boos1 = new boolean[3];
				//this can ONLY be done at the declaration
				//because it sets size AND content
				boolean[] boos2 = {false,false,false};
				
				/**this does NOT work
				//boo3 = [false,false,true];
					this is all that will work
					boos3 = new boolean[3];
				*/
				
				/**2 ways of iterating through an array
				STANDARD FOR LOOP
					- the index is important to keep track of
					- you need to customize the order
				*/
				
				for(int i=0; i<boos1.length; i++){
					System.out.println(boos1[i]);
				}
				
				/**
				 * "FOR - EACH" LOOP
				 * 		-the index is not important
				 * 		-you don't need to customize
				 * 		-automatically assigned a "handle"
				 * 		-faster to write
				 */
				
				for(boolean b: boos1){
					System.out.println(b);
				}
				
				//OBJECT ARRAYS
				String[] someStrings1 = new String[3];
				
//				someStrings1[0] = "a";
//				someStrings1[1] = "b";
//				someStrings1[2] = "c";
				
				String[] someStrings2 = {"a","b","c"};
				
				for(int i = 0; i<someStrings1.length; i++){
					someStrings1[i]= "a new String";
				}
				
				//a loop to print it
				for(String s: someStrings1){
					System.out.println(s);
				}
	}
}
