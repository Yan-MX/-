import java.util.Random;

public class Robot implements UserInterface {

	public Robot() {	
	}
	
	public void giveStatus(String status) {
		System.out.println(status);
	}

	@Override
	public int askForCommand(String question, String[] options) {
		Random ran = new Random();//Instance of random class
		int int_ran = ran.nextInt(options.length);
		System.out.println("[Robot choose "+ int_ran+"."+options[int_ran]+"]");
		return int_ran;
	}
	
}
