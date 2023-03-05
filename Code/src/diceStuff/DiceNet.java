package diceStuff;

public class DiceNet {
	private int numSides;
	private int polyNum;
	private boolean[][] net;
	
	public DiceNet(int sides, int poly) {
		this.numSides = sides;
		this.polyNum = poly;
		this.net = new boolean[numSides][numSides];
	}
	/**
	 * Constraints go here
	 * - number pairs must be on opposite sides of die, {numSides}>=6
	 * - each node must be connected to exactly {polyNum} other nodes
	 * - this should be a connected graph
	 */
	public boolean isValidNet() {
		if (numSides >= 6 && numSides % 2 == 0) {
			for (int i = 0; i < numSides/polyNum + 1; i++) {
				
			}
		}
	}
}
