import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Terrain terrain = new Terrain("steder.txt");
		Place start = terrain.getStart();
		System.out.println("startinf point "+ terrain.places.indexOf(start));
		Player robot = new Player( start, new Robot(),terrain.places, terrain.items,"Robot");
		Player user1 = new Player( start, new Terminal(new Scanner(System.in)),terrain.places,terrain.items,"User A");
		int move = 3;
		System.out.println("Game starts!");
		for(int i = 0;i<move;i++) {		
			user1.newMoveT();
			robot.newMoveR();
			System.out.println();
		}
		System.out.println("Robot's fortune: "+robot.fortune);
		System.out.println("User1's forture: "+user1.fortune);

	}

}
