package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student joseph = new Junior("Joseph");
		Student jordan = new Freshman("Jordan");
		
		
		jillian.talk();
		joseph.talk();
		((Freshman)jordan).age();
	
	}

}
