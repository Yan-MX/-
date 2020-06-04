import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("     This is game between Peter Rabit(You) and Robot, \n     Each player have 3 moves and can choose sell, take or neither in each move \n     If you choose to sell, you will lose the value of the item in your fortune and \n     And gain a random amount of money(50% to 150% of the item value) from the Treasure box \n     If you take a new item, you will receive the item in your backpack and gain the value of the item \n     If you choose neither, fortune stays the same");
		Terrain terrain = new Terrain("steder.txt");
		Place start = terrain.getStart();
		System.out.println("*****Starting point "+ terrain.places.indexOf(start)+"."+start.m);
		Player robot = new Player( start, new Robot(),terrain.places, terrain.items,"Robot");
		Player user1 = new Player( start, new Terminal(new Scanner(System.in)),terrain.places,terrain.items,"Peter Rabbit");
		int move = 3;
		System.out.println();
		System.out.println("Game starts!");
		for(int i = 0;i<move;i++) {		
			user1.newMoveT();
			System.out.println();
			robot.newMoveR();
			System.out.println();
			System.out.println();
		System.out.println("================================================================");
		}
		System.out.println("Robot's fortune: "+robot.fortune);
		System.out.println(user1.name+"'s forture: "+user1.fortune);
		if(robot.fortune>user1.fortune) {
			System.out.println("The winner is Robot!");
		}else if(robot.fortune==user1.fortune) {
			System.out.println("It is a tie!");
		}else {
			System.out.println("The winner is "+ user1.name );
		}

	}

}
