package sort;

public class RecursionIntro {
	
	
	public static void main(String[] args) {
		int n = 100;
		System.out.println("The "+n+"to Fibonacci is "+fibonacci(n));
		
//		hanoiSolution(4, "A", "B", "C");
//		
//		System.out.println("Using a for loop:");
//		for(int i=0; i<5; i++){
//			System.out.println("Hello world! x"+i);
//		}
//		
//		System.out.println("Without using a for loop:");
//		forLoop(5, new Action() {
//			
//			private int value = 0;
//			public void act() {
//				System.out.println("Hello world! x"+value);
//				value++;
//			}
//		});

	}
	
	private static int fibonacci(int n) {
		if(n<+1){
			return 1;
		}else{
			int previous = fibonacci(n-1);
			print("Before we find fibonacci "+n+" we need to find fibonacci "+(n-1)+", which is "+previous);
			int beforePrevious = fibonacci(n-2);
			return previous + beforePrevious;
		}
	}

	public static void forLoop(int i, Action action){
		if(i <= 0){
			//base case
			return;
		}else{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1, action);
		}
	}
	
	public static int factorial(int n){
		if(n > 1){
			return n*factorial(n-1);
		}
			return 1;
		
		
//		int product = 1;
//		for(int i=n; i>0; i--){
//			product*=i;
//		}
//		return product;
	}
	
	public static int count = 1;
	public static void print(String s){
		System.out.println("Move #"+count+":"+s);
		count++;
	}
	
	public static void hanoiSolution(int discs, String startPeg, String midPeg, String endPeg){
		if(discs <= 1){
			System.out.println("Move "+startPeg+" to "+endPeg);
		}else{
			System.out.println("In order to move "+discs+" over to peg "+endPeg+", we must move "+(discs-1)+" over to peg "+midPeg+" first.");
			hanoiSolution(discs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(discs-1, midPeg, startPeg, endPeg);
		}
	}

}
