import java.awt.Point;

/**
 * Represents a stupidly simple game of battleship, where the ship takes up one and only one space on the
 * game board, and the user attempts to sink the computer's ship until they win. The computer does not
 * fire back.
 * @author lbosse
 *
 */
public interface Battleship {
	public static enum GridMarker {
		HIT("X"), CHOICE("*"), SHIP("S"), WATER("-");
		
		String mark;
		
		private GridMarker(String mark) {
			this.mark = mark;
		}
	}
	
	/**
	 * Clears out the game board of dimension <code>dim</code>/<code>dim</code> and starts the game again.
	 */
	public void newGame(int dim);
	
	/**
	 * Checks whether a given coordinate is a valid move for the user. If it is, it returns true and makes
	 * the move. Else, returns false.
	 * @param x The x-coordinate of the coordinate the user is choosing
	 * @param y the y-coordinate of the coordinate the user is choosing
	 * @return <code>true</code> if a move is valid, <code>false</code> otherwise.
	 */
	public boolean choose(int x, int y);
	
	/**
	 * Checks if the user has won yet.
	 * @return <code>true</code> if the user has one, <code>false</code> otherwise. 
	 */
	public boolean won();
	
	/**
	 * Returns a user's list of moves as <code>java.awt.Point</code>s.
	 * @return a list of <code>Point</code>s representing the user's moves.
	 */
	public Point[] getMoves();
}
