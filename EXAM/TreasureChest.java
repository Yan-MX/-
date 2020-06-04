import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TreasureChest {
	List<Item> chest = new LinkedList<Item>();
	int num = 3; //numbers of items in each treasure chest
	public TreasureChest() {		
	}
	public void setItems(List<Item> items) {
		for(int i= 0;i< num;i++) {
			Random r = new Random();//randomly select 3 items to add in the chest
			int k = r.nextInt(items.size());
			chest.add(items.get(k));
		}
	}
	public Item remove() {
		Random r = new Random();//randomly select one to remove
		int k = r.nextInt(chest.size());
		Item m = chest.get(k);
		chest.remove(k);
		return m;
	}
	public double add(Item t) {
		chest.add(t);
		Random r = new Random();//randomly select one to remove
		int k = r.nextInt(100)+50;
		return t.value*k*0.01;	
	}
	
}
