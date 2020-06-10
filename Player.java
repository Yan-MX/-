import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Player {
	Place place;
	TreasureChest backpack= new TreasureChest();
	Object g;
	double fortune= 0;
	List<MEplace> lp;
	List<Item> items;
	String name;
	//overloading 
	public Player(Place s, Robot r, List<MEplace> l, List<Item> g1, String n) {
		place= s;
		 g = r;	
		lp =l;
		name = n;
		items =g1;
		setBackPack();			
	}
	public Player(Place s, Terminal r, List<MEplace> l,List<Item> g1, String n) {
		place = s;
		name= n;
		g = r;
		lp= l;
		items =g1;
		setBackPack();		
	}
	public void setBackPack() {
		backpack.setItems(items);
		for(Item i: backpack.chest) {
			fortune+=i.value;	
		}
		System.out.print(name+ "'s initial fortune: "+ fortune+ " and backpack includes: ");
		for(Item i: backpack.chest) {
			System.out.print((i.name)+" ");	
		}
		System.out.println();
	}
	
	public void newMoveR() {
		place = place.moveForward(lp);
		String [] s = {"sell","take","neither","both"};
		int y = ((Robot) g).askForCommand("Do you want to sell or take one item from the chest?",s);
		move(y);
	}
	public void newMoveT() {
		place = place.moveForward(lp);
		String [] s = {"sell","take","neither","both"};
		System.out.print("---"+name);
		int y= ((Terminal) g).askForCommand(", Do you want to sell or take one item from the chest?",s);
		move(y);
	}
	public void move(int y) {
		switch (y) {
		case 0:// player sell one item to the treasure chest in this place
			Item b = backpack.remove();
			fortune-=b.value;
			System.out.print("Selling "+b.name+ ", lose fortune- "+b.value);
			double c= place.chest.add(b);
			System.out.println(" Receive money from Treasure Chest, gain fortune+ "+c);
			fortune+=c;
			System.out.println("backpack size: "+ backpack.chest.size());
			break;
		case 1:
			 Item a = place.chest.remove();
			 System.out.println("Gain a new item "+ a.name+", gain fortune+ "+a.value);
			 fortune+= a.value;
			 backpack.add(a);
			 System.out.println("backpack size: "+ backpack.chest.size());
			break;
		case 3:
			Item b1 = backpack.remove();
			fortune-=b1.value;
			System.out.print("Selling "+b1.name+ ", lose fortune- "+b1.value);
			double c1= place.chest.add(b1);
			System.out.println(" Receive money from Treasure Chest, gain fortune+ "+c1);
			fortune+=c1;
			 Item a2 = place.chest.remove();
			 System.out.println("Gain a new item "+ a2.name+", gain fortune+ "+a2.value);
			 fortune+= a2.value;
			 backpack.add(a2);
			 System.out.println("backpack size: "+ backpack.chest.size());
			break;
		default:
			break;
		}
		
	}
}
