package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class King extends ChessPiece {

	public King(Board board, Colors color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
