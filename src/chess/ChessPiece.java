package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	private Colors color;

	public ChessPiece(Board board, Colors color) {
		super(board);
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	
	
	
}
