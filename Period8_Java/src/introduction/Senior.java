package introduction;

public class Senior extends Student {

	public Senior(String name) {
		super(name); //Construct a Student fist
		
	}

	public void talk(){
		super.talk();
		System.out.println("... and I am a senior.");
	}
}
