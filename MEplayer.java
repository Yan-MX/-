import java.util.List;

public class MEplayer extends Player{

	public MEplayer(Place s, Terminal terminal, List<MEplace> places, List<Item> g1, String n) {
		super(s, terminal, places, g1, n);
		
	}
	public MEplayer(Place s, Robot r, List<MEplace> l, List<Item> g1, String n) {
		super(s, r, l, g1, n);
		
	}
	public void MoveR() {//need another round of interaction with terminal or robot
		int z = ((Robot) g).askForCommand("Where do you want to move next?",((MEplace)place).neigh);
		place = ((MEplace)place).moveForward(lp,z);
		String [] s = {"sell","take","neither","both"};
		int y = ((Robot) g).askForCommand("Do you want to sell or take one item from the chest?",s);
		move(y);
	}
	public void MoveT() {
		System.out.print("---"+name);
		int z = ((Terminal) g).askForCommand(", Where do you want to move next?",((MEplace)place).neigh);
		place = ((MEplace)place).moveForward(lp,z);
		String [] s = {"sell","take","neither","both"};
		System.out.print("---"+name);
		int y= ((Terminal) g).askForCommand(", Do you want to sell or take one item from the chest?",s);
		move(y);
	}

}
