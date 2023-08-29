package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class Rook extends ChessPiece {

	public Rook(Board board, Colors color) {
		super(board, color);
		
	}
		@Override
		public String toString() {
			return "R";
		}
}
