import java.util.LinkedList;
import java.util.List;

public class MEplace extends Place {
	Place Left, Right,Up, Down;
	List<Place> neighbour = new LinkedList<Place>();
	String[] neigh;
	
	public MEplace(String p, int index) {
		super(p, index);
	}
	public void updateNeighbour(List<MEplace> places) {
		List<String> m = new LinkedList<String>();
		if (x>0) {
			Left = places.get(this.index-1);
			neighbour.add(Left);
			m.add("Left");
		}
		if (x<this.rownum-1) {
			Right = places.get(this.index+1);
			neighbour.add(Right);
			m.add("Right");
		}
		if (y>0) {
			Up = places.get(this.index-rownum);
			neighbour.add(Up);
			m.add("Up");
		}
		if (y<colnum-1) {
			Down = places.get(this.index+rownum);
			neighbour.add(Down);
			m.add("Down");
		}
		neigh = new String[m.size()];
		m.toArray(neigh);
		
	}
	public Place moveForward(List<MEplace> lp, int a) {
		System.out.println("*****moves to point"+neighbour.get(a).index+". "+neighbour.get(a).m);
		return this.neighbour.get(a);
	}
	
		
	
}
