import java.awt.Point;
import java.util.Random;

public class BattleshipGame implements Battleship {
	private GridMarker[][] grid;
	private int count;
	private Point[] moves;
	private boolean winner;
	
	public BattleshipGame(int dim) {
		newGame(dim);
	}

	@Override
	public void newGame(int dim) {
		count = 0;
		moves = new Point[dim];
		grid = new GridMarker[dim][dim];
		winner = false;
		
		// Initialize game grid
		Random rand = new Random();
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				grid[i][j] = GridMarker.WATER;
			}
		}
		
		// Randomly place ship on board
		grid[rand.nextInt(dim)][rand.nextInt(dim)] = GridMarker.SHIP;
	}

	@Override
	public boolean choose(int x, int y) {
		if ((x < grid.length && x > 0) && (y < grid.length && y > 0)) {
			if (grid[x][y] == GridMarker.SHIP) {
				grid[x][y] = GridMarker.HIT;
				winner = true;
				moves[count] = new Point(x, y);
				count++;
				return true;
			} else if (grid[x][y] != GridMarker.WATER) {
				return false;
			} else {
				grid[x][y] = GridMarker.CHOICE;
				moves[count] = new Point(x, y);
				count++;				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean won() {
		return winner;
	}

	@Override
	public Point[] getMoves() {
		Point[] myMoves = new Point[count];
		for (int i = 0; i < count; i++) {
			myMoves[i] = moves[i];
		}
		return myMoves;
	}
	
	@Override
	public String toString() {
		String out = "Where are they hiding?...\n";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				out += (grid[i][j].mark + " ");
			}
			out += "\n";
		}
		return out;
	}

}
