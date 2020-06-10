import java.util.List;

public class Place {
	String m;
	TreasureChest chest;
	int index;
	int x;
	int y;
	int rownum = 8;
	int colnum = 5;		

	public Place(String p, int x1) {
		m=p;
		placeChest();
		index = x1;
		x = index %rownum;
		y = index/rownum;
	}
	public  void placeChest(){
		chest= new TreasureChest();
	}
	public TreasureChest getChest() {
		return chest;
	}
	public Place moveForward(List<MEplace> lp) {//not so sure
		int index = lp.indexOf(this);
		int newindex = (index+1)%lp.size();
		System.out.println("*****moves to point "+newindex+"."+lp.get(newindex).m);
		return lp.get((index+1)%lp.size());		
	}

}
