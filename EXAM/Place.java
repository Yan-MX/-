import java.util.List;

public class Place {
	String m;
	TreasureChest chest;

	public Place(String p) {
		m=p;
		placeChest();
	}
	public  void placeChest(){
		chest= new TreasureChest();
	}
	public TreasureChest getChest() {
		return chest;
	}
	public Place moveForward(List<Place> l) {//not so sure
		int index = l.indexOf(this);
		System.out.println("moves to "+(index+1)%l.size());
		return l.get((index+1)%l.size());		
	}

}
