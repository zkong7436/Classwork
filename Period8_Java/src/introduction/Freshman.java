package introduction;

public class Freshman extends Student {

	public Freshman(String name) {
		super(name);
	}

	public void age() {
		super.talk();
		System.out.println("...and I am 15 years old.");
	}

}
