
public class Item {
	String name;
	double value;
	
	public Item(String string, String string2) {
		name = string;
		value = Double.parseDouble(string2);
	}
	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}


}
