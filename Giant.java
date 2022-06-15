// Student: Natalia Reeck Zanini

import java.awt.*;

public class Giant extends Critter {
	
	private int count;
	private String previousName;
	private final String[] giantNames = {"fee", "fie", "foe", "fum"};
	private int giantIndex;

	public Giant() {
		this.count = 0;
		this.giantIndex = 0;
	}
	
	public Color getColor() {
		return Color.GRAY;
	}
	
	public String toString() {
		this.count = this.count + 1;
		if ((this.count - 1) % 6 == 0) {
			if (this.giantIndex == 4) {
				this.giantIndex = 0;
			}
			this.giantIndex = this.giantIndex + 1;
			return giantNames[giantIndex - 1].toString();
		} else {
			this.previousName = giantNames[giantIndex - 1];
		}
		return this.previousName;
	}
	
	public Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() != Neighbor.EMPTY) {
			return Action.RIGHT;
		} else {
			return Action.HOP;
		}
	}
}