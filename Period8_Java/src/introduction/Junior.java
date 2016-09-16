package introduction;

public class Junior extends Student {

	public Junior(String name) {
		super(name);
	}

	public void talk(){
		super.talk();
		System.out.println("... and I'm in 11th grade.");
	}
}
