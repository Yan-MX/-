
import java.util.Scanner;


public class Game {
	public static String result;
	
	public static void main(String[] args) {
				

		Scanner a = new Scanner(System.in);
		ChooseTerrain(a);
		a.close();
	}
		public static void MultiTerrain(Scanner a) {
		Terrain terrain = new METerrain("steder.txt");
		Place start = terrain.getStart();
		System.out.println("*****Starting point "+ terrain.places.indexOf(start)+"."+start.m);
		MEplayer robot = new MEplayer( start, new Robot(),terrain.places, terrain.items,"Robot");
		MEplayer user1 = new MEplayer( start, new Terminal(a),terrain.places,terrain.items,"Peter Rabbit");
		int move = 3;
		System.out.println();
		
		System.out.println("Game starts!");
		for(int i = 0;i<move;i++) {		
			System.out.println("Round "+(i+1));
			user1.MoveT();
			System.out.println();
			robot.MoveR();
			System.out.println();
			System.out.println();
		
		}
		String s1 = "Robot's fortune: "+robot.fortune;
		String s2= user1.name+"'s forture: "+user1.fortune;
		System.out.println(s2);
		System.out.println(s1);
		}	
		public static void simpleTerrain(Scanner a) {
		Terrain terrain = new Terrain("steder.txt");
		Place start = terrain.getStart();
		System.out.println("*****Starting point "+ terrain.places.indexOf(start)+"."+start.m);
		//Player robot = new Player( start, new Robot(),terrain.places, terrain.items,"Robot");
		Player user1 = new Player( start, new Terminal(new Scanner(System.in)),terrain.places,terrain.items,"Peter Rabbit");
		int move = 3;
		System.out.println();
		
		System.out.println("Game starts!");
		for(int i = 0;i<move;i++) {		
			System.out.println("Your turn");
			user1.newMoveT();
			System.out.println();
			System.out.println("robots turn");
			//robot.newMoveR();
			System.out.println();
			System.out.println();
		
		}
		//String s1 = "Robot's fortune: "+robot.fortune;
		String s2= user1.name+"'s forture: "+user1.fortune;
		System.out.println(s2);
		//System.out.println(s1);
		}
		public static void ChooseTerrain(Scanner s){
		System.out.println("Do you want to use a terrain with multiple exits? \n enter y or n (y means yes, n means no)");
		String m = s.nextLine();
		if(m.equals("y")) {
			MultiTerrain(s);
		}else if(m.equals("n")) {
			simpleTerrain(s);
		}else {
			ChooseTerrain(s);
		}
	}
	
	 
}

