import java.util.Scanner;

public class Terminal implements UserInterface {
	Scanner s;
// this Scanner a should be created in the main method before create a Terminal, it should have system.in
	public Terminal(Scanner a) {
		s= a;
	}
	public void giveStatus(String status) {
		System.out.println(status);		
	}

	public int askForCommand(String question, String[] options) {
		System.out.println(question);
		System.out.print("---");
		for (int i = 0; i<options.length; i++) {
			System.out.print(i+"."+options[i]+" ");
		}
		System.out.println("Please enter an index of the options:");
		int a= 99;
		try {
			 a = Integer.parseInt(s.nextLine());
		}catch( Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("User A choose option "+a+" "+ options[a]);
		return a;
	}

}
