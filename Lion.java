// Student: Natalia Reeck Zanini

import java.awt.*;

public class Lion extends Critter {
	

	private int count;
	private Color initialColor;
	
	
	public Lion() {
		this.count = 0;
	}
	
	public Color getColor() {
		this.count = this.count + 1;
		if ((this.count - 1) % 3 == 0) {
			Color randomColor = getRandomColor();
			this.initialColor = randomColor;
			return randomColor;
		} else {
			return this.initialColor;
		}
	}

	public String toString() {
		return "L";
	}

	public Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
			return Action.LEFT;
		} else if (info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		} else {
			return Action.HOP;
		}
	}
	
	private Color getRandomColor() {
		double number = Math.random();
		if (number < (1.0 / 3)) {
			return Color.RED;
		} else if (number > (2.0 / 3)) {
			return Color.GREEN;
		} else {
			return Color.BLUE;
		}
	}
}