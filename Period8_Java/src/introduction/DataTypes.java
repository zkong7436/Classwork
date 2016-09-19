package introduction;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("1) "+5.0/2);
		System.out.println("2) "+(double) 5/2); 
		System.out.println("3) "+5/2);
		System.out.println("5) "+3+5.0/2+5*2);
		System.out.println("6) "+3.0+5/2+5*2);
		System.out.println("8) "+(int)(3.0+5)/(2+5*2));
		
		double d1 = 4.64;
		double d2 = 2.0;
		double d3 = 2.64;
		
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		System.out.println("d3 : "+d3);
		System.out.println("d1 - d2 : "+(d1-d2));
	}

}
