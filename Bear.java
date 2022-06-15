// Student: Natalia Reeck Zanini

import java.awt.*;

public class Bear extends Critter {

	private int count;
	private boolean polar;
	
	public Bear(boolean polar) {
		this.count = 0;
		this.polar = polar;
	}

	public Color getColor() {
		if (this.polar) {
			return Color.WHITE;
		} else {
			return Color.BLACK;
		}
	}
	
	public String toString() {
		this.count = this.count + 1;
		if (count % 2 == 1) {
			return "/";
		} else {
			return "\\";
		}
	}
	
	public Action getMove(CritterInfo info) {
		System.out.println(info.getInfectCount() + "  Bear  ");
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else {
			return Action.LEFT;
		}
	}
}