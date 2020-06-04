import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Terrain {
	List<Place> places = new LinkedList<Place>();
	public List<Item> items = new LinkedList<Item>();
	Scanner s;

	public Terrain(String filename) {
		initiateItems();
		try {
			s = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (s.hasNextLine()) {
			String p = s.nextLine();
			Place p1 = new Place(p);
			p1.getChest().setItems(items);
			places.add(p1);
		}
		
	}

	public Place getStart() {
		Random ran = new Random();// Instance of random class
		int i = ran.nextInt(places.size());
		return places.get(i);
	}

	public void initiateItems() {
		try {
			s = new Scanner(new File("gjenstander.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (s.hasNextLine()) {
			String[] r = s.nextLine().split(" ");
			Item i = new Item(r[0], r[1]);
			items.add(i);
		}
	}

}
