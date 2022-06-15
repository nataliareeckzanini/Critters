// Student: Natalia Reeck Zanini

import java.awt.*;

public class Dog extends Critter {

	public Dog() {
		
	}
	
	public String toString() {
		return "D";
	}
	
	public Color getColor() {
		return Color.BLACK;
	}
	
	public Action getMove(CritterInfo info) {
		System.out.println(info.getInfectCount() + "  Dog");
		double number = Math.random();
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
			return Action.LEFT;
		} else {
			return Action.HOP;
		}
	}
}